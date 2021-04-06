import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -04 -06
 * Time: 22:05
 */
/*class Singleton {
    //饿汉模式
    private static Singleton instance = new Singleton();
    private Singleton() {

    }
    public static Singleton getInstance() {
        return instance;
    }
}*/

 class Singleton {
    //懒汉模式
    private static Singleton instance = null;
    private Singleton() {}
    //v1:单线程版本
    public static Singleton getInstance1() {
        if(instance == null) {
            return new Singleton();
        }
        return instance;
    }
    //v2：多线程版本（给整个方法加个大锁——线程安全,但是效率很低，因为假如整个方法调用100次，其实只需要对 insatnce 为空时加锁一次就行）
    public synchronized static Singleton getInstance2() {
        if(instance == null) {
            return new Singleton();
        }
        return instance;
    }
    //v3：多线程（线程安全，效率高）
    public  static Singleton getInstance3() {
        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    // 给 instance为空时加锁，并且进行二次判断，二次判断是因为可能一个线程在判断 instance为空后就被切走了，
                    // 然后另一个线程进行 加锁-new对象-释放锁 的操作，然后这个线程又被切换到cpu上，进行加锁，实例化的操作
                    new Singleton();
                }
            }
        }
        return instance;
    }
}
//import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(getCount(i));
    }
    public static int getCount(int i) {
        int count = 0;
        while((i/2) != 0) {
            if((i%2) == 1) {
                count++;
            }
            i /= 2;
        }
        if(i%2 == 1) {
            count++;
        }
        return count;
    }

}