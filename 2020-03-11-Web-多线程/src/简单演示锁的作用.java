public class 简单演示锁的作用 {
    static long n = 0;
    static long COUNT = 1000_0000;
    static Object 利用这个引用指向的对象作为锁 = new Object();

    static class Adder extends Thread {
        @Override
        public void run() {
            for (long i = 0; i < COUNT; i++) {
                synchronized (利用这个引用指向的对象作为锁) {
                    n++;
                }
            }
        }
    }

    static class Subber extends Thread {
        @Override
        public void run() {
            for (long i = 0; i < COUNT; i++) {
                synchronized (利用这个引用指向的对象作为锁) {
                    n--;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Adder adder = new Adder();
        Subber subber = new Subber();
        adder.start();
        subber.start();

        adder.join();
        subber.join();

        System.out.println(n);
    }
}
