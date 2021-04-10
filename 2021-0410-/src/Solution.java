import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -04 -10
 * Time: 17:35
 */

 class TreeNode {
    int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }}
public class Solution {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
    }
    //摘樱桃
    public int maxRoot(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int countFive = 0;
        int countTwo = 0;
        if(findRed(root.left) && findRed(root.right)) {
            countFive++;
        }else if((findRed(root.left) && root.right == null) || (findRed(root.right) && root.left == null)) {
            countTwo++;
        }else {
            return maxRoot(root.left) + maxRoot(root.right);
        }
        return 5*countFive + 2*countTwo;

    }

    private static boolean findRed(TreeNode root) {
        if(root == null) {
            return false;
        }
        if(root.left == null && root.right == null) {
            return true;
        }
        return false;
    }


    //层次遍历
    public static int maxCherry(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int countFive = 0;
        int countTwo = 0;
        while(!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if(cur != null) {
                queue.offer(cur.left);
                queue.offer(cur.right);
            }
            if(findRed(root.left) && findRed(root.right)) {
                countFive++;
            }else if((findRed(root.left) && root.right == null) || (findRed(root.right) && root.left == null)) {
                countTwo++;
            }
        }
        return 5*countFive + 2*countTwo;
    }

    //2. 水池问题

}
