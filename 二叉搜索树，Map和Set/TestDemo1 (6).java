/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2020-02-19
 * Time: 9:03
 */
public class TestDemo1 {
    public static void main(String[] args) {
        TestBinaryTree testBinaryTree = new TestBinaryTree();
        testBinaryTree.insert(19);
        testBinaryTree.insert(9);
        testBinaryTree.insert(3);
        testBinaryTree.insert(10);
        testBinaryTree.insert(14);
        testBinaryTree.insert(24);

        testBinaryTree.inorder(testBinaryTree.root);
        System.out.println();
        testBinaryTree.preOrder(testBinaryTree.root);

        testBinaryTree.remove(10);
        System.out.println("====================");
        testBinaryTree.inorder(testBinaryTree.root);
        System.out.println();
        testBinaryTree.preOrder(testBinaryTree.root);
    }
}
