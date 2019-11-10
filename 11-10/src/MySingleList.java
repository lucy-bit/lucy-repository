/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -10
 * Time: 9:46
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
//3. 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。如果有两个中间结点，则返回第二个中间结点。
    public middleListNode() {
        ListNode fast = this.head;
        ListNode slow = this.head;
        while(fast != null || fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

    }
    //以x为基准分割链表
    public ListNode partition(int x) {
        ListNode bs = null;
        ListNode be = null;
        ListNode as = null;
        ListNode ae = null;
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.data < x) {
                //是不是第一次插入
                if (bs == null) {
                    bs = cur;
                    be = cur;
                } else {
                    be.next = cur;
                    be = be.next;
                }
            } else {
                //是不是第一次插入
                if (as == null) {
                    as = cur;
                    ae = cur;
                } else {
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = cur.next;
        }
        if(bs == null) {
            return as;
        }
            //如果as不为空，那么就让ae.next = null，以防出现死循环的情况
        be.next = as;
        if(as != null) {
            ae.next = null;
        }
        return bs;

    }

    //再写一遍
    public ListNode partition(int x) {
        ListNode bs = null;
        ListNode be = null;
        ListNode as = null;
        ListNode ae = null;
        ListNode cur = this.head;
        if(cur == null || cur.next == null) {
            return cur;
        }
        while(cur != null) {
            if(cur.data < x) {
                //判断是否为以第一插入
                if(bs == null) {
                    bs = cur;
                    be = cur;
                }else {
                    be.next = cur;
                    be = be.next;
                }
            }else {
                //判断是否为第一次插入
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
        //判断
        if(bs == null) {
            return as;
        }
        be.next = as;
        //防止死循环
        if(as != null) {
            ae = null;
        }
        return bs;
    }

    //再写一遍
    public ListNode partition(int x) {
        //分析：定义出两个分链表
        ListNode bs = null;
        ListNode be = null;
        ListNode as = null;
        ListNode ae = null;
        ListNode cur = this.head;
        while(cur != null) {
            if(cur.data < x) {
                //判断是否为第一次输入，两次的方式是不一样的
                bs = cur;
                be = cur;
            }else {
                be = be.next;

            }
        }
    }



    //删除链表中所有重复的节点
    //前提：要删除的链表需要时有序的
    public ListNode deleteDuplication(){
        ListNode cur = this.head;
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        if(cur == null || cur.next == null) {
            return cur;
        }
        while (cur != null) {
            //重复的节点
            //要保证cur.next不为空，因为后面有用到cur.next,而且cur.next != null只能在前面，顺序不能乱
            if(cur.next != null
                    && cur.data == cur.next.data) {
                //在循环内部也需要判断cur.next是否为空
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
        //保证重复的节点在链表的最后的情况
        //最后一个节点如果也是重复的，需要将tmp.next = null
        tmp.next = null;
        return newHead.next;
    }

   /* //再写一遍
    public ListNode deleteDuplication() {
        ListNode cur = this.head;
        ListNode newHead =  new ListNode(-1);
        ListNode tmp = newHead;
        if(cur == null || cur.next == null) {
            return cur;
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
        return newHead.next;
    }
*/
   public boolean chkPalindrome() {
       if(this.head == null) {
           return false;
       }
       if(this.head.next == null) {
           return true;
       }
       //1、找到单链表的中间节点
       ListNode fast = this.head;
       ListNode slow = this.head;
       while (fast != null && fast.next != null) {
           fast = fast.next.next;
           slow = slow.next;
       }
       //2、反转单链表
       ListNode cur = slow.next;
       while (cur != null) {
           ListNode curNext = cur.next;
           cur.next = slow;
           slow = cur;
           cur = curNext;
       }
       //3、fast/slow往前    head往后走
        while(fast != this.head) {
           if(slow.data != this.head.data) {
               return false;
           }
           //判断偶数，偶数不会隔节点
            if(this.head.next == slow) {
               return true;
            }
           slow = slow.next;
           this.head = this.head.next;
        }
        return true;
   }

   //再写一遍
   public boolean chkPalindrome() {
       //1、找到中间节点
       ListNode fast = this.head;
       ListNode slow = this.head;
       while (fast != null && fast.next != null) {
           fast = fast.next.next;
           slow = slow.next;
       }
       //2、反转中间节点之后的部分
       ListNode cur = slow.next;
       while (cur != null) {
           ListNode curNext = cur.next;
           cur.next = slow;
           slow = cur;
           cur = curNext;
       }
       //3、让fast/slow往前走    head往后走
       {
           fast
       }
   }


   //找到环形链表的入口
    public ListNode detectCycle() {
       if(this.head == null) {
           return null;
       }
       ListNode fast = this.head;
       ListNode slow = this.head;
       while(fast != null && fast.next != null) {
           fast = fast.next.next;
           slow = slow.next;
           if(fast == slow) {
               slow = this.head;
               while(slow != fast) {
                   slow = slow.next;
                   fast = fast.next;
               }
               return slow;
           }
       }
       return null;
    }

    //反转链表

    class MySingleList {

    }
}
