package com.bit.demo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -09 -17
 * Time: 16:59
 */
class Animal {
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal的构造");
    }
    protected int age;
    public String name;
    public void eat() {
        System.out.println(this.name + " Animal : eat");
    }
    public void sleep() {
        System.out.println("Animal : sleep");
    }
}
class Cat extends Animal {
    public Cat(String name) {
        super(name);
        System.out.println("Cat的构造");
    }
    //重写
    public void eat() {
        System.out.println(this.name + " 猫猫eat");
    }
}

class ChineseCat extends Cat {
    public ChineseCat(String name) {
        super(name);
        super.name = "hhh";
        System.out.println("中华猫的构造");
    }
}
class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }
    public void fly() {
        System.out.println("Bird : fly");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        /*Cat cat = new Cat("mimi");
        cat.eat();
        Bird bird = new Bird("xiaoqi");
        bird.fly();
        bird.eat();
        System.out.println(bird.age);
        ChineseCat chineseCat = new ChineseCat("xiuxu");*/
        Animal animal = new Cat("mimi");
        animal.eat();
    }
}
