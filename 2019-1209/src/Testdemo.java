import java.util.*;
//import java.lang.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -12 -09
 * Time: 12:36
 */
class Person {

}

public class Testdemo {
    public static void main(String[] args) {
        A<String> a = new A<String>("hello");
        String s = a.get();
        System.out.println(s);
    }
    public static void main8(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("java");
        list.add("20");
        System.out.println(list);
        String s = list.remove(1);
        System.out.println(s);
        System.out.println(list);
/*

        list.add(1,"sun");
        System.out.println(list);

        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list.addAll(list2);//使用addAll()方法
        System.out.println(list);
*/


    }
    public static void main7(String[] args) {
        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b);

        Integer c = 150;
        Integer d = 150;
        System.out.println(c == d);
    }
    public static void main6(String[] args) {
        //int -> Integer 自动装箱/装包 底层调用的是Integer.valueOf()方法
        Integer a = 10;
        //手动装箱
        Integer b = Integer.valueOf(20);
        //也可以
        Integer c = new Integer(30);

        int a2 = a;//自动拆包/拆箱 底层默认调用的是intValue() 方法
        //也可以指定类型拆包
        double b2 = b.doubleValue();
    }
    public static void main5(String[] args) {
        Person person = new Person();
        System.out.println(person);//

        MyArrayList<String> myArrayList = new MyArrayList<>();
        System.out.println(myArrayList);

        MyArrayList<Integer> myArrayList2 = new MyArrayList<>();
        System.out.println(myArrayList2);
    }
    public static void main4(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("救赎");
        myArrayList.add(" ");
        myArrayList.get();
    }
    public static void main3(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("小鬼鬼");
        collection.add("momo");
        System.out.println(collection);
        System.out.println(collection.isEmpty());
        System.out.println(collection.remove("momo"));
        System.out.println(collection);
        System.out.println(collection.contains("nana"));
        for (String str : collection) {
            System.out.println(str);
        }
    }
    public static void main2(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Rapper","小鬼");
        map.put("dancer","正正");
        map.put("singer","有长进");
        String str = map.getOrDefault("Rapper","laughter");
        System.out.println(str);
        System.out.println(map.isEmpty());
        System.out.println(map.remove("singer"));
        System.out.println(map);
        System.out.println(map.size());

        System.out.println(map);

        System.out.println("*****************或者*************");

        for (Map.Entry<String,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
