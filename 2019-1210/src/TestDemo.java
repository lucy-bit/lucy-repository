/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -12 -10
 * Time: 18:07
 */
public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.display();

        linkedList.addAtTail(3);
        linkedList.display();

        linkedList.addAtIndex(1,2);   //链表变为1-> 2-> 3
        linkedList.display();

        linkedList.get(1);            //返回2
        linkedList.deleteAtIndex(1);  //现在链表是1-> 3
        linkedList.display();

        System.out.println(linkedList.get(1));           //返回3
        linkedList.display();
    }



}
