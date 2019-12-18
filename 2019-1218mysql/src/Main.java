/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -12 -18
 * Time: 19:13
 */
//import com.mysql.jdbc.Driver;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1. 注册Driver  通过反射语句
        Class.forName("com.mysql.jdbc.Driver");
        //2 获取连接
       // String url = "jdbc:mysql://127.0.0.1:3306/nan";//会报warn警告
        String url = "jdbc:mysql://127.0.0.1:3306/nan?useSSL=false";

        String username = "root";// 通过root链接数据库
        String password = "";


        Connection connection = DriverManager.getConnection(
                url,
                username,
                password
        );
        //3、获取语句 statement
        Statement statement = connection.createStatement();
        //4、执行一条SELECT DATABASE();
        String sql = "SELECT DATABASE()";
        ResultSet resultSet = statement.executeQuery(sql);
        //5、事先知道结果只要一行加一列
        resultSet.next();//掉一次next才到第一行
        String name = resultSet.getString(1);//第一列是从1开始的
        System.out.println(name);
        //-3、关闭结果集
        resultSet.close();
        sql = "SELECT id,username FROM users ORDER BY id";
        resultSet = statement.executeQuery(sql);
        while(resultSet.next()) {
            int id = resultSet.getInt(1);
            String user = resultSet.getString(2);
            System.out.println(id + "," + user);
        }
        resultSet.close();
        //-2、关闭语句
        statement.close();
        //-1、关闭连接
        connection.close();
    }
}
