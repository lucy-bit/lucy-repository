/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -04 -18
 * Time: 23:54
 */
public class Main {
    class Node {
        //定义不带头节点的非循环单链表
        public int data;
        public Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    public class MyLinkedList {
        public Node head;//存放单链表头节点的引用

        //头插法
        public void addFirst(int data) {
            Node node = new Node(data);
            if(this.head == null) {
                this.head = node;
                return;
            }
            node.next = this.head;
            this.head = node;
        }

        //尾插法
        public void addLast(int data) {
            Node node = new Node(data);
            if(this.head == null) {
                this.head = node;
                return;
            }
            Node cur = this.head;
            while(cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }

        //查找关键字key是否在单链表中
        public boolean contains(int key) {
            Node cur = this.head;
            while(cur != null) {
                if(cur.data == key) {
                    return true;
                }
                cur = cur.next;
            }
            return false;
        }

        //得到单链表的长度
        public int size() {
            Node cur = this.head;
            int ret = 0;
            while(cur != null) {
                ret++;
                cur = cur.next;
            }
            return ret;
        }
        //任意位置插入，第一个数据节点为0号下标
        public void addIndex(int index,int data) {
            if(index<0 || index > this.size()) {
                return;
            }
            if(index == 0) {
                //相当于头插法
                addFirst(data);
                return;
            }
            if(index == this.size()) {
                addLast(data);
                return;
            }
            Node cur = this.head;
            Node node = new Node(data);
            for(int i = 0; i < index-1; i++) {
                cur = cur.next;
            }
            cur.next = node.next;
            cur.next = node;
        }
        //打印单链表
        public void display() {
            Node cur = this.head;
            while(cur != null) {
                System.out.print(cur.data + " ");
                cur = cur.next;
            }
        }
    }

    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode cur = head;
        ListNode prev = null;
        ListNode newHead = null;
        while(cur != null) {
            ListNode curNext = cur.next;
            if(curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }


    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
