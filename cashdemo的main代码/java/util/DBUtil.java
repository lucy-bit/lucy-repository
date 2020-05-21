package util;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * Description: 链接数据库
 * User: GAOBO
 * Date: 2020-05-12
 * Time: 21:32
 */
public class DBUtil {

    private static final String URL = "jdbc:mysql://localhost:3306/cash?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "111111";

    private static volatile DataSource DATASOURCE;

    //数据库连接池
    private static DataSource getDATASOURCE() {
        if(DATASOURCE == null) {
            synchronized (DBUtil.class) {
                if (DATASOURCE == null) {
                    DATASOURCE = new MysqlDataSource();
                    ((MysqlDataSource)DATASOURCE).setUrl(URL);
                    ((MysqlDataSource)DATASOURCE).setUser(USERNAME);
                    ((MysqlDataSource)DATASOURCE).setPassword(PASSWORD);
                }
            }
        }
        return DATASOURCE;
    }

    public static Connection getConnection( boolean autocommit) {
        try {
            Connection connection = getDATASOURCE().getConnection();
            connection.setAutoCommit(autocommit);//会讲到
            return connection;
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close(Connection con, PreparedStatement ps, ResultSet rs) {
       try {
           if(rs != null) {
               rs.close();
           }
           if(ps != null) {
               ps.close();
           }
           if(con != null) {
               con.close();
           }
       }catch (SQLException e) {
           e.printStackTrace();
       }
    }



}
