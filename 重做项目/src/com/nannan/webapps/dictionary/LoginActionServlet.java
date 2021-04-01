package com.nannan.webapps.dictionary;

import com.nannan.standard.ServletException;
import com.nannan.standard.http.HttpServlet;
import com.nannan.standard.http.HttpServletRequest;
import com.nannan.standard.http.HttpServletResponse;
import com.nannan.standard.http.HttpSession;

import java.io.IOException;

public class LoginActionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if (username.equals("nannan") && password.equals("123456")) {
            User user = new User(username, password);
            HttpSession session = req.getSession();
            session.setAttribute("user", user);

            resp.sendRedirect("profile-action");
        } else {
            resp.sendRedirect("login.html");
        }
    }
}
