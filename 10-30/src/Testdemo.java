/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -10 -30
 * Time: 18:55
 */
class Person {
    private int count;
    static {
        System.out.println("静态代码块");
    }
    {
        System.out.println("实例代码块");
    }


    //Alt + insert
    @Override
    public String toString() {
        return "Person{" +
                "count=" + count +
                '}';
    }
}
public class Testdemo {
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1);

        System.out.println();
    }
}
