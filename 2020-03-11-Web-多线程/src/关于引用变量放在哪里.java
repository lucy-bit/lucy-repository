public class 关于引用变量放在哪里 {
    static String 静态属性随着类放在方法区;

    String 属性随着对象放在堆中;

    public static void main(String[] args) {
        String 局部变量天生在栈帧里在栈上;
    }
}
