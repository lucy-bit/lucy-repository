package servlet;

import util.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2020-05-17
 * Time: 9:42
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("注册！");

        req.setCharacterEncoding("UTF-8");

        resp.setContentType("text/html; charset=utf-8");

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        Connection connection = null;
        PreparedStatement ps = null;
        //ResultSet rs = null;

        Writer writer = resp.getWriter();

        try {
            String sql = "insert into account(username,password) values(?,?)";
            connection = DBUtil.getConnection(true);
            ps = connection.prepareStatement(sql);

            ps.setString(1,username);
            ps.setString(2,password);

            int ret = ps.executeUpdate();
            if(ret == 0) {
                System.out.println("注册失败！");
                writer.write("<h2> 注册失败 </h2>" );
            }else {
                System.out.println("注册成功!");
                writer.write("<h2> 注册成功 </h2>" );
                resp.sendRedirect("login.html");
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.close(connection,ps,null);
        }
    }
}
