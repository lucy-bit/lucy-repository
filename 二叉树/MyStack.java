import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:两个队列实现栈
 * User: GAOBO
 * Date: 2019-12-15
 * Time: 13:15
 */
public class MyStack {

    public Queue<Integer> queue1 = new LinkedList<>();
    public Queue<Integer> queue2 = new LinkedList<>();


    /** Initialize your data structure here. */
    public MyStack() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        if(!queue1.isEmpty()) {
            queue1.offer(x);
        }else if(!queue2.isEmpty()){
            queue2.offer(x);
        }else {
            queue1.offer(x);
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(!queue1.isEmpty()) {
            int size1 = queue1.size()-1;
            //因为：queue1.poll()--》queue1.size()发生改变
            for (int i = 0; i < size1; i++) {
                queue2.offer(queue1.poll());
            }
            return queue1.poll();
        }
        if(!queue2.isEmpty()){
            int size2 = queue2.size()-1;
            for (int i = 0; i < size2; i++) {
                queue1.offer(queue2.poll());
            }
            return queue2.poll();
        }
        return -1;
    }

    /** Get the top element. */
    public int top() {
        if(!queue1.isEmpty()) {
            int tmp = 0;
            int size1 = queue1.size();
            for (int i = 0; i < size1; i++) {
                tmp = queue1.poll();
                queue2.offer(tmp);
            }
            return tmp;
        }
        if(!queue2.isEmpty()){
            int tmp2 = 0;
            int size2 = queue2.size();
            for (int i = 0; i < size2; i++) {
                tmp2 = queue2.poll();
                queue1.offer(tmp2);
            }
            return tmp2;
        }
        return -1;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(queue1.isEmpty() && queue2.isEmpty()){
            return true;
        }
        return false;
    }
}
