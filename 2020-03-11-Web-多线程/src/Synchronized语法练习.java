public class Synchronized语法练习 {
    /*
    static Object o1 = new Object();
    static void 方法1() {
        Object o2 = o1;

        //synchronized (o2) {
            // 随便什么
        //}
    }
    static void 方法2() {
        Object o3 = o1;

        synchronized (o3) {
            // 随便什么
        }
    }
    */

    //A
    synchronized static void 方法1() {
    }


    //A\B
    void 方法2() {
        synchronized (this) {
        }
    }
}
