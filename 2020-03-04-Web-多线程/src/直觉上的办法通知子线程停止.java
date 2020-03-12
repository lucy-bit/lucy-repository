import java.util.Scanner;

public class 直觉上的办法通知子线程停止 {
    // 因为 这个 condition 子线程需要能看到，主线程需要能修改
    // 所以不能用局部变量，改成静态属性
    private static boolean condition;

    // 所以，即便通知停止，我也会把这一遍作业写完
    private static class FeelessWriter implements Runnable {
        @Override
        public void run() {
            try {
                while (condition) { // 只有执行这里，才有可能从循环退出
                    System.out.println("写作业1");
                    Thread.sleep(5000);
                    System.out.println("写作业2");
                    Thread.sleep(5000);
                    System.out.println("写作业3");
                    Thread.sleep(5000);
                    System.out.println("写作业4");
                    Thread.sleep(5000);
                    System.out.println("写作业5");
                    Thread.sleep(5000);
                    System.out.println("写作业6");
                    Thread.sleep(5000);
                    System.out.println("写作业7");
                    Thread.sleep(5000);
                }
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        // true 表示子线程可以一直工作
        condition = true;
        Thread t = new Thread(new FeelessWriter());
        t.start();

        // 等待用户输入，没输入之前，子线程一直在工作
        scanner.nextLine();
        // 修改 condition，进而影响子线程的行为
        condition = false;
        System.out.println("通知子线程停止");
        t.join();
        System.out.println("子线程已经停止");
    }
}
