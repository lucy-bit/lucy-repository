/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -14
 * Time: 10:24
 */
public class 多线程的优势 {
    private static final long COUNT = 10_0000_0000;
    private static final int N = 10;
    private static void calc() {
        long r = 0;
        for(long i = 0; i < COUNT; i++) {
            r += i;
        }
        System.out.println(r);
    }
    private static class CalcThread extends Thread {
        public void run() {
            calc();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        long start = System.nanoTime();
        CalcThread[] ch = new CalcThread[N-1];
        for(int i = 0; i < N-1; i++) {
            CalcThread thread = new CalcThread();
            thread.run();
            ch[i] = thread;
        }
        calc();
        for(int i = 0; i < N-1; i++) {
            ch[i].join();
        }
        long end = System.nanoTime();
        double time = (end-start)*1.0/1000/1000;
        System.out.println("耗时： " + time);
    }
}
