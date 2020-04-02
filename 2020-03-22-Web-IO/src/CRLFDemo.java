import java.util.concurrent.TimeUnit;

public class CRLFDemo {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            System.out.printf("当前进度: %d ", i);
            for (int j = 0; j < i; j++) {
                System.out.printf("♠");
            }
            System.out.flush();
            TimeUnit.SECONDS.sleep(1);
            System.out.printf("\r");
        }
    }
}
