package com.bit;

import com.bit.demo.Animal;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -18
 * Time: 20:43
 */
public class Demo2 extends Animal {

    public Demo2(String name) {
        super(name);
    }

    public void func() {
        System.out.println(this.name);
    }

    public static void main(String[] args) {
      // System.out.println(this.name);
        Animal animal = new Animal("小花");
        System.out.println(animal.name);
        /*Demo1 demo = new Demo1();
        System.out.println(demo.value);*/
    }
}