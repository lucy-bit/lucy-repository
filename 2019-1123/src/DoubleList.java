/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -23
 * Time: 20:37
 */
//定义类
class ListNode1 {
        public int data;
        public ListNode next;
        public ListNode prev;
        //构造
        public ListNode1(int data) {
            this.data = data;
        }
}
public class DoubleList {
    public ListNode1 head;
    public ListNode1 last;

    //头插法
    public void addFirst1(int data) {
        ListNode1 node = new ListNode1(data);
        if(this.head == null) {
            this.head = node;
            this.last = node;
        }else {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }
}

