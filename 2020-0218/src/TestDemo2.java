import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -02 -18
 * Time: 18:15
 */
/*class MyStack<T> {
    public T[] elem;
    public int top;
    public MyStack() {
        this.elem = (T[])new Object[10];
        this.top = 0;
    }
    public void push(T data) {
        this.elem[top++] = data;
    }
    public T pop() {
        T oldTop = this.elem[top-1];
        top--;
        return oldTop;
    }
}*/
class MyStack<T> {
    public T[] elem;
    public int top;
    public MyStack() {
        this.elem = (T[])new Object[10];
        this.top = 0;
    }
    public void push(T data) {
        this.elem[top++] = data;
    }
    public T pop() {
        T topOld = this.elem[top-1];
        top--;
        return topOld;
    }
}

//静态泛型方法
class Algorithm {
    //通过实参的类型可以推导出形参的T是什么类型！
    public static<T extends Comparable<T>>T findMaxValue(T[] array) {
        T max = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }
}
//写一个泛型方法打印出数组中所有的元素
class Algorithm2 {
    public static<T> void printarray(ArrayList<T> array) {
        for (T obj : array) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
    public static void printarray2(ArrayList<?> array) {
        for (Object obj : array) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        //Integer[] array = {1,2,4,6,7};
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(12);
        arrayList.add(13);
        Algorithm2.printarray(arrayList);
        Algorithm2.printarray2(arrayList);

    }
    public static void main3(String[] args) {
        //Algorithm<Integer> algorithm = new Algorithm<>();
        //无需实例对象
        Integer[] array = {10,67,34,5,6,1};
        Integer a = Algorithm.findMaxValue(array);
        System.out.println(a);
        //Integer[] array ={10,67,1,2,3};

    }
    public static void main2(String[] args) {
        MyStack<String> myStack = new MyStack<>();
        myStack.push("wu");
        System.out.println(myStack.pop());
    }
    /*public static void main(String[] args) {
        MyStack<Integer> myStack= new MyStack<>();
        myStack.push(1);
        int a = myStack.pop();
        System.out.println(a);
    }*/

}
