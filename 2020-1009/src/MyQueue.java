/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -10 -10
 * Time: 16:57
 */

class Node {
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class MyQueue {

    public Node rear;
    public Node front;

    public void offer(int data) {
        //采用尾插法
        Node node = new Node(data);
        //判断是否是第一次插入
        if(this.front == null) {
            this.front = node;
            this.rear = node;
        }else {
            this.rear.next = node;
            this.rear = node;
        }
    }

    public int poll() {
        if(isEmpty()) {
            throw new RuntimeException("队列为空");
        }else {
            int data = this.front.data;
            this.front = this.front.next;
            return data;
        }
    }
    public boolean isEmpty() {
        if(this.front == null) {
            return true;
        }
        return false;
    }
}
