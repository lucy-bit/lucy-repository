/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -02 -10
 * Time: 9:09
 */
import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/java20_0210?useSSL=false&characterEncoding=utf8";
        String user = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(url,user,password);
        //使用insert，导入表中数据，来让后来的select用
        {
            Statement statement = connection.createStatement();
            //insert
            String sql = "INSERT INTO users(id,name)VALUES(1,'陈沛鑫'),(2,'高博'),(3,'李哥')";
            statement.executeUpdate(sql);
            statement.close();
        }
       /* //update
        String sql2 = "UPDATE users SET name = '高博'WHERE id = 1";
        statement.executeUpdate(sql2);
        //delete
        String sql3 = "DELETE FROM users WHERE id = 1";
        statement.executeUpdate(sql3);*/
        {
            Statement statement = connection.createStatement();
            String sql = "SELECT id,name FROM users";
            ResultSet resultSet = statement.executeQuery(sql);
            List<String> nameList = new ArrayList<>();
            while(resultSet.next()) {
                int id = resultSet.getInt(1);//下标从1开始
                String name = resultSet.getString("name");
                //因为while后结果集会销毁，所以需要通过List保存
                nameList.add(name);
                System.out.println(id + "," + name);
        }
            resultSet.close();
            statement.close();
       }
        connection.close();
    }
}
