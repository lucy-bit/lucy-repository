/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -01
 * Time: 18:19
 */

/*1、编写一个类Calculator,有两个属性num1,num2,这两个数据的值，不能在定义的同时初始化，最后实现加减乘
        除四种运算.

        2、设计一个包含多个构造函数的类，并分别用这些构造函数来进行实例化对象。

        3、实现交换两个变量的值。要求：需要交换实参的值。*/
import java.util.Scanner;
class Demo {
    public int num1 = 10;
    public int num2 = 20;
}
class Demo2 {
    // 3、实现交换两个变量的值。要求：需要交换实参的值
    public void swap(Demo demo) {
        int tmp = demo.num1;
        demo.num1 = demo.num2;
        demo.num2 = tmp;
    }
}
class Person {
    public String name;
    public int age;
    public String sex;

    public void show(String name,int age,String sex) {
        System.out.println(name + " " + age + " " + sex);
    }

}
/*class Calculator {
    public double num1;
    public double num2;

    //加法
    public void sum(double num1,double num2) {
        System.out.println("sum = " + (num1 +num2));
    }
    //减法
    public void pub(double num1,double num2) {
        System.out.println("pub = " + (num1 - num2));
    }
    //乘法
    public void mul(double num1,double num2) {
        System.out.println("mul = " + (num1 * num2));
    }
    //除法
    public void div(double num1,double num2) {
        System.out.println("div = " + (num1 / num2));
    }
}*/
public class Testdemo {
    /*public static void main1(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数字：");
        calculator.num1 = sc.nextDouble();
        calculator.num2 = sc.nextDouble();
        calculator.sum( calculator.num1, calculator.num2);
        calculator.pub( calculator.num1, calculator.num2);
        calculator.mul( calculator.num1, calculator.num2);
        calculator.div( calculator.num1, calculator.num2);
        sc.close();
    }*/

    public static void main2(String[] args) {
       Person person = new Person();
       person.show("小鬼",20,"男");

    }

    public static void main(String[] args) {
        //传引用进去，定义一个类，里面定义属性num1,num2。传参的时候将产生的对象传进去，对象就是引用。
        //在方法内部通过点号找到num1,num2，对其进行交换
        Demo demo = new Demo();
        Demo2 demo2 = new Demo2();
        System.out.println("num1 = " + demo.num1 + ", " + "num2 = " + demo.num2);
        demo2.swap(demo);
        System.out.println("num1 = " + demo.num1 + ", " + "num2 = " + demo.num2);
    }
}


