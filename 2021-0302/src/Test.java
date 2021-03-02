/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -02
 * Time: 23:28
 */
public class Test {
    13

            import java.util.*;


    public class Solution {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         *
         * @param array int整型一维数组
         * @return int整型一维数组
         */
        public int[] reOrderArray (int[] array) {
            // write code here
            //第一种思路：用冒泡排序的思想，两个两个比较，直到奇数都在前面，偶数都在后面
       /* for(int i = 0; i < array.length-1; i++) {
            for(int j = 0; j < array.length-i-1; j++) {
                if(array[j]%2 == 0 && array[j+1]%2 != 0) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        */
            //冒泡的优化：假如某一趟遍历过后没有交换，那么数组已经有序，无需进行后续比较
            boolean flag = false;
            for(int i = 0; i < array.length-1; i++) {
                for(int j = 0; j < array.length-i-1; j++) {
                    flag = true;
                    if(array[j]%2 == 0 && array[j+1]%2 != 0) {
                        int tmp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = tmp;
                    }
                }
                if(!flag) {
                    break;
                }
            }
            //还可以继续优化，使用位运算
            boolean flag = false;
            for(int i = 0; i < array.length-1; i++) {
                for(int j = 0; j < array.length-i-1; j++) {
                    flag = true;
                    if((array[j]&1 == 0) && (array[j+1]&1 == 1)) {
                        int tmp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = tmp;
                    }
                }
                if(!flag) {
                    break;
                }
            }
            return array;
        }
    }



14

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

15


    public class Solution {
        public ListNode ReverseList(ListNode head) {
            ListNode cur = head;
            ListNode prev = null;
            while(cur != null) {
                ListNode curNext = cur.next;
                cur.next = prev;
                prev = cur;
                cur = curNext;
            }
            return prev;
        }
    }

16

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
    }

17
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
        public boolean judgeSubtree(TreeNode A,TreeNode B) {
            if((A == null && B != null) || (A != null && B == null)) {
                return false;
            }
            if(A == null && B == null) {
                return true;
            }
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
            if((root1 == null && root2 != null) || (root1 != null && root2 == null)) {
                return false;
            }
            if(root1 == null && root2 == null) {
                return true;
            }
            if(root1.val == root2.val) {
                if(judgeSubtree(root1.left,root2.left) || judgeSubtree(root1.left,root2.left)) {
                    return true;
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


}
