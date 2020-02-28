/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -02 -19
 * Time: 9:04
 */
public class TestDemo {
    public static void main(String[] args) {
        TestBinaryTree testBinaryTree = new TestBinaryTree();
        testBinaryTree.insert(19);
        testBinaryTree.insert(9);
        testBinaryTree.insert(3);
        testBinaryTree.insert(10);
        testBinaryTree.insert(14);
        testBinaryTree.inorder(testBinaryTree.root);
        System.out.println();
        //testBinaryTree.preOrder(testBinaryTree.root);
        testBinaryTree.remove(9);
        testBinaryTree.inorder(testBinaryTree.root);

    }
}
