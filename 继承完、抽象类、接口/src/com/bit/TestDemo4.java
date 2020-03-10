package com.bit;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2019-11-19
 * Time: 20:56
 */

/**
 * 1、定义的方法默认是：public abstract
 * 2、定义的成员变量默认是： public static final
 * 3、尽量简洁-》不用加上面所列内容
 * 4、类和接口的关系-》实现:implements
 * 5、实现了接口 必须重写方法
 */
interface IShape{
    //int a = 10;
    void draw();
}
class Cycle implements IShape{
    @Override
    public void draw() {
        System.out.println("○");
    }
}
class Flower implements IShape{
    @Override
    public void draw() {
        System.out.println("❀");
    }
}
class Triangle implements IShape {
    @Override
    public void draw() {
        System.out.println("△");
    }
}
public class TestDemo4 {
    public static void drawMap (IShape shape) {
        shape.draw();
    }
    public static void main(String[] args) {
        //IShape shape = new IShape();
        IShape shape = new Cycle();
        Cycle cycle = new Cycle();
        drawMap(shape);
        drawMap(cycle);
    }
}
