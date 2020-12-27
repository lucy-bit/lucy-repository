/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -12 -26
 * Time: 21:11
 */



public class Solution {
    public boolean judgeSubtree(TreeNode A,TreeNode B) {
        if(A.val == B.val) {
            if(judgeSubtree(A.left,B.left) && judgeSubtree(A.right,B.right)) {
                return true;
            }
            return false;
        }else {
            return false;
        }

    }
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        //思路：1. 先判断根节点是否相同，相同的话看左树是否相同，右树是否相同；不同的话看A的左树中是否包含B或者右树是否包含
        //要再创建一个函数，实现验证二叉树是否相同的功能
        if(root1.val == root2.val) {
            if(judgeSubtree(root1.left,root2.left)) {
                if(judgeSubtree(root1.left,root2.left)) {
                    return true;
                }
            }else {
                return false;
            }
        }
        if(HasSubtree(root1.left,root2)) {
            return true;
        }else {
            if(HasSubtree(root1.right,root2)) {
                return true;
            }
        }
        return false;

    }
}
