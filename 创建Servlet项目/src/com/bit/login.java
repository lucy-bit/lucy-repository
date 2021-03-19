package com.bit;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -19
 * Time: 23:39
 */
public class login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //从 query string 中获取用户输入的 用户名和密码
        String username = req.getParameter("username");
       String password = req.getParameter("password");

       // 设置 HTTP 响应的 Content-type Header
        resp.setContentType("text/plain; charset=utf-8");
        PrintWriter writer = resp.getWriter();//打印

       //验证用户名密码是否正确
        if(username != null
                && username.equals("nannan")
                && password != null
                && password.equals("1111")) {
            //登陆成功
            writer.println("登陆成功");
            System.out.println("登录成功");
        }else {
            writer.println("登陆失败");
            System.out.println("登录失败");
        }
    }
}
