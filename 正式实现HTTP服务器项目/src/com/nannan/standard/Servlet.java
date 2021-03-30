package com.nannan.standard;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -30
 * Time: 1:42
 */
public interface Servlet {
    //servlet的生命周期
    void init() throws ServletException;  // 一次

    void service(ServletRequest req,ServletResponse resp) throws ServletException,IOException; //多次

    void destroy();  //一次
}
