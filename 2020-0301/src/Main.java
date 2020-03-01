import com.sun.deploy.util.SyncAccess;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -03 -01
 * Time: 10:50
 */
public class Main {
    static final int COUNT = 10;
    static final long NUMBER = 10_0000_0000;

    static long sum() {
        long r = 0;
        for(long i = 0; i < NUMBER; i++) {
            r += i;
        }
        return r;
    }

    static void singleThread() {
        long b = System.nanoTime();
        for(int i = 0; i < COUNT; i++) {
            System.out.println(sum());
        }
        long e = System.nanoTime();

        double s = (e-b) / 1000_000_000.0;
        System.out.printf("单线程，运行时间：%f%n",s);
    }

    static class SumThread extends Thread {
        public void run() {
            System.out.println(sum());
        }
    }

    static void 多线程()
}
