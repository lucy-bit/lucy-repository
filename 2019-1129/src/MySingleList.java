/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -29
 * Time: 22:02
 */
class ListNode {
    public int data;
    public ListNode next;
    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class MySingList {
    public ListNode head;

    public MySingList() {
        this.head = null;
    }
}


class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }

        //1、老新进行进行交替链接
        Node cur = head;
        while(cur != null) {
            Node node = new Node(cur.val,cur.next,null);
            Node tmp = cur.next;
            cur.next = node;
            cur = tmp;
        }
        //2、修改random
        cur = head;
        while(cur != null) {
            if(cur.random != null) {
                cur.next.random = cur.random.next;
                cur = cur.next.next;
            }else{
                cur = cur.next.next;
            }
        }
        //3、将老新节点 打开
        cur = head;
        Node newHead = cur.next;
        while(cur.next != null) {
            Node tmp = cur.next;
            cur.next = tmp.next;
            cur = tmp;
        }
        return newHead;
    }
}

public class TestDemo {

    public static ListNode  mergeTwoLists(ListNode headA, ListNode headB){
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        while (headA != null && headB != null) {
            if(headA.data < headB.data) {
                tmp.next = headA;
                headA = headA.next;
                tmp = tmp.next;
            }else {
                tmp.next = headB;
                headB = headB.next;
                tmp = tmp.next;
            }
        }
        if (headA != null) {
            tmp.next = headA;
        }
        if(headB != null) {
            tmp.next = headB;
        }
        return newHead.next;
    }

    public static ListNode getIntersectionNode
            (ListNode headA, ListNode headB) {
        if(headA == null || headB == null) {
            return null;
        }

        ListNode pL = headA;//永远指向长的单链表
        ListNode pS = headB;//永远指向短的单链表
        int lenA = 0;
        int lenB = 0;
        //求的lenA  lenB
        while (pL != null) {
            lenA++;
            pL = pL.next;
        }
        while (pS != null) {
            lenB++;
            pS = pS.next;
        }
        pL = headA;
        pS = headB;
        //差值-》最长的单链表先走len步
        int len = lenA-lenB;
        if(len < 0) {
            pL = headB;
            pS = headA;
            len = lenB-lenA;
        }
        //让pL先走len步
        while (len > 0) {
            pL = pL.next;
            len--;
        }
        //开始一起走  (pL  != pS ) {一人一步走}
        while (pL != pS) {
            pS = pS.next;
            pL = pL.next;
        }
        if(pL == null) {
            return null;
        }
        return pL;
    }

    public static void createCut
            (ListNode headA, ListNode headB) {
        headA.next = headB.next.next;
    }

    public static void main(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.addLast(1);
        mySingleList.addLast(2);
        mySingleList.addLast(3);
        mySingleList.addLast(10);
        mySingleList.display();//1  2  3  10
        MySingleList mySingleList2 = new MySingleList();
        mySingleList2.addLast(3);
        mySingleList2.addLast(4);
        mySingleList2.addLast(10);
        mySingleList2.addLast(17);
        mySingleList2.display();// 3  4  10 17

        createCut(mySingleList.head,
                mySingleList2.head);

        ListNode node = getIntersectionNode(mySingleList.head,
                mySingleList2.head);
        System.out.println(node.data);
        //mySingleList.display2(newHead);
    }
}






/*
class ListNode {
    public int data;
    public ListNode next;
    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class MySingleList {
    public ListNode head;

    public MySingleList() {
        this.head = null;
    }
}
*/

