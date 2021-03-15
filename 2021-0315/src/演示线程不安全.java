/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -15
 * Time: 0:42
 */
public class 演示线程不安全 {
    private static long n = 0;
    private static class Add extends Thread{
        @Override
        public void run() {
            for(int i = 0; i < 10; i++) {
                n++;
            }
        }
    }
    private static class Sub extends Thread {
        @Override
        public void run() {
            for(int i = 0; i < 10; i++) {
                n--;
            }
        }
    }

    public static void main(String[] args) {
        Add a = new Add();
        a.start();
        Sub s = new Sub();
        s.start();
        System.out.println(n);
    }
}
