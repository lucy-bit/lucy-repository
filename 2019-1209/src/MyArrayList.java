/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -12 -09
 * Time: 13:01
 */
public class MyArrayList<T> {
    //<T> T是一个占位符，标识当前类为泛型类,MyArrayList将来可以存放T类型的数据
    public T[] elem;
    public int usedSize;
    public MyArrayList() {
        //不能这样写,擦除不等同于替换
        //this.elem = new T[10];
        this.elem = (T[])new Object[10];
        this.usedSize = 0;
    }
    public void add(T data) {
        this.elem[this.usedSize] = data;
        this.usedSize++;
    }
    public T get() {
        T tmp = this.elem[this.usedSize-1];
        return tmp;
    }
}
