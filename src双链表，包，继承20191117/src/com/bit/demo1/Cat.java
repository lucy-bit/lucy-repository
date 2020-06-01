package com.bit.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:  extends  继承-》扩展  为了代码的复用
 * User: GAOBO
 * Date: 2019-11-17
 * Time: 14:33
 */
public class Cat extends Animal{
    private String color;//子类所独有的数据
    /*static {
        System.out.println("Cat::static{}");
    }
    {
        System.out.println("Cat::instance{}");
    }*/
    public Cat(String name,String color) {
        //必须是第一行-》子类构造的时候 需要先构造父类
        super(name);//显示的调用父类的构造方法-》帮助父类来进行构造
        this.color = color;
        //System.out.println("Cat(String,String)");
    }

    public void func1() {
        System.out.println("func1()");
       /*String name = super.name;
       super.eat();*/
    }
}

class ChineseGardenCat extends Cat{
    public String sex;
    public ChineseGardenCat(String name,String color,String sex) {
        super(name,color);
        this.sex = sex;
    }
}
