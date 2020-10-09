/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -10 -09
 * Time: 19:33
 */
public class MyStack<T> {
    //动态数组
    private T[] elem;
    private int usedSize;//有效数据个数,代表当前可以存放数据的下标

    public MyStack() {
        this.elem = (T[])new Object[10];
    }
    public void push(T val) {

        if(isFull())
            return;
        this.elem[this.usedSize] = val;
        this.usedSize++;
    }

    public boolean isFull() {
        if(this.usedSize == this.elem.length)
            return true;
        return false;
    }
    public boolean isEmpty() {
        if(this.usedSize == 0)
            return true;
        return false;
    }
    public T pop() throws Exception{
        //返回值是出栈的元素
        if(isEmpty()) {
            throw new RuntimeException("栈为空");
        }
        T data = this.elem[this.usedSize-1];
        this.usedSize--;
        return data;
    }
    public T peek() {
        //得到栈顶元素但是不出栈
        if(isEmpty()) {
            throw new RuntimeException("栈为空");
        }
        return this.elem[this.usedSize-1];
    }
}
