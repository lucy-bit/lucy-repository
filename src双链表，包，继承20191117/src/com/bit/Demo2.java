package com.bit;

import com.bit.demo1.Animal;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2019-11-17
 * Time: 12:15
 */
public class Demo2 extends Animal{

    public Demo2(String name) {
        super(name);
    }

    public void func() {
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        //System.out.println(this.name);
        //Animal animal = new Animal("小花");
        //System.out.println(animal.name);
        /*Demo1 demo = new Demo1();
        System.out.println(demo.value);*/
    }
}
