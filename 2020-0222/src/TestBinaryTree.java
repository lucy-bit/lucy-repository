/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -02 -23
 * Time: 15:33
 */
public class TestBinaryTree {
    static class Node {
        public int key;
        public Node left;
        public Node right;
        public Node(int key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }
    public Node root = null;
    public boolean insert(int key) {
        Node node = new Node(key);
        if(root == null) {
            root = node;
            return true;
        }
        Node cur = root;
        if(cur.key < key) {
            cur = cur.right;
        }else if(cur.key > key) {
            cur = cur.left;
        }else {
            cur
        }
    }
}
