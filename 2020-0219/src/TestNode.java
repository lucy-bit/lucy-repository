/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -02 -19
 * Time: 17:20
 */
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {

    }
    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}


public class TestNode {
    public Node head = new Node();
    public Node copyRandomList(Node head) {
        Node copyNode = new Node();
        Node cur = head;
        
    }
    public static void main(String[] args) {

    }
}
