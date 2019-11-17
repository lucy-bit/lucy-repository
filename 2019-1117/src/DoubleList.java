/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -17
 * Time: 9:35
 */
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2019-11-17
 * Time: 9:28
 */
class ListNode {
    public int data;
    public ListNode next;
    public ListNode prev;
    public ListNode(int data) {
        this.data = data;
    }
}

public class DoubleList {
    public ListNode head;
    public ListNode last;//尾巴

    //头插法
    public void addFirst(int data){
        ListNode node = new ListNode(data);
        if(this.head == null) {
            this.head = node;
            this.last = node;
        }else {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }

    //尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if(this.head == null) {
            this.head = node;
            this.last = node;
        }else {
            //找尾巴
           while(this.last.next != null) {
               this.last = this.last.next;
           }
           //插入
            this.last.next = node;
            node.prev = this.last;
            this.last = node;
        }
    }
    public int size() {
        int size = 0;
        while(this.head != null) {
            size++;
            this.head = this.head.next;
        }
        return size;
    }
    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data) {
        ListNode cur = this.head;
        ListNode node = new ListNode(data);
        if(index < 0 || index < size()) {
            return false;
        }
        if(index == 0) {
            addFirst(data);
            return true;
        }
        for(int i = 0; i < index; i++) {
            cur = cur.next;
        }
        node.next = cur.next;
        cur.next = node;
        node.prev = cur;
        cur = cur.next;
        cur.prev = node;
        return true;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        ListNode cur  =this.head;
        while(cur != null) {
            if(cur.data == key) {
                return true;
            }
        }
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        ListNode cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                if(cur == this.head) {
                    this.head = this.head.next;
                     this.head.prev = null;
                }
                else if(cur.next == null) {
                    cur = null;
                    this.last = cur;
                }else {
                    cur.prev.next = cur.next;
                    if(cur.next != null) {
                        cur.next.prev = cur.prev;
                    }else {

                    }
                }
            }
        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key);
    //得到单链表的长度

    public void display() {
        while(this.head != null) {
            System.out.println(this.head.data);
            this.head = this.head.next;
        }
    }
    public void clear() {
        ListNode cur = this.head;
        while(cur != null) {
            this.head
        }
    }

}


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) {
            return null;
        }
        ListNode pL = headA;//始终让pL指向长的单链表
        ListNode pS = headB;//指向短的
        int lenA = 0;
        int lenB = 0;
        while(pL != null) {
            pL = pL.next;
            lenA++;
        }
        while(pS != null) {
            pS = pS.next;
            lenB++;
        }
        int len = lenA - lenB;
        pL = headA;
        pS = headB;
        if(len < 0) {
            pL = headB;
            pS = headA;
            len = lenB - lenA;
        }
        for(int i = 0; i < len; i++) {
            pL = pL.next;
        }
        while(pL != pS) {
            pL = pL.next;
            pS = pS.next;
        }
        return pL;
    }