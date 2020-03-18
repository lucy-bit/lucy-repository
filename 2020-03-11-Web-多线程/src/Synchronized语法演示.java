public class Synchronized语法演示 {
    synchronized void 普通方法() {
    }

    synchronized static void 静态方法() {
    }

    void 其他方法() {
        Object 一个引用 = new Object();
        synchronized (一个引用) {
        }
    }
}
