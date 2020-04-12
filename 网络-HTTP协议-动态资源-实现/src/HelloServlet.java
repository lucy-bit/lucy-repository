import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// 动态效果
// 根据 QueryString 的不同，显示不同的内容
// 显示的内容，是在运行期间决定的
public class HelloServlet extends HttpServlet {
    // 当 GET 请求时的处理逻辑
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name"); // 对于 GET 方法来说，就是从 QueryString 中获取
                                                   // 获取 QueryString 中 key 是 name 对应的 value 值
        if (name == null) {
            name = "世界";
        }

        resp.setContentType("text/html; charset=utf-8");
        resp.getWriter().println("<h1>GET</h1>");
        resp.getWriter().println("<p>你好" + name + "</p>");
    }

    // 当 POST 请求时的处理逻辑
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        resp.getWriter().println("<h1>POST</h1>");
        resp.getWriter().println("<p>你好世界</p>");
    }
}
