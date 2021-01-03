/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -01 -03
 * Time: 20:51
 */
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
/*
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode list = new ListNode(-1);
        ListNode head = list;
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
        return head.next;
    }
}*/

/*
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode h = new ListNode(-1);
        ListNode cur = h;
        while(list1 != null && list2 !=null){
            if(list1.val<=list2.val){
                cur.next = list1;
                list1 = list1.next;
            }else{
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if(list1!=null) cur.next = list1;
        if(list2!=null) cur.next = list2;
        return h.next;
    }
}
*/

public class Solution {
    public double Power(double base, int exponent) {
        //若底数为0
        if(base == 0) {
            return 0;
        }
        double result = base;
        //指数分大于0、小于0、等于0三种情况
        if(exponent > 0) {
            for(int i = 1; i < exponent; i++) {
                result *= base;
            }
        }else if(exponent < 0) {
            for(int i = -1; i > exponent; i--) {
                result *= base;
            }
            result = 1/result;
        }else {
            result = 1;
        }
        return result;
    }
}