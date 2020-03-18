public class 不同类型的引用 {
    class 类 {}

    class 类的子类 extends 类 {}

    interface 接口 {}

    class 实现了接口的类 implements 接口 {}

    static 类 类类型的引用;
    static 接口 接口类型的引用;
    static int[] 数组类型的引用;

    public void main(String[] args) {
        类类型的引用 = null;
        类类型的引用 = new 类();
        类类型的引用 = new 类的子类();

        接口类型的引用 = null;
        接口类型的引用 = new 实现了接口的类();
    }
}
