import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2019-12-15
 * Time: 12:32
 */
public class TestDemo {

    public static void main3(String[] args) {
        //默认是一个小根堆
        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(27);
        queue.offer(37);
        queue.offer(25);
        queue.offer(57);
        System.out.println(queue.peek());
    }

    public static void main(String[] args) {
        int[]  array = {27,15,19,18,28,34,65,49,25,37 };
        TestHeap testHeap = new TestHeap();
        testHeap.createHeap(array);
        testHeap.show();
        testHeap.pushHeap(100);
        testHeap.show();
        testHeap.popHeap();
        testHeap.show();
        System.out.println(testHeap.getHeapTop());
        System.out.println("================");
        testHeap.heapSort();
        testHeap.show();
    }



    public static void main1(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = binaryTree.buildTree();
        binaryTree.preOrderTraversal(root);
        System.out.println();
        binaryTree.preOrderTraversalNor(root);
        System.out.println("==================");
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
        System.out.println("================");
        binaryTree.levelOrderTraversal(root);
        System.out.println("=================");
        /*TreeNode node = binaryTree.find(root,'u');
        System.out.println(node.value);*/
        TreeNode root2 = binaryTree.buildTree
                ("abc##de#g##f###");

        binaryTree.preOrderTraversal(root2);
        System.out.println();
        binaryTree.inOrderTraversal(root2);
    }
}
