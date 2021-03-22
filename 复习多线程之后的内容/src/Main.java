import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -22
 * Time: 17:23
 */
class B extends Thread {
    @Override
    public void run() {
        //b睡着了

        while(Thread.interrupted() == false) {
            try{
                System.out.println("b正在运行");
                TimeUnit.SECONDS.sleep(3000);
            }catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.start();

        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine());

        b.interrupt();
        System.out.println("b停止");
    }
}
