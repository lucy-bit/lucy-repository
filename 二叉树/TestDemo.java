import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2019-12-15
 * Time: 12:32
 */
public class TestDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = binaryTree.buildTree();
        binaryTree.preOrderTraversal(root);
        System.out.println();
        binaryTree.inOrderTraversal(root);
        System.out.println();
        binaryTree.postOrderTraversal(root);
        System.out.println();
        int ret = binaryTree.getSize2(root);
        System.out.println(ret);
        binaryTree.getSize1(root);
        System.out.println(BinaryTree.size);
        ret = binaryTree.getLeafSize2(root);
        System.out.println(ret);

        binaryTree.getLeafSize1(root);
        System.out.println(BinaryTree.leafSize);

        ret =binaryTree.getKLevelSize(root,3);
        System.out.println(ret);

        TreeNode node = binaryTree.find(root,'u');
        System.out.println(node.value);

    }
}
