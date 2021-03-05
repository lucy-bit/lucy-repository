/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -05
 * Time: 23:55
 */
import javax.swing.tree.TreeNode;
import java.util.*;
/**
 public class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

 public TreeNode(int val) {
 this.val = val;

 }

 }
 */
public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        //思路：层次遍历，利用队列(先进先出)
        //1.将根节点存入队列中
        //2.如果队列不为空，队头元素出队，再将其左右节点入队
        //循环2操作，直到队列为空

        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root == null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.peek();
            if(node.left != null) {
                queue.offer(node.left);
            }
            if(node.right != null) {
                queue.offer(node.right);
            }

            list.add(queue.poll().val);
        }
        return list;
    }
}
