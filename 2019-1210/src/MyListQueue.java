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

    //入队
    public void offer(int data) {
        Node node = new Node(data);
        if(this.front == null) {
            this.front = node;
            this.rear = node;
        }else {
            this.rear.next = node;
            this.rear = node;
        }
        usedSize++;
    }
    //出队
    public int poll(int data) {
        Node node = new Node(data);
        if(this.front == null) {
            return -1;
        }
    }

}