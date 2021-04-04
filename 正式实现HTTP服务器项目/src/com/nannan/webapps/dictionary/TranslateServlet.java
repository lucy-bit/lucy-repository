package com.nannan.webapps.dictionary;

import com.nannan.standard.ServletException;
import com.nannan.standard.http.HttpServletRequest;
import com.nannan.standard.http.HttpServletResponse;
import com.nannan.standard.http.HttpServlet;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -30
 * Time: 17:49
 */
import java.io.IOException;
import java.io.PrintWriter;

public class TranslateServlet extends HttpServlet {
    public TranslateServlet() {
        System.out.println("我是 TranslateServlet 的 构造方法");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("我是 TranslateServlet 的 init 方法");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("我是 Translate 的 doGet 方法");
        String english = req.getParameter("english");

        String chinese = translate(english);

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.printf("<h1>翻译服务</h1>\r\n");
        writer.printf("<p>%s 的意思是 %s</p>\r\n", english, chinese);

    }

    private String translate(String english) {
        String chinese = english;
        return chinese;
    }
}
