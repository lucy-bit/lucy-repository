import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2019-11-30
 * Time: 8:50
 */
public class TestDemo {


    public static void main(String[] args) {
        String str = "abc";
        String str2 = str+"def";
        System.out.println(str2);
    }

    //将字符串进行逆置
    public static String reverse(String str) {
        char[] array = str.toCharArray();
        int left = 0;
        int right = array.length-1;
        while (left < right) {
            char tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
        return String.copyValueOf(array);
    }

    public static void main5(String[] args) {
        String str = "abcdef";//fedcba
        String ret = reverse(str);
        System.out.println(ret);
    }

    public static void main4(String[] args) {
        String string = "abcdefhello";
        //小写转大写
        string = string.toUpperCase();
        System.out.println(string);//[)
        string = string.toLowerCase();
        System.out.println(string);
        String str2 = "Java";
        System.out.println(string.concat(str2));
        String str3 = "";//null
        System.out.println(str3.isEmpty());
    }


    public static void main3(String[] args) {
        String str = "192|168|1|1";
        String[] strings = str.split("\\|");//\.
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }

    public static void main2(String[] args) {
        String str2 = "a#b#c ab#c b#a gaobo";

        String[] strings = str2.split(" ",3);

        System.out.println(Arrays.toString(strings));



        System.out.println("==========");
        for (int i = 0; i < strings.length; i++) {
            String[] strings1 = strings[i].split("#");
            System.out.println(Arrays.toString(strings1));
        }



        System.out.println("==========");
        System.out.println(str2.replace('a','g'));
        System.out.println(str2.replace("ab","##"));
        System.out.println(str2.replaceAll("ab","##"));
        System.out.println(str2.replaceFirst("abc","**"));

        System.out.println("==========");

        System.out.println(str2.startsWith("ab",3));
        System.out.println(str2.endsWith("ba"));
        //将该字符串的首尾空格全部去掉，中间的空格保留的
        System.out.println(str2.trim());



        System.out.println(str2.contains("def"));
        //查找子串-》返回下标-》KMP算法-》
        System.out.println(str2.indexOf("cdef",2));

        System.out.println(str2.lastIndexOf("ab"));
        //从后往前找-》从fromindex
        System.out.println(str2.lastIndexOf("ab",2));

    }

    public static void main1(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.compareTo(str2));//>0  == 0  < 0
    }
}
