/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -23
 * Time: 19:58
 */
//定义节点类
    class ListNode {
        public int data;
        public ListNode next;
        //构造函数
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
}
class MySingleList {
        //标志头节点
    public ListNode head;
    //构造函数
    public MySingleList() {
        this.head = null;
    }
    //头插法
    public void addFirst(int data) {
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
        if(this.head == null) {
            this.head = node;
        }else {
          while(cur.next != null) {
              cur = cur.next ;
          }
          cur.next = node;
        }
    }
    private ListNode searchIndex(int index) {
        ListNode prev = this.head;
        int count = 0;
        while(count < index - 1) {
            prev = prev.next;
            count++;
        }
        return prev;
    }
    public boolean addIndex(int index,int data) {
        //下标不合法
        if(index < 0 || index > getLength()) {
            return false;
        }
    }

    public int getLength() {
        int count = 0;
        ListNode cur = this.head;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
}
