/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2019-12-10
 * Time: 19:03
 */
public class MyStack<T> {

    public T[] elem;
    public int top;//下标

    public MyStack() {
        this.elem = (T[]) new Object[10];
        this.top = 0;
    }
    private boolean isFull() {
        return this.top == this.elem.length;
    }
    public void push(T val) {
        if(isFull()) {
            return;
        }
        this.elem[this.top] = val;
        this.top++;
    }
    private boolean isEmpty() {
        return this.top == 0;
    }
    //出栈
    public T pop() {
        if(isEmpty()) {
            return null;
        }
        T tmp = this.elem[top-1];//保存你出栈的数据
        this.top--;//真正的出栈
        return tmp;
    }
    //得到栈顶元素，但是不出栈    peek
    public T getTop() {
        if(isEmpty()) {
            return null;
        }
        return this.elem[top-1];
    }
}
