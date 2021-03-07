import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -06
 * Time: 18:21
 */
public class MyStack {
   /* //自己实现栈
    private int[] array = new int[100];
    private int size = 0;
    public void push(int val) {
        array[size++] = val;
    }
    public int pop() {
        return array[--size];
    }
    public int peek() {
        return array[size-1];
    }
    public boolean empty() {
        return size == 0;
    }
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(12);
        myStack.push(13);
        myStack.push(14);
        myStack.push(15);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.size());
        System.out.println(myStack.empty());
    }*/



    //用队列来实现栈
    //定义两个队列，入栈的时候入不为空的栈，出栈时将不为空的栈上的元素除队尾元素外都移到另一个栈上，然后出栈
    private Queue<Integer> qu1;
    private Queue<Integer> qu2;
    private int usedSize;

    public MyStack() {
        this.qu1 = new LinkedList<>();
        this.qu2 = new LinkedList<>();

    }
    public void push(int val) {
        if(!qu1.isEmpty()) {
            qu1.offer(val);
        }else if(!qu2.isEmpty()) {
            qu2.offer(val);
        }else {
            qu1.offer(val);
        }
        this.usedSize++;
    }

    public boolean empty() {
        if(qu1.isEmpty() && qu2.isEmpty()) {
            return true;
        }
        return false;
    }
    public int pop() {
        if(empty()) {
            return -1;
        }
        if(!qu1.isEmpty()) {
            for(int i = 0; i < qu1.size()-1; i++) {
                qu2.offer(qu1.poll());
            }
            this.usedSize--;
            return qu1.poll();
        }else {
            for(int i = 0; i < qu2.size()-1; i++) {
                qu1.offer(qu1.poll());
            }
            this.usedSize--;
            return qu2.poll();
        }

    }
    public int size() {
        return this.usedSize;
    }

}
