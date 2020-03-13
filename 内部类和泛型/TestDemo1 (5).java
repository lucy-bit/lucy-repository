import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * 1、内部类
 *    实例内部类
 *    静态内部类
 *    匿名匿名内部类
 *    本地内部类（不是重点）定义在方法里面的内部类。
 * 2、泛型
 *
 * User: GAOBO
 * Date: 2020-02-18
 * Time: 8:39
 */
class OuterClass {
    public int data1 = 1;
    private int data2 = 2;
    int data3 = 3;
    public static int size = 10;

    public OuterClass() {
        System.out.println("OuterClass()");
    }

    /**
     * 实例内部类：
     * 1、如何获取实例内部类的对象呢？
     *     OuterClass.InnerClass innerClass = outerClass.new InnerClass();
     *     外部类类名.内部类类名  变量  =  外部类对象的引用.new 内部类()
     * 2、在实例内部类当中，不能定义static的属性或者方法。
     *      如果要定义，那么这个属性一定要是static final的--》
     *      实例内部类里面的数据成员，一定是在编译期间就能确定的。
     * 3、面试问题：
     *    实例内部类有没有额外的内存开销呢？有！！
     *    因为实例内部类，包含外部类的this引用
     *    实例内部类至少有两个this
     */
    class InnerClass {
            public int data4 = 4;
            //public static final int size = 10;
            public int data1 = 11;

            public InnerClass() {
                System.out.println("InnerClass()");
            }

        public void test() {
            System.out.println("data1:"+data1);
            System.out.println("data1:"+this.data1);
            System.out.println("out::data1:"+ OuterClass.this.data1);
            System.out.println("InnerClass::test()");
        }
    }
}

class OuterClass2 {
    public int data1 = 1;
    private int data2 = 2;
    int data3 = 3;
    public static int data5 = 10;

    public OuterClass2() {
        System.out.println("OuterClass2()");
    }

    /**
     * 静态内部类：
     *   1、如何拿到静态内部类的对象？
     *       OuterClass2.InnerClass2 innerClass2  = new OuterClass2.InnerClass2();
     *        = new 外部类名.内部类();
     *   2、静态内部类当中，不能够访问外部类的非静态数据成员。
     *      如果说，非要进行访问呢？ 传入外部类对象的引用。
     *      静态内部类，不拥有外部类的this.
     *
     */
    static class InnerClass2 {
        public int data1 = 4;
        public static  int data5 = 5;

        OuterClass2 outerClass;

        public InnerClass2() {
            System.out.println("static::InnerClass2()");
        }

        public InnerClass2(OuterClass2 o) {
            this.outerClass = o;
            System.out.println("static::InnerClass2(OuterClass o)");
        }

        public void test() {
            System.out.println("data1:" + this.outerClass.data1);
            System.out.println(data1);
            System.out.println("data5:"+data5);
            System.out.println("data5:" + OuterClass2.data5);
            System.out.println("InnerClass2::test()");
        }

    }

}

class OuterClass3 {
    public int data1 = 10;

    public void test() {
        System.out.println("OuterClass3::test()");
    }
}

/**
 * 匿名内部类：
 *     本质：其实就是一个子类。
 *     使用最多的地方，就是线程这一块。
 */
public class TestDemo1 {

    public static<T extends Comparable<T>> TestLink.Node<T>
                            mergeList(TestLink.Node<T> headA,TestLink.Node<T> headB) {

        /*实例内部类
        TestLink testLink = new TestLink();

        TestLink.Node newHead = testLink.new Node(-1);*/
        //静态内部类实现
        TestLink.Node<T> newHead = new TestLink.Node<>();

        TestLink.Node tmp = newHead;

        while (headA != null && headB != null) {
            if(headA.data.compareTo(headB.data) < 0) {
                tmp.next = headA;
                headA = headA.next;
                tmp = tmp.next;
            }else {
                tmp.next = headB;
                headB = headB.next;
                tmp = tmp.next;
            }
        }

        if (headA != null){
            tmp.next = headA;
        }

        if (headB != null){
            tmp.next = headB;
        }

        return newHead.next;
    }


    public static void main(String[] args) {
        TestLink<Integer> testLink = new TestLink<>();
        testLink.insertTail(1);
        testLink.insertTail(3);
        testLink.insertTail(5);
        testLink.insertTail(7);
        testLink.show();
        TestLink<Integer>  testLink2 = new TestLink<> ();
        testLink2.insertTail(2);
        testLink2.insertTail(4);
        testLink2.insertTail(6);
        testLink2.insertTail(8);
        testLink2.show();

        TestLink.Node<Integer> newHead = mergeList(testLink.head,testLink2.head);
        testLink.show2(newHead);
    }

    public static void main3(String[] args) {
        new OuterClass3(){
            public void test() {
                System.out.println("TestDemo1::test()");
            }
        }.test();
    }

    public static void main2(String[] args) {
        OuterClass2 outerClass = new OuterClass2();
        OuterClass2.InnerClass2 innerClass2  = new OuterClass2.InnerClass2(outerClass);
        innerClass2.test();

    }

    public static void main1(String[] args) {

       OuterClass outerClass = new OuterClass();

        /*System.out.println(outerClass.data1);*/
        //InnerClass innerClass = new InnerClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.test();
        //System.out.println(innerClass.data4);
    }
}
