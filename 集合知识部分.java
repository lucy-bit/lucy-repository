import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2019-12-08
 * Time: 11:23
 */
public class TestDemo2 {

    public static void main(String[] args) {
        //ArrayList->默认打下为10-》1.5倍扩容
        List<String> list = new ArrayList<>();

        ArrayList<Integer> arrayList = new ArrayList<>();

        list.add("Hello");
        list.add("Java");
        list.add("20");
        System.out.println(list);
        list.add(1,"sun");
        System.out.println(list);

        List<String> list2 = new ArrayList<>();
        list.add("20");
        list.add("2");

        list.addAll(list2);

        System.out.println(list);

        String  s = list.remove(1);
        System.out.println(s);
        System.out.println(list);

        list.remove("Java");
        System.out.println(list);

        String s1 = list.get(0);
        System.out.println(s1);
        //设置已有元素的下标位置的值  修改
        list.set(3,"niuniu");
        System.out.println(list);

        System.out.println(list.contains("niuniu2"));

        System.out.println(list.lastIndexOf("20"));
        //[ )
        List<String> ret = list.subList(1,2);
        //subList->不会产生新的对象
        System.out.println(ret);
        ret.set(0,"g");
        System.out.println(list);
        System.out.println(ret);

    }


    public static void main2(String[] args) {
        Integer a = 150;
        Integer b = 150;
        System.out.println(a == b);
    }

    public static void main1(String[] args) {
        //int -> Integer  自动装包/装箱
        Integer a = 10;
        //Integer.valueOf 进行装箱
        System.out.println(a);

        double b = a.doubleValue();//自动拆包/拆箱 intValue()
        System.out.println(b);

      /*  Integer b = Integer.valueOf(20);
        System.out.println(b);*/
    }
}
