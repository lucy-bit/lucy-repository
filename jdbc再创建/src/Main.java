/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -28
 * Time: 15:21
 */
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -28
 * Time: 13:34
 */

//import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //注册驱动，选择乙方
        Class.forName("com.mysql.jdbc.Driver");

        //建立tcp连接
        String defaultDatabaseName = "test_0328";
        String user = "root";
        String password = "root";
        String url = "jdbc:mysql://127.0.0.1:3306/" + defaultDatabaseName + "?useSSL=false&characterEncoding=utf8";
        //取得连接
        Connection connection = DriverManager.getConnection(url, user, password);
        //System.out.println(connection);

        Statement statement = connection.createStatement();
        System.out.println(connection);

        statement.close();
        connection.close();

        //Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_0328? user=root&password=root&useUnicode=true&characterEncoding=UTF-8");
        //System.out.println(connection);


    }




}
