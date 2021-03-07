import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -06
 * Time: 18:41
 */
class Node {
     int val;
     Node next;
    public Node(int val,Node next) {
        this.val = val;
        this.next = next;
    }
    public Node(int val) {
        this(val,null);
    }
}
public class MyQueue {
    //用栈实现队列
    //定义两个栈，一个用来出队，一个用来入队
    private Stack<Integer> s1 ;
    private Stack<Integer> s2 ;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    public void offer(int val) {
        s1.push(val);
    }
    public int pop() {
        if(s2.empty()) {
            for(int i = 0; i < s1.size(); i++) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

/*
    private Node head;
    private Node tail;
    private int size;

    public void offer(int val) {
        Node node = new Node(val);
        if(head != null) {
            node.next = head;
            node = head;
        }else {
            head = node;
        }
        size++;
    }

    public int poll() {
        if(size == 0) {
            throw new RuntimeException("队列为空");
        }

        Node cur = head;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
        return cur.val;
    }

    public int peek() {
        if(size == 0) {
            throw new RuntimeException("队列为空");
        }
        return head.val;
       */
/* Node cur = head;
        head = head.next;
        if(head == null) {
            tail = null;
        }

        return cur.val;*//*

    }
*/

}
