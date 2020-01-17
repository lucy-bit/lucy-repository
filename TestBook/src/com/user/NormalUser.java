package com.user;

import com.operation.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -26
 * Time: 15:33
 */
public class NormalUser extends User {
    public NormalUser(String name) {
        super(name);
        this.operations = new IOperation[] {
                //数组元素顺序也是有讲究的，比如0号下标就是退出系统
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation(),
        };
    }
    @Override
    public int menu() {
        System.out.println("================================");
        System.out.println("hello" + this.name + "欢迎使用图书管理系统");
        System.out.println("1、查找图书");
        System.out.println("2、借阅图书");
        System.out.println("3、归还图书");
        System.out.println("0、退出系统");
        System.out.println("================================");
        Scanner scanner = new Scanner(System.in);
        //Scanner scanner = new Scanner(System.in);
        //int choice = scanner.nextInt();
        int choice = scanner.nextInt();
        return choice;
        //return 0;
    }
}
