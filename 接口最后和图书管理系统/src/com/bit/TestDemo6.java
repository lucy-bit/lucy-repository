package com.bit;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2019-11-19
 * Time: 21:17
 */
class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
}
interface IFlying {
    void fly();
}
interface IRunning {
    void run();
}
interface ISwimming {
    void swim();
}

class Cat extends Animal implements IRunning {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name + "正在用四条腿跑");
    }
}

class Fish extends Animal implements ISwimming {
    public Fish(String name) {
        super(name);
    }
    @Override
    public void swim() {
        System.out.println(this.name + "正在用尾巴游泳");
    }
}

class Frog extends Animal implements IRunning, ISwimming {
    public Frog(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name + "正在往前跳");
    }
    @Override
    public void swim() {
        System.out.println(this.name + "正在蹬腿游泳");
    }
}

class Duck extends Animal implements IRunning, ISwimming, IFlying {
    public Duck(String name) {
        super(name);
    }
    @Override
    public void fly() {
        System.out.println(this.name + "正在用翅膀飞");
    }
    @Override
    public void run() {
        System.out.println(this.name + "正在用两条腿跑");
    }
    @Override
    public void swim() {
        System.out.println(this.name + "正在漂在水上");
    }
}

class Reboot implements IRunning{
    @Override
    public void run() {
        System.out.println("机器人在跑");
    }
}

public class TestDemo6 {
    public static void walk(IRunning running) {
        System.out.println("我带着伙伴去散步");
        running.run();
    }
    public static void swing(ISwimming iSwimming) {
        System.out.println("我带着伙伴去散步");
        iSwimming.swim();
    }
    public static void main(String[] args) {
        Duck duck = new Duck("唐老鸭");
        walk(duck);
        swing(duck);
        Reboot reboot = new Reboot();
        walk(reboot);
    }
}
