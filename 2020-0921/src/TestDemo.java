import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -09 -21
 * Time: 15:38
 */
class Money implements Cloneable{
    double money = 12.5;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person implements Cloneable{
    public int age;

    public Person(int age) {
        this.age = age;
    }
    Money m = new Money();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //1、先克隆Person
        Person p = (Person)super.clone();
        //2、再克隆当前的Money对象
        p.m = (Money)this.m.clone();
        return p;
    }
}
public class TestDemo {
    public static void main(String[] args) {
        //实现多次分割
        String str = "123=adf=333&sdcv&swc";
        String[] arr1 = str.split("=");
        for (String ret:arr1
             ) {
            String[] arr2 = ret.split("&");
            for (String ret2:arr2
                 ) {
                System.out.println(ret2);
            }
        }
    }
    public static void main5(String[] args) {
        String str = "192.16.1.3";
        String[] arr = str.split("\\.");
        for (String ret:
             arr) {
            System.out.print(ret += " ");
        }
        System.out.println();
    }
    public static void main4(String[] args) {
        String str1 = "abcDEF";
        String str2 = "abcdef";
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
    }

    public static boolean func(String str) {
        char[] arr = str.toCharArray();
        for (char ch:arr
             ) {
            if(ch > '9' || ch < '0')
            return false;
        }
        return true;
    }
    public static void main3(String[] args) {
        //判断一个字符串是否都是由数字组成的
        String str = "123456";
        System.out.println(func(str));
    }
    public static void main2(String[] args) {
        String str1 = "hello";
        String str2 = "hel" + "lo";
        System.out.println(str1 == str2);
        String str3 = new String("hello");
        System.out.println(str1 == str3);
        String str4 = new String("hel")+"lo";
        System.out.println(str4 == str1);
        System.out.println(str1.equals(str2));
    }
    public static void main1(String[] args) throws CloneNotSupportedException {
        //练习自定义类型的克隆
        int[] arr = {1,2,3,4,5};
        int[] arr2 = arr.clone();
        arr2[0] = 33;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println("*************************************888");
        Person person = new Person(22);
        Person person2 = (Person)person.clone();
        System.out.println(person.age);
        System.out.println(person2.age);
        person2.m.money = 99.9;
        System.out.println(person.m.money);
        System.out.println(person2.m.money);
    }
}
