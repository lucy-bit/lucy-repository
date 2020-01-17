package com.user;

import com.book.BookList;
import com.operation.IOperation;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -26
 * Time: 15:38
 */

//User类是一个抽象类，每个子类需要做两件事情
    //1、初始化对应的操作数组
    //2、实现 Menu 菜单

/*abstract public class User {
    protected String name;
    protected IOperation[] operations;

    //显示菜单
    abstract public int menu();
    //根据用户选项执行操作
    public void doOperation(int choice,BookList bookList) {
        operations[choice].work(bookList);


}*/
abstract public class User {
    //因为name在其他两类用户中都有用到，所以不必设为私有的
    public String name;
    public User(String name) {
        this.name = name;
    }

    //IOperation -> 实现了这个接口的类都可以存放进去
    public IOperation[] operations;

    //根据用户选项执行操作
    public void doOperation(int choice,BookList bookList) {
        operations[choice].work(bookList);
        //对象
    }


    //因为在其他两类用户中menu菜单不一样，所以定义抽象类
    public abstract int menu();
}
