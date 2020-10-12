import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -10 -12
 * Time: 20:19
 */
 class ListNode {
        int val;
        ListNode next = null;

          ListNode(int val) {
           this.val = val;
       }
    }
public class TestDemo {
    private static int getSize(ListNode listNode) {
        int size = 0;
        ListNode cur = listNode;
        while(cur.next != null) {
            cur = cur.next;
            size++;
        }
        return size;
    }
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        //思路：先求出链表的长度，然后从前往后遍历数组，将对应元素从后往前放入到ArrayList中
        int size = getSize(listNode);
        if(listNode == null)
            return null;
        ArrayList<Integer> arraylist = new ArrayList<>();
        while(listNode != null) {
            arraylist.add(size-1,listNode.val);
            size--;
            listNode = listNode.next;
        }
        return arraylist;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(12);
        ListNode node3 = new ListNode(13);
        ListNode node4 = new ListNode(14);
        ListNode node5 = new ListNode(15);
        node.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ArrayList<Integer> arrayList = printListFromTailToHead(node);
        System.out.println(arrayList);
    }
    public static void main2(String[] args) {
        String str = "We are child";

        System.out.println(str.replaceAll(" ","%20"));
    }
    public static void main1(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(12);
        minStack.push(13);
        minStack.push(14);
        minStack.push(4);
        minStack.push(6);
        minStack.push(2);
        System.out.println(minStack.top());
        minStack.pop();
        System.out.println(minStack.getMin());
    }

}
