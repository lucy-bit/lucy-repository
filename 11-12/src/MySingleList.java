/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -12
 * Time: 16:40
 */
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

    public MySingleList() {
        this.head = null;
    }
}
    //头插法
    public void addFirst(int data){
        ListNode node = new ListNode(data);
        if(this.head == null) {
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }

    //尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        ListNode cur = this.head;
        //0、判断是否是第一次插入
        if(this.head == null) {
            this.head = node;
        }else {
            //1、找尾巴
            while (cur.next != null) {
                cur = cur.next;
            }
            //2、进行插入
            cur.next = node;
        }
    }
    //打印单链表数据
    public void display(){
        if(this.head == null) {
            return;
        }
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }
//反转单链表
public ListNode reverseList() {
    ListNode cur = this.head;
    ListNode prev = null;
    ListNode newHead = null;
    if(this.head == null) {
        return null;
    }
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
//找到链表当中倒数第k个数
public ListNode findKthToTail(int k) {
    //判断k的合法性
    if(k <= 0) {
        return null;
    }
    //让fast先向后走k-1步，然后fast和slow同步走
    ListNode fast = this.head;
    ListNode slow = this.head;
    while(k-1 < 0) {
        if(fast.next != null) {
            fast = fast.next;
            k--;
        }else {
            System.out.println("没有这个节点");
            return null;
        }
    }
    while(fast.next != null) {
        fast = fast.next;
        slow = slow.next;
    }
    return slow;
}
//以x为基准分割链表
public ListNode partition(int x) {
    ListNode bs = null;
    ListNode be = null;
    ListNode as = null;
    ListNode ae = null;
    ListNode cur = this.head;
    while(cur != null) {
        if(cur.data < x) {
            //判断是否为第一次插入
            if(bs == null) {
                bs = cur;
                be = cur;
            }else {
                be.next = cur;
                be = be.next;
            }
        }else {
            if(as == null) {
                as = cur;
                ae = cur;
            }else {
                ae.next = cur;
                ae = ae.next;
            }
        }
        cur = cur.next;
    }
    if(bs == null) {
        return as;
    }
    be.next = as;
    //避免出现死循环；
    if(as != null) {
        ae.next = null;
    }
    return bs;
}
//7. 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针
public ListNode deleteDuplication() {
    ListNode cur = this.head;
    ListNode newHead = new ListNode(-1);
    ListNode tmp = newHead;
    if(this.head == null) {
        return null;
    }
    while(cur != null) {
        if(cur.next != null && cur.data == cur.next.data) {
            while(cur.next != null && cur.data == cur.next.data) {
                cur = cur.next;
            }
            cur = cur.next;
        }else {
            tmp.next = cur;
            tmp = tmp.next;
            cur = cur.next;
        }
    }
    tmp.next = null;
    return newHead;
}

//8. 链表的回文结构
public boolean chkPalindrome() {
    //先判断
    if(this.head == null) {
        return false;
    }
    if(this.head.next == null) {
        return true;
    }
    ListNode fast = this.head;
    ListNode slow = this.head;
    //找到中间节点
    while(fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
    }
    //进行反转操作
    ListNode cur = slow.next;
    while(cur != null) {
        ListNode curNext = cur.next;
        cur.next = slow;
        slow = slow.next;
        cur = curNext;
    }
    //让slow向前走，head往后走
    while(slow != this.head) {
        if(slow.data != this.head.data) {
            return false;
        }
        //偶数的情况
        if(this.head.next == slow) {
            return true;
        }
        slow = slow.next;
        this.head = this.head.next;
    }
    return true;
}

//10. 给定一个链表，判断链表中是否有环
public boolean hasCycle() {
    ListNode fast = this.head;
    ListNode slow = this.head;
    while(fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
        if(slow.data == fast.data) {
            return true;
        }
    }
    return false;
}

//11. 给定一个链表，返回链表开始入环的第一个节点。
public ListNode detectCycle() {
    ListNode fast = this.head;
    ListNode slow = this.head;
    while(fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
        if (slow.data == fast.data) {
            break;
        }
    }
    if(fast == null || fast.next == null) {
        return null;
    }
    slow = this.head;
    while(slow != fast) {
        slow = slow.next;
        fast = fast.next;
    }
    return slow;
}
//再写一遍链表的回文结构
/*public boolean chkPalindrome() {
    if(this.head == null) {
        return false;
    }
    if(this.head.next == null) {
        return true;
    }
    ListNode fast = this.head;
    ListNode slow = this.head;
    while(fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
    }
    //反转
    ListNode cur = slow.next;
    while(cur != null) {
        ListNode curNext = cur.next;
        cur.next = slow;
        slow = slow.next;
        cur = curNext;
    }
    while(slow != this.head) {
        if(slow.data != this.head.data) {
            return false;
        }
        if(this.head.next == slow) {
            return true;
        }
        slow = slow.next;
        this.head = this.head.next;
    }
    return true;
}*/

//以x为基准分割链表
public ListNode partition(int x) {
    ListNode bs = null;
    ListNode be = null;
    ListNode as = null;
    ListNode ae = null;
    ListNode cur = this.head;
    while(cur != null) {
        if(cur.data < x) {
            if(bs == null) {
                bs = cur;
                be =cur;
            }else {
                be.next = cur;
                be = be.next;
            }
        }else {

        }
        cur = cur.next;
    }
    if(bs == null) {
        return as;
    }
    be.next = as;
    if(as != null) {
        ae.next = null;
    }
    return bs;
}

//再写一遍倒数第k个节点
/*public ListNode findKthToTail(int k) {
    if(k <= 0) {
        return null;
    }
    ListNode fast = this.head;
    ListNode slow = this.head;
    while(k-1 < 0) {
        if(fast.next != null) {
            fast = fast.next;
            k--;
        }else {
            System.out.println("没有这个节点");
            return null;
        }
    }
    while(fast.next != null) {
        fast = fast.next;
        slow = slow.next;
    }
    return slow;
}*/

//反转单链表
/*public ListNode reverseList() {
    ListNode cur = this.head;
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

}*/

//5. 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的



//2019-1114
//找 链表的中间结点

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }


class MySingleList {
}
