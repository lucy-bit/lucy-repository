import java.sql.*;
import java.util.Collection;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -12 -18
 * Time: 20:10
 */
public class TestDemo {
    private static Connection connection;
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/nan?useSSL=false",
                    "root",
                    ""
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void register() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要注册的用户名");
        String name = sc.nextLine();
        Statement statement = connection.createStatement();
        String sql = String.format(
                "INSERT INTO user (username) VALUES ('%s')",
                name
        );
        statement.close();
    }
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        System.out.println("======================");
        System.out.println("1、注册用户");
        System.out.println("2、登录用户");
        System.out.println("3、发表文章");
        System.out.println("其他");
        System.out.println("======================");
        while(running) {
            int choose = sc.nextInt();
            switch(choose) {
                case 1: register();
                case 2: loginUser();

                default:running = false;
            }
        }
    }

    private static void loginUser() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要登录的用户名");
        String name = sc.nextLine();
        Statement statement = connection.createStatement();

    }

    public static void main2(String[] args) throws SQLException, ClassNotFoundException {
        //1、注册Driver 通过一条反射语句
        Class.forName("com.mysql.jdbc.Driver");
        //2、获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/nan?useSSL=false";
        String username = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(
                url,
                username,
                password
        );
        Statement statement = connection.createStatement();
        String sql = "SELECT DATABASE()";
        ResultSet resultSet = statement.executeQuery(sql);
        resultSet.next();
        String name = resultSet.getString(1);
        while(resultSet.next()) {
            int id = resultSet.getInt(1);
            String user = resultSet.getString(2);
            System.out.println(id + " " + user);
        }
        statement.close();
        resultSet.close();
        connection.close();
    }
}
