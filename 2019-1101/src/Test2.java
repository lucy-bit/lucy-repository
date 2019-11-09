/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -01
 * Time: 20:29
 */

//1、编写一个类Calculator,有两个属性num1,num2,这两个数据的值，不能在定义的同时初始化，最后实现加减乘
//        除四种运算.
import java.util.Scanner;
class Calculator {
    private double num1;
    private double num2;

    public double getNum1() {
        return num1;
    }
   /* public void setNum1(double Mynum1) {
        num1 = Mynum1;
    }*/
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    public void sub(double num1,double num2) {
        System.out.println("sub = " + (num1 + num2));
    }

}
public class Test2 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数字：");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        calculator.sub(x,y);
    }
}
