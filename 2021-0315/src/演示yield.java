/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -15
 * Time: 0:17
 */
public class 演示yield {
    private static class Other extends Thread {
        @Override
        public void run() {
            while(true) {
                System.out.println("其他");

            }
        }
    }
    public static void main(String[] args) {
        Thread t = new Other();
        t.start();
       // Thread th = new Thread();
        while(true) {
            System.out.println("你好");
            Thread.yield();
        }
    }
}
