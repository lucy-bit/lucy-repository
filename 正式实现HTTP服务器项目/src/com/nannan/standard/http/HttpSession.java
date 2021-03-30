package com.nannan.standard.http;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -30
 * Time: 16:54
 */
public interface HttpSession {
    Object getAttribute(String name);

    void removeAttribute(String name);

    void setAttribute(String name, Object value);
}
