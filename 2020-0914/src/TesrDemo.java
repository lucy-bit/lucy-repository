import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -09 -14
 * Time: 18:15
 */
class Test {
    public  static void hello() {
        System.out.println("Hello");
    }
    public static int age;
    public static String name;
}

class MyValue {
    private int val;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
public class TesrDemo {

   /* public static void swap(MyValue m1,MyValue m2) {
        int tmp = m1.val;
        m1.val = m2.val;
        m2.val = tmp;
    }
*/
   public static void swap(MyValue m1,MyValue m2) {
       int tmp = m1.getVal();
       m1.setVal(m2.getVal());
       m2.setVal(tmp);
   }
    public static void main(String[] args) {
        MyValue myValue1 = new MyValue();
        myValue1.setVal(10);
        MyValue myValue2 = new MyValue();
        myValue2.setVal(20);
        System.out.println(myValue1.getVal());
        System.out.println(myValue2.getVal());
        System.out.println("交换");
        swap(myValue1,myValue2);
        System.out.println(myValue1.getVal());
        System.out.println(myValue2.getVal());
    }
    public static void main3(String[] args) {
        /*MyValue myValue1 = new MyValue();
        myValue1.val = 10;
        MyValue myValue2 = new MyValue();
        myValue2.val = 20;
        System.out.println(myValue1.val);
        System.out.println(myValue2.val);
        System.out.println("交换");
        swap(myValue1,myValue2);
        System.out.println(myValue1.val);
        System.out.println(myValue2.val);*/
    }
    /*public static void swap(int[] arr1,int[] arr2) {
        int tmp = 0;
        for(int i=0; i < arr1.length; i++) {
            tmp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = tmp;
        }
    }*/
    public static void main2(String[] args) {
        //给定两个整型数组，交换数组内容,前提是数组长度是一样的
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,0};
        //swap(arr1,arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    public static void main1(String[] args) {
        Test test = new Test();
        test.hello();
        Test.hello();
    }
}
