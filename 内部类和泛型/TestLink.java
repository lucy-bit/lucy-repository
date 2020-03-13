/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2020-02-18
 * Time: 9:51
 */


public class TestLink<T> {
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
        if(head == null) {
            head = node;
        }else {
            node.next = head;
            head = node;
        }
    }
    public void insertTail(T data) {
        Node<T> node = new Node<>(data);
        if(head == null) {
            head = node;
        }else {
            Node<T> cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }
    public void show() {
        Node<T> cur = this.head;
        while (cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void show2(Node<T> newHead) {
        Node<T> cur = newHead;
        while (cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }
}
