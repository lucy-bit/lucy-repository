public class 演示属性 {
    private static void printFields() {
        Thread t = Thread.currentThread();
        System.out.println(t.getId());
        System.out.println(t.getName());
        System.out.println(t.getState());
        System.out.println(t.getPriority());
        System.out.println(t.isDaemon());
        System.out.println(t.isAlive());
        System.out.println(t.isInterrupted());
    }

    public static void main(String[] args) {
        Thread.currentThread().setName("虽然我是主线程，但我想换个名字");

        Thread t = new Thread(() -> {
            printFields();

            try {
                // 主动放弃 CPU,10000000 毫秒之后，重新回到抢夺 CPU 的行列
                Thread.sleep(10000000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "我的名字是小陈");
        t.start();

        printFields();
        System.out.println("=======================");
        try {
            // 主动放弃 CPU,10000000 毫秒之后，重新回到抢夺 CPU 的行列
            Thread.sleep(10000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
