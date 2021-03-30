package com.nannan.webapps.dictionary;

import com.nannan.standard.ServletException;
import com.nannan.standard.http.Httpservlet;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -30
 * Time: 23:25
 */
public class ReformServlet extends Httpservlet {
    public ReformServlet() {
        System.out.println("我是 ReformServlet 的构造方法");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("我是 ReformServlet 的 init 方法");
    }
}
