package com.nannan.tomcat.http;

import com.nannan.standard.http.Cookie;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.util.*;

public class HttpRequestParser {
    public Request parse(InputStream socketInputStream) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(socketInputStream, "UTF-8");

        String method = scanner.next().toUpperCase();
        String path = scanner.next();
        Map<String, String> parameters = new HashMap<>();
        String requestURI = path;
        int i = path.indexOf("?");
        if (i != -1) {
            requestURI = path.substring(0, i);
            String queryString = path.substring(i + 1);
            for (String kv : queryString.split("&")) {
                String[] kvParts = kv.split("=");
                String name = URLDecoder.decode(kvParts[0].trim(), "UTF-8");
                String value = URLDecoder.decode(kvParts[1].trim(), "UTF-8");
                parameters.put(name, value);
            }
        }
        int j = requestURI.indexOf('/', 1);
        String contextPath = "/";
        String servletPath = requestURI;
        if (j != -1) {
            contextPath = requestURI.substring(1, j);
            servletPath = requestURI.substring(j);
        }

        String version = scanner.nextLine();

        Map<String, String> headers = new HashMap<>();
        List<Cookie> cookieList = new ArrayList<>();

        String headerLine;
        while (scanner.hasNextLine() && !(headerLine = scanner.nextLine().trim()).isEmpty()) {
            String[] parts = headerLine.split(":");
            String name = parts[0].trim().toLowerCase();
            String value = parts[1].trim();
            headers.put(name, value);

            if (name.equals("cookie")) {
                String[] kvParts = value.split(";");
                for (String kvPart : kvParts) {
                    if (kvPart.trim().isEmpty()) {
                        continue;
                    }

                    String[] split = kvPart.split("=");
                    String cookieName = split[0].trim();
                    String cookieValue = split[1].trim();
                    Cookie cookie = new Cookie(cookieName, cookieValue);
                    cookieList.add(cookie);
                }
            }
        }

        return new Request(method, requestURI, contextPath, servletPath, parameters, headers, cookieList);
    }
}
