/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -12
 * Time: 19:13
 */
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2019-11-03
 * Time: 11:35
 */
 public class TestDemo {


    public static ListNode mergeTwoLists(ListNode headA, ListNode headB) {
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        while (headA != null && headB != null) {
            if (headA.data < headB.data) {
                tmp.next = headA;
                headA = headA.next;
                tmp = tmp.next;
            } else {
                tmp.next = headB;
                headB = headB.next;
                tmp = tmp.next;
            }
        }
        if (headA == null) {
            tmp.next = headB;
        } else {
            tmp.next = headA;
        }
        return newHead.next;
    }
//合并链表（再写一遍）
public ListNode mergeTwoLists2(ListNode headA, ListNode headB) {
        //要使新合成的链表是有序的，需要对合成的链表进行排序
    ListNode newHead = new ListNode(-1);
    ListNode tmp = newHead;
    //循环结束的条件是headA/headB遍历完
    while(headA != null && headB != null) {
        //判断headA和headB的大小，将小的对应节点放在tmp后边，并且tmp和headA/headB都要向后走一个节点
        if(headA.data < headB.data) {
            tmp.next = headA;
            tmp = tmp.next;
            headA = headA.next;
        }else {
            tmp.next = headB;
            tmp = tmp.next;
            headB = headB.next;
        }
    }
    //因为两个链表都是有序的，所以直接将长的链表的剩余部分插到tmp后边即可
    if(headA == null) {
        tmp.next = headB;
    }else {
        tmp.next = headA;
    }
    return newHead.next;

}

    public void display2(ListNode newHead) {
        if (newHead == null) {
            return;
        }
        ListNode cur = newHead;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public ListNode getIntersectionNode(ListNode headA,ListNode headB) {
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
       /* if(len == 0) {
            return null;
        }*/
        for(int i = 0; i < len; i++) {
            pL = pL.next;
        }
        while(pL != pS) {
            pL = pL.next;
            pS = pS.next;
        }
        return pL;
}
public static void creatCut(ListNode headA,ListNode headB) {
        headA.next = headB.next.next;
}
    public static void main(String[] args) {
        MySingleList mySingleList = new MySingleList();
        MySingleList mySingleList2 = new MySingleList();
        mySingleList.addLast(1);
        mySingleList.addLast(2);
        mySingleList.addLast(3);
        mySingleList.addLast(10);
        mySingleList2.addLast(4);
        mySingleList2.addLast(5);
        mySingleList2.addLast(6);
        mySingleList2.addLast(8);
        mySingleList.display();
        mergeTwoLists(mySingleList.head,mySingleList2.head);

       // mySingleList.creteLoop();

        boolean flg = mySingleList.hasCycle();
        System.out.println(flg);
        /*ListNode newHead =  mySingleList.deleteDuplication();
        mySingleList.display2(newHead);
        ListNode newHead = mySingleList.partition(4);
        mySingleList.display2(newHead);*/



        /*ListNode node = mySingleList.middleNode();
        System.out.println(node.data);*/
       /* System.out.println("逆置");
        ListNode newHead = mySingleList.reverseList();
        mySingleList.display2(newHead);*/

       /* mySingleList.clear();
        System.out.println("fakfalls");
*/
       /*  mySingleList.removeAllKey(2);
        mySingleList.display();*/
       /*mySingleList.remove(99);
        System.out.println("删除99");
        mySingleList.display();//199 1 2 3 4 5 999
        mySingleList.remove(999);
        System.out.println("删除999");
        mySingleList.display();//199 1 2 3 4 5
        mySingleList.remove(2);
        System.out.println("删除2");
        mySingleList.display();//199 1 3 4 5*/

       /* boolean flg = mySingleList.contains1(99);
        System.out.println(flg);

        ListNode node = mySingleList.contains2(500);
        System.out.println(node.data);//5节点的地址*/
    }
}
