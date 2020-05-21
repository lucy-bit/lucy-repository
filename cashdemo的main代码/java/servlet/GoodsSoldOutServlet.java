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
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2020-05-17
 * Time: 11:53
 */
@WebServlet("/delGoods")
public class GoodsSoldOutServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=utf-8");

        Writer writer = resp.getWriter();
        String str = req.getParameter("id");
        System.out.println(str);

        Integer id = Integer.parseInt(str.trim());
        System.out.println("id" + id);
        Connection connection = null;
        PreparedStatement ps = null;

        try {
            String sql = "delete from goods where id=?";
            connection = DBUtil.getConnection(true);
            ps = connection.prepareStatement(sql);
            ps.setInt(1,id);

            int ret = ps.executeUpdate();
            if(ret == 1) {
                writer.write("<h2> 删除成功："+id+"</h2>");
            }else {
                writer.write("<h2> 下架失败："+id+"</h2>");
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.close(connection,ps,null);
        }
    }

}
