package com.nannan.tomcat.http;

import com.nannan.standard.http.Cookie;
import com.nannan.standard.http.HttpServletRequest;
import com.nannan.standard.http.HttpSession;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Request implements HttpServletRequest {
    private final String method;
    private final String requestURI;
    private final String contextPath;
    private final String servletPath;
    private final Map<String, String> parameters;
    private final Map<String, String> headers;
    private final List<Cookie> cookieList;
    public HttpSessionImpl session = null;

    @Override
    public String toString() {
        return String.format("Request{%s %s %s %s %s}", method, requestURI, parameters, headers, session);
    }

    public Request(String method, String requestURI, String contextPath, String servletPath, Map<String, String> parameters, Map<String, String> headers, List<Cookie> cookieList) throws IOException, ClassNotFoundException {
        this.method = method;
        this.requestURI = requestURI;
        this.contextPath = contextPath;
        this.servletPath = servletPath;
        this.parameters = parameters;
        this.headers = headers;
        this.cookieList = cookieList;
        for (Cookie cookie : cookieList) {
            if (cookie.getName().equals("session-id")) {
                String sessionId = cookie.getValue();
                session = new HttpSessionImpl(sessionId);
                break;
            }
        }
    }

    @Override
    public Cookie[] getCookies() {
        return cookieList.toArray(new Cookie[0]);
    }

    @Override
    public String getHeader(String name) {
        return headers.get(name);
    }

    @Override
    public String getMethod() {
        return method;
    }

    @Override
    public String getContextPath() {
        return contextPath;
    }

    @Override
    public String getServletPath() {
        return servletPath;
    }

    @Override
    public String getRequestURI() {
        return requestURI;
    }

    @Override
    public HttpSession getSession() {
        if (session != null) {
            return session;
        }

        return new HttpSessionImpl();
    }

    @Override
    public String getParameter(String name) {
        return parameters.get(name);
    }
}
