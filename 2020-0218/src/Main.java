/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -02 -18
 * Time: 11:22
 */
class OuterClass {
    public int data1 = 1;
    private int data2 = 2;
    static int data5 = 3;
    public OuterClass() {
        System.out.println("OuterClass()");
    }

    class InnerClass {
        public int data4 = 4;
        public InnerClass() {
            System.out.println("InnerClass()");
        }
        public void test() {
            System.out.println("InnerClass: test");
            System.out.println("data4 = " + data4);
            System.out.println("data1 = " + data1);
            System.out.println("data5 = " + data5);
        }

    }
    //静态内部类
    static class InnerClass2 {
        public int data5 = 5;
        private static int data6 = 6;
        OuterClass outerClass;
        public InnerClass2(OuterClass o) {
            this.outerClass = o;

        }
        public void test() {
            System.out.println("data1 = " + this.outerClass.data1);
            System.out.println(data5);//5
            System.out.println(OuterClass.data5);//3
        }
    }
}
public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();//要想访问实例成员，必须先有一个实例对象
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        OuterClass.InnerClass2 innerClass2 = new OuterClass.InnerClass2(outerClass);
        innerClass2.test();
        //OuterClass.InnerClass——拿到类型
        //outerClass.new InnerClass()——拿到对象
        //innerClass.test();
    }

}
