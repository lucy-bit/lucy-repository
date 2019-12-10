/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -12 -10
 * Time: 18:06
 */
class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class MyLinkedList {
    public ListNode head;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        this.head = null;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        ListNode cur = head;
        if(index < 0 || head == null) {
            return -1;
        }
        for(int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        ListNode node = new ListNode(val);
        if(head == null) {
            head = node;
        }else {
            node.next = head;
            head = node;
        }
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        ListNode node = new ListNode(val);
        ListNode cur = head;
        if(head == null) {
            head = node;
        }else {
            while(cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    private int getLength() {
        ListNode cur = head;
        int count = 0;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    public void addAtIndex(int index, int val) {
        ListNode node = new ListNode(val);
        ListNode cur = head;
        int length = getLength();
        if(index < 0) {
            addAtHead(val);
            return;
        }
        if(index == length) {
            addAtTail(val);
            return;
        }
        if(index > length) {
            return;
        }
        for(int i = 0; i < index - 1; i++) {
            cur = cur.next;
        }
        node.next = cur.next;
        cur.next = node;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        ListNode cur = head;
        int length = getLength();
        if (index < 0 || index > length) {
            return;
        }
        for (int i = 0; i < index - 1; i++) {
            cur = cur.next;
        }
        if (cur.next.next != null) {
            cur.next = cur.next.next;
        } else {
            cur.next = null;
        }
    }
        public void display() {
            if (head == null) {
                return;
            }
            ListNode cur = this.head;
            while (cur != null) {
                System.out.print(cur.val + " ");
                cur = cur.next;
            }
            System.out.println();
        }
    }
