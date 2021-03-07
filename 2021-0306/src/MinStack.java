import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -06
 * Time: 21:52
 */
public class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    private int usedSize;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if(minStack.empty()) {
            minStack.push(x);
        }else {
            if(minStack.peek() > x) {
                minStack.push(x);
            }
        }
    }

    public void pop() {
        if(stack.peek() == minStack.peek()) {
            minStack.pop();
        }
        stack.pop();
       // stack.top();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

