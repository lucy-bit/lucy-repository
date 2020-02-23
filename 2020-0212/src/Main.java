import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
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
 * Date: 2020 -02 -12
 * Time: 12:09
 */
public class Main {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/java20_0212?useSSL=false&characterEncoding=utf8";
    private static final String mysqlUsername = "root";
    private static final String mysqlPassword = "";
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Scanner scanner = new Scanner(System.in);

        while(true) {
            menu();
            int select = scanner.nextInt();
            scanner.nextLine();//读走换行操作
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

    private static void login() throws SQLException {
        //用户输入用户名和密码
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String password = sc.nextLine();
        try(Connection con = (Connection)DriverManager.getConnection(url,mysqlUsername,mysqlPassword)) {
            /*try(Statement sta = con.createStatement()) {
                String sql = String.format("SELECT id,username FROM users WHERE username = '%s' AND password = '%s'",username,password);
                //SELECT id,username FROM users WHERE username = ''or 1=1 or'' and password = '123456';
                System.out.println(sql);
                try(ResultSet resultSet = sta.executeQuery(sql)) {
                    if(!resultSet.next()) {
                        System.out.println("登录失败");
                    }else {
                        int id = resultSet.getInt("id");
                        System.out.println("登录成功：" +id +" " + username);
                    }
                }
            }*/
            String sql = "SELECT id,username "
        }
    }

    private static void register() throws SQLException {
        //用户输入用户名和密码
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String password = sc.nextLine();

        //之前的方法
      /*  Connection con = (Connection) DriverManager.getConnection(url, mysqlUsername, mysqlPassword);
        Statement statement = con.createStatement();
        String sql = String.format("INSERT INTO users(username,password) VALUES ('%s','%s')",username,password);
        System.out.println(sql);
        statement.executeUpdate(sql);
        con.close();
        statement.close();*/
      //用try代替，不用再写close
        try(Connection con = (Connection) DriverManager.getConnection(url, mysqlUsername, mysqlPassword)) {
            try(Statement statement = con.createStatement()) {
                String sql = String.format("INSERT INTO users(username,password) VALUES ('%s','%s')",username,password);
                System.out.println(sql);
                statement.executeUpdate(sql);
            }
        }
    }
    private static void menu() {
        System.out.println("=====================");
        System.out.println("1. 用户注册");
        System.out.println("2. 用户登录");
        System.out.println("3. 发表文章");
        System.out.println("4. 文章列表页");
        System.out.println("5. 文章详情页");
        System.out.println("=====================");
    }


   /* private static final DataSource dataSource ;
    static {
        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        //进行服务器配置
        mysqlDataSource.setServerName("127.0.0.1");
        mysqlDataSource.setPort(3306);
        mysqlDataSource.setUser("root");
        mysqlDataSource.setPassword("");
        mysqlDataSource.setDatabaseName("java20_0212");

        mysqlDataSource.setUseSSL(false);
        mysqlDataSource.setCharacterEncoding("utf8");

        dataSource = mysqlDataSource;

    }

    public static void main(String[] args) {
        createTable();
        insert();
        select();
    }

    public static void createTable() throws SQLException {
        String sql = "CREATE TABLE users (" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "username VARCHAR(255)" +
                ")";
        try (Connection connection = dataSource.getConnection()) {
            try(PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.execute();
            }
        }
    }*/

   //进行准备工作
    /*CREATE DATABASE java20_0212 CHARSET utfmb4;
    use java20_0212;
    create table users (
            id int primary key auto_increment,
            username varchar(255) unique not null,
            password varchar(255) not null
    );
    create table articles(
            id int primary key auto_increment,
            author_id int not null,
            title varchar(255),
            content text
    );

    //注册用户
    INSERT INTO users(username,password) VALUES ('?','?');
    */

}
