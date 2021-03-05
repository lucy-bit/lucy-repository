package com.bit.demo2;

import com.bit.demo.Animal;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -05
 * Time: 22:03
 */
// Bird.java
public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }
    public void fly() {
        // 对于父类的 protected 字段, 子类可以正确访问
        System.out.println(this.name + "正在飞 ︿(￣︶￣)︿");
    }

    public static void main(String[] args) {
        Bird bird = new Bird("yy");
        bird.fly();
    }
}