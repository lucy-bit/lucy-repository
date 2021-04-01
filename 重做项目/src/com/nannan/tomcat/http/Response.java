package com.nannan.tomcat.http;

import com.nannan.standard.http.Cookie;
import com.nannan.standard.http.HttpServletResponse;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Response implements HttpServletResponse {
    public int status = 200;
    public final List<Cookie> cookieList;
    public final Map<String, String> headers;
    public final ByteArrayOutputStream bodyOutputStream;
    public final PrintWriter bodyPrintWriter;

    @Override
    public String toString() {
        try {
            bodyPrintWriter.flush();
            bodyOutputStream.flush();
        } catch (IOException exc) {
            exc.printStackTrace(System.out);
        }
        return String.format("Response{%d %s %s}", status, headers, bodyOutputStream.toString());
    }

    public Response() throws UnsupportedEncodingException {
        cookieList = new ArrayList<>();
        headers = new HashMap<>();
        bodyOutputStream = new ByteArrayOutputStream(1024);
        Writer writer = new OutputStreamWriter(bodyOutputStream, "UTF-8");
        bodyPrintWriter = new PrintWriter(writer);
    }

    @Override
    public void addCookie(Cookie cookie) {
        cookieList.add(cookie);
    }

    @Override
    public void sendError(int sc) {
        // TODO
    }

    @Override
    public void sendRedirect(String location) {
        setStatus(307);
        setHeader("Location", location);
    }

    @Override
    public void setHeader(String name, String value) {
        headers.put(name, value);
    }

    @Override
    public void setStatus(int sc) {
        status = sc;
    }

    // 写入响应体（byte）
    @Override
    public OutputStream getOutputStream() throws IOException {
        return bodyOutputStream;
    }

    // 写入响应体（text）
    @Override
    public PrintWriter getWriter() throws IOException {
        return bodyPrintWriter;
    }

    @Override
    public void setContentType(String type) {
        if (type.startsWith("text/")) {
            type = type + "; charset=utf-8";
        }
        setHeader("Content-Type", type);
    }
}
