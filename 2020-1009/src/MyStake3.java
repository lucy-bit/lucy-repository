import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -10 -10
 * Time: 20:00
 */
public class MyStake3 {
    private Queue<Integer> que1;
    private Queue<Integer> que2;
    private int usedSize;

    public MyStake3() {
        this.que1 = new LinkedList<>();
        this.que2 = new LinkedList<>();
    }
    public void push(int x) {
        //两个队列，入栈的时候将元素放在不为空的队列上
        if(!que1.isEmpty()) {
            que1.offer(x);
        }else if(!que2.isEmpty()) {
            que2.offer(x);
        }else {
            que1.offer(x);
        }
        this.usedSize++;
    }
    public int pop() {
        //栈为空
        if(empty()) {
            return -1;
        }
        int ret = 0;
        //将不为空的队列上的n-1个元素出到另一个队列上，出最后那个元素
        if(!que1.isEmpty()) {
            for(int i = 0; i < usedSize-1; i++) {
                que2.offer(que1.poll());
            }
            ret = que1.poll();
        }else if(!que2.isEmpty()) {
            for(int i = 0; i < usedSize-1; i++) {
                que1.offer(que2.poll());
            }
            ret = que2.poll();
        }
        return ret;

    }
    public boolean empty() {
        if(this.usedSize == 0) {
            return true;
        }
        return false;
    }
}
