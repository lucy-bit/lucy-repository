package com.bit.demo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -18
 * Time: 19:51
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
