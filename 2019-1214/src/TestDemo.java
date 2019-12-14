import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2019-12-10
 * Time: 16:58
 */
public class TestDemo {

    public  static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{'|| ch == '[') {
                stack.push(ch);
            }else {
                if(stack.empty()) {
                    System.out.println("右括号多");
                    return false;
                }
                char top = stack.peek();
                if(top == '(' && ch == ')' ||
                        top == '{' && ch == '}'||
                        top == '[' && ch == ']' ){
                    stack.pop();
                }else {
                    System.out.println("右括号匹配错误！");
                    return false;
                }
            }
        }

        if(!stack.empty()) {
            System.out.println("左括号多！");
            return false;
        }
        return true;
    }



    public static void main2(String[] args) {
        MyListQueue myListQueue = new MyListQueue();
        myListQueue.offer(1);
        myListQueue.offer(2);
        myListQueue.offer(3);
        myListQueue.offer(4);

        System.out.println(myListQueue.poll());//1
        System.out.println(myListQueue.peek());//2

        Queue<String> queue1 = new LinkedList<>();
        queue1.offer("abc");
        Queue<Integer> queue2 = new LinkedList<>();
    }


    public static void main1(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        System.out.println(myStack.pop());//40
        System.out.println(myStack.getTop());//30

        MyStack<String> myStack2 = new MyStack<>();
        myStack2.push("Java");
        myStack2.push("20");
        myStack2.push("bit");
        myStack2.push("hhhh");
        System.out.println(myStack2.pop());//40
        System.out.println(myStack2.getTop());//30
    }
}
