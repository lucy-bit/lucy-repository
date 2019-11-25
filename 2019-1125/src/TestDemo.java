/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -25
 * Time: 15:48
 */
//父类
class Shape {
    public void draw(){

    }
}

//子类
class Rect extends Shape {
  /*  @Override
    public void draw() {
        super.draw();
    }*/
     @Override
    public void draw() {
        System.out.println("♦");
    }
}
class Cycle extends Shape{
    @Override
    public void draw() {
        System.out.println("○");
    }
}
class Flower extends Shape{
    @Override
    public void draw() {
        System.out.println("❀");
    }
}
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("△");
    }
}
public class TestDemo {
    public static void drawMap(Shape shape) {
        shape.draw();
    }
    public static void drawShapes() {
        Shape[] shapes = {new Cycle(),new Rect(),new Flower()};
        for(Shape shape : shapes) {
            shape.draw();
        }
    }
    public static void main(String[] args) {

        //1、直接赋值进行向上转型
        /*Shape shape1 = new Rect();
        Shape shape2 = new Cycle();
        Shape shape3 = new Flower();
        drawMap(shape1);
        drawMap(shape2);
        drawMap(shape3);*/

        //2、传参进行向上转型
       /* Rect rect = new Rect();
        Cycle cycle = new Cycle();
        Flower flower = new Flower();
        drawMap(rect);
        drawMap(cycle);
        drawMap(flower);*/

        //先发生向上转型，再发生运行时绑定（前提是已经重写了draw方法）
       /* Rect shape = new Rect();
        Cycle shape2 = new Cycle();
        Flower shape3 = new Flower();
        drawMap(shape);
        drawMap(shape2);
        drawMap(shape3);*/

       //数组的方法
        //drawShapes();

    }
}
