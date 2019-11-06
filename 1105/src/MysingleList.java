/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -05
 * Time: 16:27
 */

//定义链表
class ListNode {
    public int data;
    public ListNode next;
    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class MysingleList {
    public ListNode head;
    public MysingleList() {
        this.head = null;
    }

    //头插法
    public void addFirst(int data) {
        //分情况，如果链表为空
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
        ListNode node =  new ListNode(data);
        ListNode cur = this.head;
        if(this.head == null) {
            this.head = node;
        }else {
            while(cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    //任意位置插入,第一个数据节点为0号下标
    //找到index-1位置的节点  返回当前节点的引用
    public int getLength() {
        int count = 0;
        ListNode cur = this.head;
        while(cur.next != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }
    public ListNode searchIndex(int index) {
        //让head移index-1位就行
        ListNode prev = this.head;
        for(int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        return prev;
    }
    public boolean addIndex(int index,int data) {
        //写一个方法来找到index-1的位置
        //先判断index的合法性
        ListNode node = new ListNode(data);
        if(index < 0 || index > getLength()) {
            return false;
        }
        //如果index == 0,相当于头插入法
        if(index == 0) {
            addFirst(data);
            return true;
        }
       ListNode prev = searchIndex(index);
        node.next = prev.next;
        prev.next = node;
        return true;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        if(this.head == null) {
            return false;
        }
        ListNode cur = this.head;
        while(cur.next != null) {
            if(cur.data == key) {
                return true;
            }
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        //找前驱
    }
    //删除所有关键字为key的节点
    public ListNode searchNode(int key) {
        ListNode prev = this.head;
        while(prev.next != null) {
            if(prev.next.data == key) {
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }
    public void removeAllKey(int key) {
        //如果删除的为第一节点，最后一步处理
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
        if(this.head.data == key) {
            this.head = this.head.next;
        }
    }

    //反转单链表
    public ListNode reverseList() {
        ListNode prev = null;
        ListNode cur = this.head;
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

    public ListNode reverseList2() {
        //利用头插法
        if(this.head == null) {
            return null;
        }
        ListNode cur = this.head.next;
        ListNode newHead = null;
        while(cur != null) {
            addFirst(cur.data);
            cur = cur.next;

        }
        head.next = null;
        return this.head;
    }
    //给定一个带有头结点 head 的非空单链表，返回链表的中间结点。如果有两个中间结点，则返回第二个中间结点
    public ListNode middleNode() {
        ListNode cur = this.head;
        int length = getLength();
        for (int i = 0; i < length / 2; i++) {
            cur = cur.next;
        }
        return cur;
    }
    public ListNode middleNode2(){
        ListNode slow = this.head;
        ListNode fast = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public void display2(ListNode middleNode2) {
        System.out.println(middleNode2.data);
    }
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

   // 输入一个链表，输出该链表中倒数第k个结点
    //只遍历一遍的话，定义fast和slow同时走，先让fast走k-1步，这时slow开始走，当fast走到最后一个节点时，slow对应位置的节点即为所求
    //要对k进行判断，如果k < 0 或者 k > 链表长度均不行
    public ListNode findKthToTail(int k) {
        ListNode fast = this.head;
        ListNode slow = this.head;
        if(k <= 0 || this.head == null) {
            return null;
        }
        for(int i = 0; i < k-1; i++) {
            if(fast.next != null) {
                fast = fast.next;
            }else {
                return null;
            }
        }
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
