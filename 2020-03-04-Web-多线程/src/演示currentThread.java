public class 演示currentThread {
    private static void printCurrentThread() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
    }

    public static void main(String[] args) {
        // printCurrentThread(); // 打印 main

        // 会打印 Thread-0
        Thread t = new Thread(() -> {
            printCurrentThread();
        });
        t.start();
    }
}
