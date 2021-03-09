/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -09
 * Time: 19:01
 */

import java.util.*;



class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
/*

public class Solution {
    public static int prevIndex;
    public static int findInorder(int[] inorder,int index,int begin,int end) {
        //作用：找到index在inorder截取部分中的位置
        for(int i = begin; i <= end; i++) {
            if(inorder[i] == index) {
                return i;
            }
        }
        return -1;
    }
    //根据前序和截取出来的中序数组构建子树
    public static TreeNode buildSubTree(int[] preorder,int[] inorder,int inbegin,int inend) {
        if(inbegin > inend) {
            return null;
        }
        if(prevIndex > preorder.length-1) {
            return null;
        }
        int index = preorder[prevIndex];
        prevIndex++;
        TreeNode root = new TreeNode(index);
        int findIndex = findInorder(inorder,index,inbegin,inend);
        if(findIndex == -1) {
            return null;
        }
        root.left = buildSubTree(preorder,inorder,inbegin,findIndex-1);
        root.right = buildSubTree(preorder,inorder,findIndex+1,inend);
        return root;

    }
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        TreeNode root = buildSubTree(preorder,inorder,0,inorder.length-1);
        return root;
    }

    public  static void main(String[] args) {
        int[] preorder = {-1};
        int[] inorder = {-1};
        TreeNode root = buildTree(preorder,inorder);
        System.out.println(root);
    }
}*/


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int prevIndex;
    public int findInorder(int[] inorder,int index,int begin,int end) {
        for(int i = begin; i <= end; i++) {
            if(inorder[i] == index) {
                return i;
            }
        }
        return -1;
    }
    public TreeNode buildSubTree(int[] inorder,int[] postorder,int inbegin,int inend) {
        if(inbegin > inend) {
            return null;
        }
        int index = postorder[prevIndex];
        TreeNode root = new TreeNode(index);
        prevIndex--;
        int findIndex = findInorder(inorder,index,inbegin,inend);
        if(findIndex == -1) {
            return null;
        }
        root.left = buildSubTree(inorder,postorder,inbegin,findIndex-1);
        root.right = buildSubTree(inorder,postorder,findIndex+1,inend);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null || postorder == null) {
            return null;
        }
        prevIndex = postorder.length-1;
        TreeNode node = buildSubTree(inorder,postorder,0,inorder.length-1);
        return node;

    }
}
