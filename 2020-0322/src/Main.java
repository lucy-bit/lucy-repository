/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -03 -22
 * Time: 14:34
 */
import java.util.*;

/*public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Plus {
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        ListNode ret = null;
        while(a != null) {
            int val = a.val+b.val;
            if(val>9) {
                val = val-10;
                ret.next.val = 1;
            }
            ret.val += val;
            a = a.next;
            b = b.next;
            ret = ret.next;
        }
        return ret;
    }
}*/
public class Main {

        public static void main(String[] args) {
            long t = System.currentTimeMillis();
            Random r = new Random(t);
            for(int i = 0; i < 5; i++) {
                int ran1 = r.nextInt(100);
                System.out.println(ran1);
            }
        }
    /*public static void main2(String[] args) {
        String s = "hello world\r\n";
        byte[] bytes = s.getBytes();
        os.write(bytes);
    }*/
}
