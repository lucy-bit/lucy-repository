package com;

import com.book.BookList;
import com.user.Admin;
import com.user.NormalUser;
import com.user.User;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -26
 * Time: 15:59
 */
public class Main {

    //将登录分装成一个函数
    //用User接收，是因为返回的两种用户都是继承User的
    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入你的身份：1-》管理员  0-》普通用户");
        int who = scanner.nextInt();
        if(who == 1) {
            return new Admin(name);
        }else {
            return new NormalUser(name);
        }
    }

    public static void main(String[] args) {
    //准备书籍
        BookList bookList = new BookList();
        //登录 返回对象
        User user = login();
        while(true) {
            int choice = user.menu();//1

            //如何去对应操作 ，重要代码
            user.doOperation(choice,bookList);
        }

    }
}
