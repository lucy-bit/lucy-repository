import java.util.Stack;

class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    /** initialize your data structure here. */
    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int x) {
        //如果是第一个元素，两个栈都要放
        //如果入的元素比minStack的栈顶元素小，minStack也入栈
        if(stack.empty()) {
            stack.push(x);
            minStack.push(x);
        }else {
            if(x < minStack.peek()) {
                minStack.push(x);
            }
            stack.push(x);
        }
    }

    public void pop() {
        //出栈的时候，如果出栈元素和minStack的栈顶元素相等，一起出

        int ret = stack.pop();
        if(ret == minStack.peek()) {
            minStack.pop();
        }


    }

    public int top() {

        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */