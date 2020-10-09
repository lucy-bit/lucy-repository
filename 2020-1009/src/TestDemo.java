import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -10 -09
 * Time: 19:25
 */
public class TestDemo {
    public static void main(String[] args) throws Exception {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        System.out.println(myStack.pop());//4
        System.out.println(myStack.peek());//3
        System.out.println(myStack.pop());//3
        System.out.println(myStack.pop());//2
        System.out.println(myStack.pop());//1
        System.out.println(myStack.pop());//


    }
    public static void main1(String[] args) {
        //练习栈
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.search(13));
    }
}
