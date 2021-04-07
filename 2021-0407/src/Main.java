/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -04 -07
 * Time: 17:11
 */
public class Main {
    class myThread1 extends Thread {
        @Override
        public void run() {

        }
    }
    class myThread2 implements Runnable {
        @Override
        public void run() {

        }
    }
    public  void main(String[] args) {
        //char[] ch = new char[2];
        Thread t1 = new myThread1();
        Thread t2 = new Thread(new myThread2());

    }
}

 class ThreadDemo {
    private static class MyRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.interrupted());
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MyRunnable target = new MyRunnable();
        Thread thread = new Thread(target, "李四");
        thread.start();
        thread.interrupt();
    }
}


/*
public class ThreadDemo {
    private static class MyRunnable implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("通过异常收到了中断情况");
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().isInterrupted());
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MyRunnable target = new MyRunnable();
        Thread thread = n
    }
*/
/*
 class ThreadDemo {
    private static class MyRunnable implements Runnable {
        public volatile boolean isQuit = false;
        @Override
        public void run() {
            while (!isQuit) {
                System.out.println(Thread.currentThread().getName()
                        + ": 别管我，我忙着转账呢!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()
                    + ": 啊！险些误了大事");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MyRunnable target = new MyRunnable();
        Thread thread = new Thread(target, "李四");
        System.out.println(Thread.currentThread().getName()
                + ": 让李四开始转账。");
        thread.start();
        Thread.sleep(10 * 1000);
        System.out.println(Thread.currentThread().getName()
                + ": 老板来电话了，得赶紧通知李四对方是个骗子！");
        target.isQuit = true;
    }
}
*/
