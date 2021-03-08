/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -08
 * Time: 22:17
 */
import java.util.*;
class Node {
    public char val;
    public Node left;
    public Node right;
    public Node(char val) {
        this.val = val;
    }
}

public class Main {
    public static int i = 0;
    //采用前序遍历的方式创建二叉树
    public static Node createTree(String str) {
        Node root = null;
        if(str.charAt(i) != '#') {
            root = new Node(str.charAt(i));
            i++;
            root.left = createTree(str);
            root.right = createTree(str);
        }else {
            i++;
        }
        return root;
    }
    //中序遍历
    public static void inOrderTraversal(Node root) {
        if(root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Node cur = createTree(str);
        inOrderTraversal(cur);
    }
}