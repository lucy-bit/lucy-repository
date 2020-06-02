import java.util.concurrent.*;

public class CallableDemo {
    static class Add implements Callable<Integer> {
        int a;
        int b;

        Add(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public Integer call() throws Exception {
            System.out.println("开始计算");
            Thread.sleep(5000);
            System.out.println("计算结束");
            return a + b;
        }
    }

    public static void main(String[] args) throws Exception {
        //FutureTask<Integer> t = new FutureTask<>(new Add(1, 3));
        //new Thread(t).start();
        //System.out.println(t.get());

        ExecutorService pool = Executors.newFixedThreadPool(1);
        Future<Integer> future = pool.submit(new Add(1, 3));
        System.out.println(future.get());

        pool.shutdown();
    }
}