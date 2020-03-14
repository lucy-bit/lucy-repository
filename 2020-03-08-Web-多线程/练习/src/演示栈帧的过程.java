public class 演示栈帧的过程 {
    public static void main(String[] args) {
        f1();
        f2();
        f3();
    }

    private static void f3() {
        a();
    }

    private static void a() {
    }

    private static void f2() {
    }

    private static void f1() {
        a();
        b();
    }

    private static void b() {
        throw new RuntimeException("我一心求死");
    }
}
