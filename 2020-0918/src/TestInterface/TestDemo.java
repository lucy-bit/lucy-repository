package TestInterface;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -09 -18
 * Time: 17:49
 */
interface  Shape {
    public static final int a = 10;
    int b = 20;
    public abstract void draw();
    void change();
}

 class round implements Shape {
     @Override
     public void draw() {
         System.out.println("⚪");
     }

     @Override
     public void change() {

     }
 }
public class TestDemo {
    public static void drawShape(Shape shape) {
        shape.draw();
    }
    public static void main(String[] args) {
        //练习接口
        Shape shape = new round();
        drawShape(shape);
    }
}
