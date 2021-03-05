package com.bit.demo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -05
 * Time: 22:02
 */
public class Animal {
    protected String name;
    public Animal(String name) {

        this.name = name;
    }
    public void eat(String food) {
        System.out.println(this.name + "正在吃" + food);
    }
}

