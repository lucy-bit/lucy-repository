import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -12 -08
 * Time: 9:42
 */
class Person {
    public String name;
    public String class1;
    public double score;

    public Person(String name, String class1, double score) {
        this.name = name;
        this.class1 = class1;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", class1='" + class1 + '\'' +
                ", score=" + score +
                '}';
    }

}
public class TestDemo {
    //numRows：你的行数
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        if(numRows == 0) {
            return triangle;
        }
        triangle.add(new ArrayList<>());//0
        triangle.get(0).add(1);
        //行数
        for (int i = 1; i < numRows; i++) {
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);
            //上一行
            List<Integer> prevRow = triangle.get(i-1);
            //第i行的第j列
            for (int j = 1; j < i; j++) {
                int tmp = prevRow.get(j-1)+prevRow.get(j);
                curRow.add(tmp);
            }
            curRow.add(1);
            triangle.add(curRow);
        }
        return triangle;
    }

    public static void main(String[] args) {
        List<List<Integer>> ret = generate(5);

        for (List<Integer> list  : ret) {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> generation2(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if(numRows == 0) {
            return triangle;
        }
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> curRows = new ArrayList<>();
            curRows.add(1);
            List<Integer> prevRows = triangle.get(i-1);
            for(int j = 1; j < i; j++) {
                int ret = prevRows.get(j) + prevRows.get(j-1);
                curRows.add(ret);
            }
            curRows.add(1);
            triangle.add(curRows);
        }
        return triangle;
    }
    //再写一遍杨辉三角
    public static void main(String[] args) {
        List<List<Integer>> ret = generation2(5);
        for (List<Integer> list: ret) {
            System.out.println(list);
        }
    }
    public static List<List<Integer>> generation(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if(numRows == 0) {
            return triangle;
        }
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        for (int i = 1; i < numRows; i++) {
            List<Integer> curRows = new ArrayList<>();
            curRows.add(1);
            List<Integer> prevRows = triangle.get(i-1);
            for(int j = 1; j < i; j++) {
                int tmp = prevRows.get(j) + prevRows.get(j-1);
                curRows.add(tmp);
            }
            curRows.add(1);
            triangle.add(curRows);
        }
        return triangle;
    }

    public static void main6(String[] args) {
        List<List<Integer>> ret = generation(5);
        for ( List<Integer> list : ret) {
            System.out.println(list);
        }
        // System.out.println(ret);
    }
    public static List<Character> func(String str1,String str2) {
        List<Character> ret = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            if(!(str2.contains(str1.charAt(i)+""))) {
                ret.add(str1.charAt(i));
            }
        }
        return ret;
    }

    public static void main5(String[] args) {
        String str1 = "welcome to bit";
        String str2 = "come";
        List<Character> ret = func("welcome to bit","come");
        System.out.println(ret);

    }
    public static void main4(String[] args) {
        List<Person> list = new ArrayList<>();
        Person per1 = new Person("小梦","class2",99.9);
        list.add(per1);
        list.add(new Person("小小","class1",111.0));
        list.add(new Person("小鬼","class3",100.0));
        System.out.println(list);
        System.out.println("*************************************");
        for (Person peron : list) {
            System.out.println(peron);
        }
    }
    public static void main3(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("国民女神","高圆圆");
        System.out.println(map);
        String str = map.getOrDefault("及时雨","ll");
        System.out.println(str);
        System.out.println(map.containsKey("国民老公"));
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


    }
    public static void main2(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Java");
        collection.add("hello");
        System.out.println(collection.isEmpty());
        System.out.println(collection.size());
        System.out.println(collection);
        collection.remove("Java");
        System.out.println(collection);
        collection.add("nan");
        collection.add("Lilguest");
        Object[] string = collection.toArray();
        System.out.println(Arrays.toString(string));

    }
}
