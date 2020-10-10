/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -10 -10
 * Time: 16:38
 */
public class MyStack2<T> {
    private T[] elem;
    private int usedSize;
    private byte x;
    public MyStack2() {
        this.elem = (T[])new Object[100];
        this.usedSize = 0;
    }
    public void push(T val) {
        if(isFull()) {
            return;
        }
        this.elem[this.usedSize] = val;
        this.usedSize++;
    }
    public boolean isFull() {
        if(this.usedSize == this.elem.length)
            return true;
        return false;
    }
    public T pop() {
        if(isEmpty()) {
            throw new RuntimeException("栈为空");
        }else {
            T ret = this.elem[this.usedSize-1];
            this.usedSize--;
            return ret;
        }
    }
    public boolean isEmpty() {
        if(this.usedSize == 0)
            return true;
        return false;
    }
    public T peek() {
        if(isEmpty()) {
            throw new RuntimeException("栈为空");
        }else {
            return this.elem[this.usedSize-1];
        }
    }
}
