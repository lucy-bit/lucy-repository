/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -15
 * Time: 16:38
 */
public class synchronized语法演示 {
    //修饰静态方法
    public synchronized static void staticMethod() {
        
    }
    //修饰普通方法
    public synchronized void method() {

    }
    //代码块，同步代码块
    public static void main(String[] args) {
        Object o = new Object();
        synchronized (o) {

        }
    }
}
