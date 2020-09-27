import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -09 -27
 * Time: 16:26
 */
public class TestDemo {

    public static void main(String[] args) {
        String str1 = "welcome to bit";
        String str2 = "come";
        List<Character> list = new ArrayList<>();
        for(int i = 0; i < str1.length(); i++) {
            if(!str2.contains(str1.charAt(i)+"")) {
                list.add(str1.charAt(i));
            }
        }
        System.out.println(list);
    }
    public static void mai4n(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(19);
        list.add(3);
        list.add(34);
        list.add(32);
        list.add(2);
        Collections.sort(list);
        System.out.println(list);
    }
    public static void main3(String[] args) {
        List<Student> list = new ArrayList<>();
        Student student1 = new Student("小A",1,90.0);
        Student student2 = new Student("小B",1,98.0);
        Student student3 = new Student("小C",1,96.0);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        for(Student stu : list) {
            System.out.println(stu);
        }
    }
    public static void main2(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add(1,"kity");
        System.out.println(list);
        List<String> list2 = new ArrayList<>();
        list2.add("mum");
        list.addAll(list);
        System.out.println(list);
        list.remove("hello");
        System.out.println("删除hello后的list： "+list);
    }
    public static void main1(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();

        myArrayList.insert("apple");
        myArrayList.insert("banana");
    }
}
