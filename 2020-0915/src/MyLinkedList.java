/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -09 -15
 * Time: 16:05
 */

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

    //删除第一次出现关键字Key的节点
    private Node findPrev(int key) {
        Node prev = this.head;
        while(prev.next != null) {
            if(prev.next.data == key) {
                return prev;
            }else {
                prev = prev.next;
            }
        }
        return null;
    }
    public void remove(int key) {
        if(this.head == null) {
            return;
        }
        if(this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        Node prev = findPrev(key);
        if(prev == null){
            System.out.println("没有这个节点");
            return;
        }
        Node del = prev.next;
        prev.next = del.next;
    }

    //删除所有值为key的节点（难）要求：只遍历单链表一遍
    public void removeAllkey(int key) {
        if(this.head == null) {
            return;
        }
        Node prev = this.head;
        Node cur = prev.next;//代表要删除的节点
        while(cur != null) {
            if(cur.data == key) {
                prev.next = cur.next;
            }else {
                prev = prev.next;
            }
            cur = cur.next;
        }
        //最后检查一遍头节点的值是否为key
        if(this.head.data == key) {
            this.head = this.head.next;
        }
    }

    //释放内存
    public void clear() {
        this.head = null;
    }

    //反转单链表（重要且难）
    public void reverse() {

    }
}
