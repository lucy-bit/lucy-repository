import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2019-12-08
 * Time: 8:52
 */
class Person {

}

public class TestDemo {

    public static void main(String[] args) {
        //int -> Integer  自动装包/装箱
        Integer a = 10;
        System.out.println(a);
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

        myArrayList.add("java");
        myArrayList.add("20191208");

        String ret = myArrayList.get();
        System.out.println(ret);

        MyArrayList<Integer> myArrayList2 = new MyArrayList<>();
        myArrayList2.add(1);
        myArrayList2.add(2);
        //MyArrayList<int> myArrayList3 = new MyArrayList<>();
    }

    public static void main3(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("java");
        myArrayList.add(2);
        myArrayList.add(0.3);

        double ret = (double)myArrayList.get();
        System.out.println(ret);
    }

    public static void main2(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("及时雨","宋江");
        map.put("黑旋风","李逵");
        map.put("国民女神","高圆圆");
        map.put("国民老公","王思聪");
        //map.put("国民老公","李现");
        System.out.println(map);
        String str = map.getOrDefault("及时雨2","小明");
        System.out.println(str);
        System.out.println(map.containsKey("黑旋风1"));
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println("============");
        for(Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+" " + entry.getValue());
        }
    }


    public static void main1(String[] args) {
        //这样写不好
        //Collection collection = new ArrayList();
        Collection<String> collection = new ArrayList<>();
        collection.add("Java");
        collection.add("hello");
        System.out.println(collection.isEmpty());
        System.out.println(collection.size());
        System.out.println(collection);
        collection.remove("Java");
        System.out.println(collection);
        collection.add("2019");
        collection.add("1208");
        /*Object[] strings = collection.toArray();
        System.out.println(Arrays.toString(strings));*/
        //一个类只要实现Iterable接口
        for (String s : collection) {
            System.out.println(s);
        }
    }
}
