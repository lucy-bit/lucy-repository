/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2019-11-19
 * Time: 20:36
 */

/**
 * 1、包含抽象方法的类  叫做抽象类
 * 2、抽象类和普通类 最大的区别 包含抽象方法
 * 3、抽象类不能被实例化   不能new
 * 4、抽象类存在的意义-》肯定要被继承
 * 5、抽象类一旦被继承 就要重写抽象方法
 * 6、如果一个类继承了抽象类 那么如果不重写抽象类的
 * 方法，那么当前类 需要设计为抽象类-》
 * 可以选择重写也可以不重写。
 * 7.final
 */
abstract class Shape2 {
    /* public int a;
     public void func() {
         System.out.println("func()");
     } */
    public abstract void draw();//抽象方法
}
 class Rect2 extends Shape2 {
    @Override
    public void draw() {
        System.out.println("♦");
    }
    //public abstract void func();
}
/*class Rect3 extends Rect2 {
    @Override
    public void draw() {
        System.out.println("♦");
    }
}*/
class Cycle2 extends Shape2{
    @Override
    public void draw() {
        System.out.println("○");
    }
}
class Flower2 extends Shape2{
    @Override
    public void draw() {
        System.out.println("❀");
    }
}
class Triangle2 extends Shape2 {
    @Override
    public void draw() {
        System.out.println("△");
    }
}
public class TestDemo3 {
    public static void drawMap (Shape2 shape2) {
        shape2.draw();
    }
    public static void main(String[] args) {
        //提前检查代码的错误
        //Shape2 shape2 = new Shape2();

        Rect2 rect2 = new Rect2();
        Cycle2 cycle2 = new Cycle2();
        Flower2 flower2 = new Flower2();
        drawMap(rect2);
        drawMap(cycle2);
        drawMap(flower2);
    }
}
