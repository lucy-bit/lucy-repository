public class 演示线程状态的变化 {
    static class MyThread1 extends Thread {
        @Override
        public void run() {
            for (long i = 0; i < 100_0000_0000L; i++) {
            }
        }
    }

    public static void main1(String[] args) {
        MyThread1 t = new MyThread1();
        System.out.println(t.getState());   // NEW
        t.start();
        System.out.println(t.getState());   // RUNNABLE

        while (t.isAlive());    // 只要线程或者，一直循环

        System.out.println(t.getState());   // TERMINATED
    }

    static class MyThread2 extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(100 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main2(String[] args) throws InterruptedException {
        MyThread2 t = new MyThread2();
        t.start();

        // 还是 Runnable，为啥没变呢？因为大概率的情况下，t 还没抢到 CPU
        System.out.println(t.getState());
        Thread.sleep(1000); // 主线放弃 CPU，使得 t 大概率能抢到 CPU
        System.out.println(t.getState());
    }

    static class 张三 extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("张三在唱歌");
                Thread.yield();
            }
        }
    }

    static class 李四 extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("李四在唱歌");
            }
        }
    }

    // 不加 yield 的时候，两个人基本上一样多
    // 张三加了 yield，李四会非常多
    public static void main(String[] args) {
        Thread zs = new 张三();
        Thread ls = new 李四();
        zs.start();
        ls.start();
    }
}









