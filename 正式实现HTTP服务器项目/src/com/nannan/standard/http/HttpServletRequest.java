package com.nannan.standard.http;

import com.nannan.standard.ServletRequest;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -30
 * Time: 16:38
 */
public interface HttpServletRequest extends ServletRequest {
    Cookie[] getCookies();

    String getHeader(String name);

    String getMethod();

    String getContextPath();
    String getServletPath();
    String getRequestURI();

    HttpSession getSession();
}

