package com.bit.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -22
 * Time: 15:51
 */
public class Animal {
    protected String name;
    static {
        System.out.println("Animal静态");
    }
    {
        System.out.println("Animal实例");
    }
   public Animal(String name) {
       this.name = name;
       System.out.println("Animal构造");
   }
   public void eat() {
       System.out.println(this.name+"Animal :eat()");
   }
}

