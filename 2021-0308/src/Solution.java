/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -08
 * Time: 21:12
 */

import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/*
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        //每一层存到队列里，遍历完一层将队列放入list内
        //最终所有list都存到ret当中
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ret = new ArrayList<>();
        if(root == null) {
            return ret;
        }
        queue.offer(root);
        while(!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            //遍历每一层
            while(size > 0) {
                TreeNode cur = queue.poll();
                list.add(cur.val);
                size--;
                if(cur.left != null) {
                    queue.offer(cur.left);
                }
                if(cur.right != null) {
                    queue.offer(cur.right);
                }
            }
            ret.add(list);
        }
        return ret;
    }
}*/
/*class Solution {
    private boolean isSametree(TreeNode p,TreeNode q ) {
        if(p==null && q!=null || p!=null && q==null)
            return false;
        if(p==null && q==null)
            return true;
        if(p.val !=  q.val)
            return false;
        return isSametree(p.left,q.left) && isSametree(p.right,q.right);
    }
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null || t == null)
            return false;
        if(isSametree(s,t)) {
            return true;
        }
        if(isSubtree(s.left,t)) {
            return true;
        }
        if(isSubtree(s.right,t)) {
            return true;
        }
        return false;
    }
}*/
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        //非递归方式
        //定义两个栈s1,s2，将root压入s1
        //从s1出栈，并将该节点压入s2，接着将节点的左右节点压入s1
        //重复上一步操作，直到s1为空，依此从s2中出栈即可
        //因为入s1的时候是按照“根——左右”的顺序，
        //所以s2入的时候按照“根——右——左”的顺序
        List<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(root);
        TreeNode cur = root;
        while(!s1.empty()) {
            TreeNode node = s1.pop();
            if(node.left != null) {
                s1.push(node.left);
            }
            if(node.right != null) {
                s1.push(node.right);
            }
            s2.push(node);
        }
        while(!s2.empty()) {
            TreeNode tmp = s2.pop();
            list.add(tmp.val);
        }
        return list;
    }
}
    //方法二
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null) {
            return list;
        }
        TreeNode cur = root;
        TreeNode prev = null;
        while(cur != null || !stack.empty()) {
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.peek();
            if(cur.right == null || cur.right == prev) {
                list.add(cur.val);

                stack.pop();
                prev = cur;
                cur = null;
            }else {

                cur = cur.right;

            }
        }
        return list;
    }
