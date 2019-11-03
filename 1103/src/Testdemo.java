/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -03
 * Time: 10:32
 */

/**
 * Created with IntelliJ IDEA.
 * Description: 不带头节点的单链表
 * User: GAOBO
 * Date: 2019-11-03
 * Time: 10:12
 */
//节点类
   // import java.util.Scanner;
class ListNode {
    public int data;
    public ListNode next;
    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class MySingleList {

    public ListNode head;//标志头
    public ListNode cur;//定义尾

    public MySingleList() {
        this.head = null;
    }

    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
    }

    //尾插法
    public void addLast(int data) {
        //判断是否是第一次插入
        //找尾巴
        //进行插入
        ListNode node = new ListNode(data);
        ListNode cur = this.head;
        if (this.head == null) {
            this.head = node;
            this.cur = head;
        } else {
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
            //?
        }
    }


    private ListNode searchIndex(int index) {
        ListNode prev = this.head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        return prev;
    }

    public int getLength() {
        ListNode cur = this.head;
        int count = 0;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }

    //插入到index位置
    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index, int data) {
        if (index < 0 || index > getLength()) {
            return false;
        }
        ListNode node = new ListNode(data);
        if (index == 0) {
            addFirst(data);
            return true;
        }
        ListNode prev = searchIndex(index);
        node.next = prev.next;
        prev.next = node;
        return false;
    }

    public void display() {
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }

    private ListNode searchPrev(int key) {
        ListNode prev = this.head;
        while(prev.next != null) {
            if(prev.next.data == key) {
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        //1、删除的节点如果是头结点
        if(head.data == key) {
            this.head = this.head.next;
            return;
        }
        //2、找到删除的节点的前驱  如果找不到  返回null
        ListNode prev = searchPrev(key);
        if (prev == null) {
            System.out.println("没有要删除的节点");
            return;
        }
        //3、进行删除
        ListNode del = prev.next;
        prev.next = del.next;
    }

    public void remove2(int key) {
        if(head == null) {
            return;
        }
        ListNode prev = this.head;
        ListNode cur = this.head.next;
        while(cur != null) {
            if(prev.next.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        //必须在最后一步判断头部的删除
        if(head.data == key) {
            this.head = this.head.next;
        }
    }
}

public class Testdemo {
    public static void main(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.addIndex(2,55);
        mySingleList.addFirst(1);
        mySingleList.addFirst(2);
        mySingleList.addFirst(3);
        mySingleList.addFirst(4);
        mySingleList.addFirst(5);
        mySingleList.addLast(99);
        mySingleList.addIndex(3,100);
        mySingleList.display();
        System.out.println();
        mySingleList.remove2(4);
        mySingleList.display();


    }

}

