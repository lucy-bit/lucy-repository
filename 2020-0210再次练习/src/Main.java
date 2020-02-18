import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -02 -10
 * Time: 16:27
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/java20_0210?useSSL=false&characterEncoding=utf8";//配置连接URL
        String user = "root";//连接mysql的用户名
        String password = "";//连接mysql的密码
        Connection connection = DriverManager.getConnection(url,user,password);//通过一个接口来获取链接
       //插入一些数据，以供SELECT用
        {
            Statement statement = connection.createStatement();
            String sql = "INSERT INTO users (id,name) VALUES (5,'丁当')";
            //通过statement对象来执行sql语句
            statement.executeUpdate(sql);
            statement.close();
        }
        //执行SELECT语句
        {
            Statement statement = connection.createStatement();
            String sql = "SELECT id,name from users";
            ResultSet resultSet = statement.executeQuery(sql);
            List<String> nameList = new ArrayList<>();
            while(resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString("name");
                //因为结果集需要马上销毁，所以通过List保存结果
                nameList.add(name);
                System.out.println(id + ", " +name);
            }
            resultSet.close();
            statement.close();
        }
        connection.close();
    }
}


    INSERT INTO art
