/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -12 -17
 * Time: 16:05
 */
public class TestDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = binaryTree.buildTree();
        binaryTree.levelOrderTraversal(root);
        System.out.println(root);
    }
    public static void main2(String[] args) {
       A <String> a = new A<>("java");
        System.out.println(a.get());
    }
}
