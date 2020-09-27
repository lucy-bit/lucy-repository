/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -09 -27
 * Time: 16:26
 */
public class MyArrayList<T> {
    //写一个通用的顺序表
    public T[] elem;
    public int usedSize;
    public MyArrayList() {
        this.elem = (T[])new Object[10];
        this.usedSize = 0;
    }

    public void insert(T val) {
        this.elem[usedSize] = val;
        this.usedSize++;
    }

}
