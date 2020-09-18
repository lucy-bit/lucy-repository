/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -09 -18
 * Time: 15:11
 */
abstract class Shape {
    public abstract void draw();
}
abstract class round extends Shape {

}

class star extends Shape {
    public void draw() {
        System.out.println("⭐");
    }
}
public class TestDemo {
    public static void drawShape(Shape shape) {
        shape.draw();
    }
    public static void main(String[] args) {
       //理解抽象类
       // Shape shape1 = new round();
        Shape shape2 = new star();
      //  drawShape(shape1);
        drawShape(shape2);
    }
}
