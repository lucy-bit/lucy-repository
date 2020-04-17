package com.dingdang.servlets;

import com.dingdang.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;

@WebServlet("/u")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        // TODO: 增加合法性校验

        resp.setContentType("text/html; charset=utf-8");
        PrintWriter writer = resp.getWriter();
        writer.println("<!DOCTYPE html>");
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<meta charset='utf-8'>");
        writer.println("<title>个人主页</title>");
        writer.println("</head>");
        writer.println("<body>");

        User user;
        try {
            user = User.getByUsername(username);
        } catch (SQLException | ParseException e) {
            e.printStackTrace();
            throw new ServletException(e);
        }
        if (user == null) {
            resp.setStatus(404);
            writer.println("<h1>没有这个用户: " + username + "</h1>");
        } else {
            writer.println("<h1>" + user.nickname + "</h1>");
            writer.println("<p>" + user.id + "</p>");
            writer.println("<p>" + user.username + "</p>");
            writer.println("<p>" + user.brief + "</p>");
            writer.println("<p>" + user.getRegisteredAt() + "</p>");
        }

        writer.println("</body>");
        writer.println("</html>");
    }
}
