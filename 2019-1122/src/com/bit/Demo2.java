package com.bit;

import com.bit.demo1.Animal;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -22
 * Time: 15:50
 */
public class Demo2 extends Animal {
    public Demo2(String name) {
        super(name);
      this.name = name;
    }
    public void func() {
        System.out.println(this.name);//this代表demo2对象的引用
    }
    public static void main(String[] args) {
        Animal animal = new Animal("小花");
        //System.out.println(this.name);//会报错，因为方法是静态的

    }
}
