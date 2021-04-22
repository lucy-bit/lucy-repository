/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -04 -22
 * Time: 21:48
 *//*

public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence == null || sequence.length == 0) {
            return false;
        }
        return isBST(sequence,0,sequence.length-1);
    }
    public boolean isBST(int[] arr,int left,int root) {
        if(left >= root) {
            return true;
        }
        //找到左右子树的分界点——右子树的起始下标
        int i = 0;
        for(i = left; i < root; i++) {
            if(arr[root] < arr[i]) {
                break;
            }
        }
        //判断右子树是否都大于根节点
        for(int j = i; j <= root-1; j++) {
            if(arr[j] < arr[root]) {
                return false;
            }
        }
        return isBST(arr,left,i-1) && isBST(arr,i,root-1);
    }
}*/

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
