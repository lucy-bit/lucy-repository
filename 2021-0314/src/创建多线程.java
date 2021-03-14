/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -14
 * Time: 12:24
 */
public class 创建多线程 {
    static class MyThread extends Thread {
        @Override
        public void  run() {

        }
    }
    static class MyRunnable implements Runnable {
        @Override
        public void run() {

        }
    }

    public static void main(String[] args) {
        MyRunnable mr1 = new MyRunnable();
        MyRunnable mr2 = new MyRunnable();
        //mr1 和 mr2 引用指向各自的 任务对象

        Thread t1 = new Thread(mr1);//mr1 指向的任务作为 t1 线程的任务
        Thread t2 = new Thread(mr2);
    }
}
