package com.bit;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// 观察，不同的状态，会导致浏览器做出不同的后续的动作
@WebServlet("/response-demo")
public class ResponseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 影响 HTTP 响应状态的 API
        // 配合 Chrome 开发者工具 OR Fiddler 进行观察
        // resp.setStatus(400);
        // resp.sendError(404, "今儿真高兴");   // setStatus + 填充正文
        // resp.sendRedirect("/");             // setStatus(302) + setHeader("Location");

        // 设置 HTTP 响应头
        // resp.setHeader("Key", "Value");
        // resp.setHeader("Content-Type", "peixinchen");
        //                key             value
        //resp.setHeader("Content-Type", "text/html; charset=utf-8");
        //resp.setContentType("text/html; charset=utf-8");    // 等价于 setHeader("Content-Type", "");
        //resp.setContentType("text/html");
        //resp.setCharacterEncoding("utf-8");
        //resp.setIntHeader("Key", 18);
        //resp.setHeader("Key", String.valueOf(18));

        // 填充正文内容
        // 文本 —— 主要方式
        /*
        resp.setContentType("text/plain");
        resp.setCharacterEncoding("utf-8");
        PrintWriter writer = resp.getW界");
        writer.println("中国真美丽");
        writer.println("大家一定强"riter();
        writer.println("你好世);
        */

        // 不是文本内容 —— 图片文件
        /*
        resp.setContentType("text/plain");
        resp.setCharacterEncoding("utf-8");
        ServletOutputStream outputStream = resp.getOutputStream();
        // 写了一个“你”
        outputStream.write(0xE4);
        outputStream.write(0xBD);
        outputStream.write(0xA0);
        */
    }
}
