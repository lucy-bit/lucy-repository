import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2019-12-15
 * Time: 13:44
 */
public class MyQueue {

    private Stack<Integer> stack1;

    private Stack<Integer> stack2;

    /** Initialize your data structure here. */
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        if(!stack2.empty()) {
            return stack2.pop();
        }
        return -1;
    }

    /** Get the front element. */
    public int peek() {
        if(stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        if(!stack2.empty()) {
            return stack2.peek();
        }
        return -1;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack2.empty() && stack1.empty();
    }
}
