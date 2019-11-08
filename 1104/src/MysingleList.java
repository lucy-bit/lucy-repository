/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -04
 * Time: 16:21
 */
class ListNode {
    public int data;
    public ListNode next;
    public ListNode(int data) {
        this.data = data;
        this.next = null;//初始 或者 不初始化都行
    }
}
public class MysingleList {
    //定义一个头head
    ListNode head;

    public MysingleList() {
        this.head = null;
    }

    //头插法
    //分情况：假如链表为空，只需将node = head即可；假如链表不为空，那么node.next = head 将node插入链表头部，然后head = node 调整链表的头部
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
    //1、判断链表是否为空
    //2、找链表的尾部
    //3、插入node
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        //定义一个cur遍历链表找尾部，因为如果用head遍历，到最后head没办法再回到头部
        ListNode cur = this.head;
        //判断
        if (this.head == null) {
            this.head = node;
        } else {
            //找尾部
            while (cur.next != null) {
                cur = cur.next;
            }
            //插入node
            cur.next = node;
        }
    }

    public void addLast2(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
        } else {
            while (this.head.next != null) {
                this.head = this.head.next;
            }
            this.head = node;
            //head没办法回到头部
        }

    }


    public int getListNode() {
        ListNode cur = this.head;
        int count = 0;
        while (cur.next != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }

    public ListNode searchIndex(int index) {
        //要想找到index前一项位置，需要从头开始向后走index-1项
        ListNode prev = this.head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        return prev;
    }


    //任意位置插入,第一个数据节点为0号下标  
    public boolean addIndex(int index, int data) {
        //找到index的前一位的位置，通过node.next = prev.next; prev.next = node 实现插入
        //注意：
        //1、判读index的合法性，如果index < 0 或是 index大于链表长度，均属于不合法的情况
        //2、如果要插入的位置为0，插入等同于头插法；
        ListNode node = new ListNode(data);
        if (index < 0 || index > getListNode()) {
            return false;
        }
        if (index == 0) {
            addFirst(data);
            return true;
        }
        ListNode prev = searchIndex(index);
        node.next = prev.next;
        prev.next = node;
        return true;
    }

    //打印单链表的数据
    //也要进行判断，若链表为空，不打印直接返回即可
    public void display() {
        if(this.head == null) {
            return;
        }
        ListNode cur = this.head;
        while(cur.next != null) {
            System.out.println(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //查找是否包含关键字key是否在单链表当中    
     public boolean contains(int key) {
        ListNode cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
     }
     //删除第一次出现关键字为key的节点  
    //要实现删除的操作，可以找到要删除节点del的前一项prev，然后prev.next = del.next的操作即可实现删除
    //如果要删除的节点为头节点的话，直接this.head = this.head.next，这时候在找前驱就不合适了
    //实现的时候为了更有条理，将找prev写为一个方法searchPrev,在此方法内要注意找prev的前提是prev.next != null
    public ListNode searchPrev(int key) {
        ListNode prev = this.head;
        while(prev.next != null) {
            if(prev.next.data == key) {
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }
    public void remove(int key) {
        //如果要删除的节点为头节点
        if(this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        //找到删除节点的前驱，找不到返回null
        ListNode prev = searchPrev(key);
        //要对prev进行判断，因为prev也有可能是null
        if(prev == null) {
            return;
        }
        //删除
        ListNode del = prev.next;
        prev.next = del.next;
    }
    //删除所有值为key的节点  
      public void removeAllKey(int key)
    //得到单链表的长度    
    public int size() {
        int count = 0;
        while
    }
    public void display()
    public void clear();

}
