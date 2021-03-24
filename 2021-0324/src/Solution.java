/*
import javax.swing.tree.TreeNode;


  class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

 public TreeNode(int val) {
 this.val = val;

 }

 }

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
/*
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        //建立一个新的链表，然后分别遍历两个链表，将较小的存入到新的链表中，依此向后比较
        ListNode list = new ListNode(-1);
        ListNode newHead = list;
        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                list.next = list1;
                list1 = list1.next;
            }else {
                list.next = list2;
                list2 = list2.next;
            }
            list = list.next;
        }
        if(list1 == null) {
            list.next = list2;
        }
        if(list2 == null) {
            list.next = list1;
        }
        return newHead.next;

    }
}*/
import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 *   public ListNode(int val) {
 *     this.val = val;
 *   }
 * }
 */

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param pHead ListNode类
     * @param k int整型
     * @return ListNode类
     */
    public ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
        //定义两个结点，快结点先走k步，然后两结点同时向后走，直到快结点为null
        if(pHead == null) {
            return pHead;
        }
        ListNode fast = pHead;
        ListNode slow = pHead;
        for(int i = 0; i < k; i++) {
            if(fast == null) {
                return null;
            }else {
                fast = fast.next;
            }

        }
        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}