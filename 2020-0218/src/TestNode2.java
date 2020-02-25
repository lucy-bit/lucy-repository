/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -02 -18
 * Time: 23:42
 */
public class TestNode2<T> {
    static class Node<T> {
        public T data;
        public Node<T> next;
        public Node() {

        }
        public Node(T data) {
            this.data = data;
        }
    }
    public Node<T> head = null;
    public void insertHead(T data) {
        Node<T> node = new Node<>(data);
        if(this.head == null) {
            head = node;
        }else {
            node.next = head;
            head = node;
        }
    }
    public void insertTail(T data) {
        Node<T> node = new Node<>(data);
        if(this.head == null) {
            head = node;
        }else {
            Node<T> cur = this.head;
            while(cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }
    public void show() {
        Node<T> cur = this.head;
        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    public void show2(Node newHead) {
        Node<T> cur = newHead;
        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}
