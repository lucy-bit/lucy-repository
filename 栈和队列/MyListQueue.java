/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2019-12-10
 * Time: 19:28
 */
public class MyListQueue {
    static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    public Node front;
    public Node rear;
    public int usedSize;

    public boolean isEmpty() {
        return this.usedSize == 0;
    }
    //入队
    public void offer(int data) {
        Node node = new Node(data);
        if(isEmpty()) {
            this.front = node;
            this.rear = front;
        }else {
            this.rear.next = node;
            this.rear = node;
        }
        this.usedSize++;
    }
    public int poll() {
        if(isEmpty()) {
           throw new UnsupportedOperationException("队列为空");
        }
        int val = this.front.data;
        this.front = this.front.next;
        this.usedSize--;
        return val;
    }
    public int peek() {
        if(isEmpty()) {
            throw new UnsupportedOperationException("队列为空");
        }
        return this.front.data;
    }
}
