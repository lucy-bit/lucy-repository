/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -09 -16
 * Time: 18:19
 */
class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int data) {
        this.data = data;
    }
    /* public Node(int data) {
        this.data = data;
    }*/
}
public class MyLinkedList {
    public Node head;
    public Node tail;
    //头插法
    public void addFirst(int data) {
        //如果是第一次插入
        Node node = new Node(data);
        if(head == null) {
            head = node;
            tail = node;
            return;
        }else {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }
    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        //第一次插入
        if(this.head == null) {
            this.head = node;
            this.tail = node;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = tail.next;
    }

    public int size(Node head) {
        int count = 0;
        while(head != null) {
            head = head.next;
            count++;
        }
        return count;
    }
    //任意位置插入
    private void checkIndex(int index) {
        if(index < 0 || index > size(head)) {
            throw new RuntimeException("index存在异常");
        }
    }
    private Node searchIndex(int index) {
        Node cur = head;
        for(int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur;
    }
    public boolean addIndex(int index,int data) {
        checkIndex(index);
        if(index == 0) {
            //头插法
        }
        Node cur = searchIndex(index);
        Node node = new Node(data);
        node.next= cur;
        node.prev = cur.prev;
        cur.prev.next = node;
        cur.next= node;
        return true;
    }

    public void remove(int key) {
        Node cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                //判断是否为头节点
                if(cur == this.head) {
                    this.head = this.head.next;
                    if(this.head != null) {
                        this.head.prev = null;
                    }
                }else {
                    cur.prev.next = cur.next;
                    //删除的是尾节点的情况
                    if(cur.next != null) {
                        cur.next.prev = cur.prev;
                    }else {
                        this.tail = cur.prev;
                    }
                }

            }
            cur = cur.next;
        }
    }

    //打印
    public void display() {
        Node cur = this.head;
        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //回收内存
    public void clear() {
        while(this.head != null) {
            Node cur = this.head.next;
            this.head.prev = null;
            this.head.next = null;
            this.head = cur;
        }
    }
}
