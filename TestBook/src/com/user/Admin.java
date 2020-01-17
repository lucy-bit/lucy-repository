package com.user;

import com.operation.*;

import java.util.Scanner;

//import java.util.Scanner
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -26
 * Time: 15:33
 */
public class Admin extends User {

    //先构造父类
    public Admin(String name) {
        super(name);
        //若父类没有构造name的话
        //this.name = name;
        this.operations = new IOperation[] {
                //数组元素顺序也是有讲究的，比如0号下标就是退出系统
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation(),
        };


    }

    @Override
    public int menu() {
        System.out.println("================================");
        System.out.println("hello" + this.name + "欢迎使用图书管理系统");
        System.out.println("1、查找图书");
        System.out.println("2、新增图书");
        System.out.println("3、删除图书");
        System.out.println("4、显示所有图书");
        System.out.println("0、退出系统");
        System.out.println("================================");
        Scanner scanner = new Scanner(System.in);
        //Scanner scanner = new Scanner(System.in);
        //int choice = scanner.nextInt();
        int choice = scanner.nextInt();
        return choice;

        // return 0;
    }
}
