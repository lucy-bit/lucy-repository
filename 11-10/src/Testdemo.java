/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -10
 * Time: 9:58
 */
public class Testdemo {
    public static void main(String[] args) {
        MySingleList mySingleList = new MySingleList();

        mySingleList.addLast(2);
        mySingleList.addLast(2);
        mySingleList.addLast(3);
        mySingleList.addLast(2);
        mySingleList.addLast(5);
        ListNode head = mySingleList.partition(3);
        mySingleList.display();
        mySingleList.display2(head);

}
