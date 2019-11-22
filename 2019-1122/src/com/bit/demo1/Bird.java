package com.bit.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -22
 * Time: 15:59
 */
public class Bird extends Animal{
    //public String name;
    public String yumao;

    static {
        System.out.println("Bird静态");
    }
    {
        System.out.println("Bird实例");
    }
    public Bird(String name,String yumao) {
        super(name);
        this.yumao = yumao;
        System.out.println("Bird构造");
    }
    public void fly() {
        System.out.println(this.name + "fly");
    }
}
