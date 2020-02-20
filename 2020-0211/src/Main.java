import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import javax.xml.transform.Result;
import java.sql.*;
import java.util.Scanner;

import static java.awt.SystemColor.menu;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -02 -11
 * Time: 15:17
 */
public class Main {
    //定义全局变量
    private static final String url = "jdbc:mysql://127.0.0.1:3306/java20_0211?useSSL=false&characterEncoding=utf8";
    private static final String mysqlUsername = "root";
    private static final String mysqlPassword = "";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        Scanner scanner = new Scanner(System.in);
        while(true) {
            menu();
            int select = scanner.nextInt();
            scanner.nextLine();
            switch(select) {
                case 1:
                    register();
                    break;
                case 2:
                    login();
                    break;
            }
        }
    }
    private static void register() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();
        /*//建立connection连接
        Connection connection = DriverManager.getConnection(url,mysqlUsername,mysqlPassword);

        //建立statement
        Statement statement = connection.createStatement();

        //实现sql方法
        //注册用户
        //INSERT INTO users(username,passsword) VALUES ('%s','%s');

        //这里使用了String.format方法
        String sql = String.format("INSERT INTO users(username,password) VALUES ('%s','%s')",username,password);
        System.out.println(sql);
        statement.executeUpdate(sql);
        statement.close();
        connection.close();*/

        //用try-with-resource的方法
        //这种方法更简洁，而且避免了因异常情况下connection和statemnet未销毁的情况
        try(        Connection connection = DriverManager.getConnection(url,mysqlUsername,mysqlPassword)) {
            try(       Statement statement = connection.createStatement()) {
                String sql = String.format("INSERT INTO users(username,password) VALUES ('%s','%s')",username,password);
                System.out.println(sql);
                statement.executeUpdate(sql);
            }
        }
        System.out.println("用户注册成功");
    }
    //登录
    private static void login() throws SQLException {
        //登陆界面需要用户输入用户名还有密码
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String password = sc.nextLine();

        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setServerName("127.0.0.1");
        mysqlDataSource.setPort(3306);
        mysqlDataSource.setUser("root");
        mysqlDataSource.setPassword("");
        mysqlDataSource.setDatabaseName("java20_0211");
        mysqlDataSource.setUseSSL(false);
        mysqlDataSource.setCharacterEncoding("utf8");
        DataSource dataSource = mysqlDataSource;

        try(Connection con =DriverManager.getConnection(url,mysqlUsername,mysqlPassword)) {
           /* try(Statement statement = con.createStatement()) {
                String sql = String.format("SELECT id,username FROM users WHERE username = '%s' AND password ='%s'",
                        username,password);
                System.out.println(sql);*/


           //使用preparestatement
            //prepare内部会进行字段匹配的内容，避免了sql注入的问题
            String sql = "SELECT id,username FROM users WHERE username = ? AND password = ?";
            try(PreparedStatement statement = con.prepareStatement(sql)) {
                //username和password会自动匹配？
                statement.setString(1,username);
                statement.setString(2,password);

                try(ResultSet resultSet = statement.executeQuery()) {
                    if(!resultSet.next()) {
                        System.out.println("登录失败");
                    }else {
                        int id = resultSet.getInt("id");
                        String usernameInTable = resultSet.getString("username");
                        System.out.println("登录成功：" + id + ", " +usernameInTable);
                    }
                }
            }
        }

    }
    private static void menu() {
        System.out.println("------------------------");
        System.out.println("1. 用户注册");
        System.out.println("2. 用户登录");
        System.out.println("3. 文章发表");
        System.out.println("4. 文章列表页");
        System.out.println("5。 文章详情页");
        System.out.println("-------------------------");

    }
}

/*
//建articles表
CREATE TABLE articles (
        id INT PRIMARY KEY AUTO_INCREMENT,
        author_id INT NOT NULL,
        title VARCHAR(255),CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL
);
        content TEXT
);
//建users表
CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL
);

*/

