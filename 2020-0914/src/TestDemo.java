/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -09 -14
 * Time: 19:41
 */

public class TestDemo {
    public static void main(String[] args) {
        MyArrayList myArrayList1 = new MyArrayList();
        for(int i = 0; i < 10; i++) {
            myArrayList1.add(i,i);
        }
        myArrayList1.display();
        myArrayList1.add(10,10);
        myArrayList1.display();
        System.out.println("--------------------");
        System.out.println(myArrayList1.contains(3));
        System.out.println(myArrayList1.search(4));
    }
}
