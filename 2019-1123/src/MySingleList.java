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
    //插入到index位置
    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data){
        //下标不合法
        if(index < 0 || index > getLength()) {
            return false;
        }
        //头插法
        if(index == 0) {
            addFirst(data);
            return true;
        }
        ListNode prev = searchIndex(index);
        ListNode node = new ListNode(data);
        node.next = prev.next;
        prev.next = node;
        return false;
    }

    public int getLength() {
        int count = 0;
        ListNode cur = this.head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
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

    //查找是否包含关键字key是否在单链表当中
    public boolean contains1(int key){
        ListNode cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    public ListNode contains2(int key){
        ListNode cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    private ListNode searchPrev(int key) {
        ListNode prev = this.head;
        while (prev.next != null) {
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
        if(this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        //2、找到删除的节点的前驱  如果找不到  返回null
        ListNode prev = searchPrev(key);
        if(prev == null) {
            System.out.println("没有你要删除的节点");
            return;
        }
        ListNode del = prev.next;
        //3、进行删除
        prev.next = del.next;
    }

    //删除所有值为key的节点
    public void removeAllKey(int key){
        ListNode prev = this.head;
        ListNode cur = this.head.next;
        while (cur != null) {
            if(prev.next.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        //最后处理
        if(this.head.data == key) {
            this.head = this.head.next;
        }
    }
    public void clear(){
        //this.head = null;
        while (this.head.next != null) {

            ListNode cur = this.head.next;
            this.head.next = cur.next;
        }
        this.head = null;
    }

}
