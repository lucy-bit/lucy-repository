import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -18
 * Time: 15:53
 */
public class TestDemo {
    public static void main(String[] args) {

        //LinkedList 底层是双向链表
        DoubleList doubleList = new DoubleList();
        doubleList.addFirst(1);
        doubleList.addFirst(2);
        doubleList.addFirst(3);
        doubleList.addFirst(4);
        doubleList.addFirst(5);
        doubleList.addIndex(5,99);
        doubleList.addIndex(0,99);
        doubleList.addIndex(2,99);
        doubleList.addIndex(0,99);
        doubleList.display();
        doubleList.remove(99);
        doubleList.display();
        doubleList.removeAllKey(99);
        doubleList.display();
        doubleList.clear();
        System.out.println(123423);



    }
}
