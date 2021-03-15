import java.sql.Time;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -15
 * Time: 15:50
 */
public class 内存可见性 {
    private static boolean running = true;
    private static class 子线程 extends Thread {
        @Override
        public void run() {
            int n = 0;
            while(running)  {
                n++;
            }
            System.out.println(n);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new 子线程();
        t.start();
        System.out.println("随便输入什么，让子线程停止: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        running = false;
        while(true) {
            System.out.println(t.getState());
            TimeUnit.SECONDS.sleep(1);
        }

    }
}
