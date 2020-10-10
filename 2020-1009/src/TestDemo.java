import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -10 -09
 * Time: 19:25
 */
public class TestDemo {
    public static boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == '(' || arr[i] == '{' || arr[i] == '[') {
                stack.push(arr[i]);
            }else {
                char ch = stack.peek();
                if(!((ch == '(' && arr[i] == ')') ||
                        (ch == '{' && arr[i] == '}') ||
                        (ch == '[' && arr[i] == ']'))) {
                    return false;
                }
                stack.pop();
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            System.out.println(isValid(str));
        }

    }
    public static void main4(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(12);
        queue.offer(13);
        queue.offer(14);
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        queue.add(2);
        System.out.println(queue);
    }
    public static void main3(String[] args) {
        MyStack2 myStack = new MyStack2();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        System.out.println(myStack.pop());//4
        System.out.println(myStack.peek());//3
        System.out.println(myStack.pop());//3
        System.out.println(myStack.pop());//2
        System.out.println(myStack.pop());//1
        //System.out.println(myStack.pop());//
    }
    public static void main2(String[] args) throws Exception {
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
