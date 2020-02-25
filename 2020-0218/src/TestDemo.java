/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -02 -18
 * Time: 17:25
 */
public class TestDemo {
    public static<T extends Comparable<T>> TestNode.Node<T> mergeNode(TestNode.Node<T> headA,TestNode.Node<T> headB) {
     //Node是实例内部类时
      /*  TestNode testNode = new TestNode();
        TestNode.Node newHead = testNode.new Node(-1);*/
      //Node时静态内部类时
        TestNode.Node<T> newHead = new TestNode.Node<T>();
        TestNode.Node<T> tmp = newHead;
        while(headA != null && headB != null) {
            if(headA.data.compareTo(headB.data) < 0) {
                tmp.next = headA;
                tmp = tmp.next;
                headA = headA.next;
            }else{
                tmp.next = headB;
                tmp = tmp.next;
                headB = headB.next;
            }
        }
        if(headA != null) {
            tmp.next = headA;
        }
        if(headB != null) {
            tmp.next = headB;
        }
        return newHead.next;
    }
    public static void main(String[] args) {
        TestNode<Integer> testNode = new TestNode<>();
        TestNode<Integer> testNode2 = new TestNode<>();
        testNode.insertTail(1);
        testNode.insertTail(3);
        testNode.insertTail(5);
        testNode.insertTail(7);
        //testNode.show();
        testNode2.insertTail(2);
        testNode2.insertTail(4);
        testNode2.insertTail(6);
        testNode2.insertTail(8);
        testNode2.show();
        TestNode.Node ret = mergeNode(testNode.head,testNode2.head);
        testNode2.show2(ret);
    }
}
