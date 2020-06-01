package com.bit.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:  protected 受保护的-》继承
 * User: GAOBO
 * Date: 2019-11-17
 * Time: 14:32
 */
public class Animal {
    protected String name;
    /*static {
        System.out.println("Animal::static{}");
    }
    {
        System.out.println("Animal::instance{}");
    }*/
    public Animal(String name) {
        this.name = name;
        //System.out.println("Animal(String)");
    }
    public void eat() {
        System.out.println(this.name+"eat()!");
    }
}
