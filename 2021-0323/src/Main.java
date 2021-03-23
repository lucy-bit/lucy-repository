/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -23
 * Time: 23:51
 *//*

*/
/**
 public class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

 public TreeNode(int val) {
 this.val = val;

 }

 }
 *//*

public class Solution {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        //思路：比较root1的根节点和root2的根节点是否相同
        //根据此思路，应用递归思想，还要建立一个判断包含子二叉树结构的函数

        //约定空树不是任意一个树的子结构,那么root1和root2任意一个为空都是false
        if(root1 == null || root2 == null) {
            return false;
        }
        if(judgeSubtree(root1,root2)) {
            return true;
        }

        return (HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2)) ;
    }
    public boolean judgeSubtree(TreeNode node,TreeNode subNode) {
        //递归实现判断subNode是否是node子结构（subNode和node的根节点相同）
        if(subNode == null) {
            //子树遍历完毕，全部匹配
            return true;
        }
        if(node == null) {
            return false;
        }
        if(node.val == subNode.val) {
            return judgeSubtree(node.left,subNode.left) && judgeSubtree(node.right,subNode.right);
        }
        return false;
    }
}*/
/*public TreeNode Mirror (TreeNode pRoot) {
        // write code here
        //思路：先镜像当前节点的左右节点，然后递归镜像左孩子和右孩子
        if(pRoot == null) {
        return pRoot;
        }
        TreeNode tmp = pRoot.left;
        pRoot.left = pRoot.right;
        pRoot.right = tmp;
        Mirror(pRoot.left);
        Mirror(pRoot.right);
        return pRoot;

        }*/
import java.util.*;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        //栈：先进后出
        //分别用i和j遍历两个栈，如果push[i] != pop[j],i++
        //如果push【i】和pop【i】相等，将push【i】压入栈中，同时i++，j++
        //然后比较栈顶元素和pop【j】是否相等，相等的话弹出栈顶元素并且j++；不相等的话继续重复上面的比较
        //直到push遍历完，如果此时pop也遍历完就是true；反之为false
        Stack<Integer> stack = new Stack<Integer>();
        int i = 0;
        int j = 0;
        while(i < pushA.length) {
            if(pushA[i] != popA[j]) {
                stack.push(pushA[i]);
                i++;
            }else {
                i++;
                j++;
                while(!stack.empty() && stack.peek() == popA[j]) {
                    stack.pop();
                    j++;
                }
            }
        }
        if(stack.empty()) {
            return true;
        }
        return false;
    }
}