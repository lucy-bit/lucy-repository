package com.nannan.standard;

import java.io.IOException;

public interface Servlet {
    void init() throws ServletException;

    void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException;

    void destroy();
}
