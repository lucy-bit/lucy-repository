public class 创建线程对象示例 {
    // 定义一个 线程 或者 目标 类
    private static class MyThread extends Thread {
        @Override
        public void run() {
            // 让线程去执行的任务：指令
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        }
    }

    // 创建一个 目标 类
    private static class MyRunnable implements Runnable {
        @Override
        public void run() {
            // 让线程去执行的任务：指令
            for (int i = 100; i < 110; i++) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread a = new MyThread();  // 创建一个线程对象，该线程要干的工作，就在该线程类中，已被覆写
        a.start();                  // 把 a 线程放入就绪队列
        a.join();   // 1. 主线程放弃 CPU，2. 直到 a 结束之前，承诺再也不抢 CPU
                    // 主线程会阻塞在这里，直到 a 线程执行结束，才接着往下执行
        System.out.println("a 一定结束了");

        Runnable target = new MyRunnable(); // 创建一个目标对象,具体要做的实现，见 run 方法
        Thread b = new Thread(target);      // 拿着目标对象，去创建线程对象，这个线程要干的活，就是目标对象中指定的
        b.start();
        b.join();
        System.out.println("b 一定结束了");

        Thread target2 = new MyThread();  // 创建一个 Thread 对象，因为 Thread 实现了 Runnable，所以 可以看作创建了目标对象
        Thread c = new Thread(target2);
        c.start();
        c.join();
        System.out.println("c 一定结束了");
    }

    private static void 了解即可_使用匿名类创建线程对象() {
        // 等同于直接创建线程对象
        Thread a = new Thread() {
            @Override
            public void run() {
                // 这里指定线程要干的活儿
            }
        };

        // 等同于先创建目标对象，再创建线程对象
        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                // 这里指定线程要干的活儿
            }
        });

        // b 的变形，使用 lambda 表达式
        // 完全等于 b 的写法
        Thread c = new Thread(() -> {
            // 这里指定线程要干的活儿
        });
    }
}
