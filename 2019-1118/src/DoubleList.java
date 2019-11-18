/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -18
 * Time: 15:52
 */
class ListNode {
    public int data;
    public ListNode prev;
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
    }
}
public class DoubleList {
    public ListNode head;//标志头
    public ListNode last;//标志尾


    //头插法
    public void addFirst(int data) {
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
    public void  addLast(int data) {
        ListNode node = new ListNode(data);
        //如果链表为空，那么插入方法和头插法一样
        if(this.head == null) {
            this.head = node;
            this.last = node;
        }else {
            this.last.next = node;
            node.prev = this.last;
            this.last = node;
        }
    }

    //打印链表
    public void display() {
      ListNode cur = this.head;
      while(cur != null) {
          System.out.print(cur.data + " ");
          cur = cur.next;
      }
        System.out.println();
    }


    private ListNode searchIndex(int index) {
        ListNode cur = this.head;
        if(index < 0 || index > size()) {
            return null;
        }
        for(int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data) {
        ListNode node = new ListNode(data);
        if(index == 0) {
            addFirst(data);
            return;
        }
        if(index == size()) {
            addLast(data);
            return;
        }
        if(this.head == null) {
            this.head = node;
            this.last = node;
            return;
        }
        ListNode cur = searchIndex(index);
        if(cur == null) {
            return;
        }
        node.next = cur;
        cur.prev.next = node;
        node.prev = cur.prev;
        cur.prev = node;
/*        node.prev = cur.prev;
        cur.prev.next = node;
        cur.prev = node;
        node.next = cur;*/
        return;

    }
    ////得到单链表的长度
    public int size() {
        ListNode cur = this.head;
        int size = 0;
        while(cur != null) {
            cur = cur.next;
            size++;
        }
        return size;
    }

    // //删除第一次出现关键字为key的结点
    public void remove(int key) {
        ListNode cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                //分三种情况，key在头、尾、中间的删除方式是不一样的
                if (cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                    return;
                } else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    } else {
                        this.last = cur.prev;
                    }
                }
                return;
            }
                cur = cur.next;
                //我第一次的想法
              /*  else if(cur.next == null) {
                    cur.prev.next = null;
                    return;
                }else {
                    cur.next.prev = cur.prev;
                    cur.prev.next = cur.next;
                    return;
                }
            }else {
                cur = cur.next;
            }*/
        }
    }
    //删除所有值为key的结点
    public void removeAllKey(int key) {
     /*   ListNode cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                //3种情况
                if(cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                }else {
                    //中间位置和尾巴
                    cur.prev.next = cur.next;
                    if(cur.next != null) {
                        cur.next.prev = cur.prev;
                    }else {
                        this.last = cur.prev;
                    }
                }
            }
            cur = cur.next;
        }*/
        ListNode cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                //分三种情况，key在头、尾、中间的删除方式是不一样的
                if (cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                }else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    } else {
                        this.last = cur.prev;
                    }
                }
                //与删除一个的不同之处在于，此处不需要再return
            }
            cur = cur.next;
        }
    }

    public void clear() {
        while(this.head != null) {
            ListNode cur = this.head.next;
            this.head.prev = null;
            this.head.next = null;
            this.head = cur;
        }
        this.last = null;
    }

}
