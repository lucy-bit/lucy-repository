package com.bit.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -22
 * Time: 15:54
 */
public class Cat extends Animal {
   // public String name;
    public String color;//Cat子类特有的数据
    public Cat(String name,String color) {
        //super构造一定要在第一行
        super(name);
        this.color = color;
    }
    public void eat() {
        System.out.println(this.name + "Cat:eat()");
    }
    public void func() {
        System.out.println(super.name);
    }
    /*public Cat(String name,String color) {
        this.name = name;
        this.color = color;
    }*/
   /* public void eat() {
        System.out.println(this.name + "eat()");
    }*/
}

