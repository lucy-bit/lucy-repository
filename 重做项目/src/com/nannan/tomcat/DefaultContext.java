package com.nannan.tomcat;

import com.nannan.standard.Servlet;

public class DefaultContext extends Context {
    public DefaultContext(ConfigReader reader) {
        super(reader, "/");
    }

    @Override
    public Servlet get(String servletPath) {
        return HttpServer.notFoundServlet;
    }
}
