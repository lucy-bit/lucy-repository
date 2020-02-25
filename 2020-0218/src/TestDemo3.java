/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -02 -18
 * Time: 23:52
 */
public class TestDemo3 {
    //静态泛型方法
    public static<T extends  Comparable<T>> TestNode2.Node<T> mergeNode(TestNode2.Node<T> headA,TestNode2.Node<T> headB) {
        TestNode2.Node<T> newHead = new TestNode2.Node<>();
        TestNode2.Node<T> tmp = newHead;
        while(headA != null && headB != null) {
            if(headA.data.compareTo(headB.data) < 0) {
                tmp.next = headA;
                tmp = tmp.next;
                headA = headA.next;
            }else {
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
        TestNode2<Integer> testNode2 = new TestNode2<>();
        TestNode2<Integer> testNode3 = new TestNode2<>();
        testNode2.insertTail(1);
        testNode2.insertTail(3);
        testNode2.insertTail(5);
        //testNode2.show();
        testNode3.insertTail(2);
        testNode3.insertTail(4);
        testNode3.insertTail(6);
        TestNode2.Node<Integer> newHead = mergeNode(testNode2.head,testNode3.head);
        testNode2.show2(newHead);
    }
}
