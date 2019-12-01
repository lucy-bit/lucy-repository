import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -12 -01
 * Time: 16:41
 */


//public native String intern(); C/C++实现
public class TestDemo {
    //代码示例: 给定字符串一个字符串, 判断其是否全部由数字所组成.
    //思路: 将字符串变为字符数组而后判断每一位字符是否是" 0 "~"'9'"之间的内容，如果是则为数字.
    public static boolean isNumber(String str) {
        char[] array = str.toCharArray();
        int i = 0;
        while(i < array.length) {
            if(array[i] > '9' || array[i] < '0') {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        //在原来sb的对象上进行追加
        StringBuilder sb = new StringBuilder("abcdef");
        System.out.println(sb.append("java"));

        //在新创建的对象上追加
        String str = "abcdef";
        String str2 = str + "java";
        //String的拼接底层会优化为StringBuilder
        System.out.println(str2);

        String str = "abcdef";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("java");
        String str2 = sb.toString();
        System.out.println(str2);




    }
   /* public static void main(String[] args) {
        String str = "192.168.1.1";
        String[] strings = str.split("\\.");
        for(String string : strings) {
            System.out.println(string);
        }
        //System.out.println(Arrays.toString(strings));
    }*/
   public static void main6(String[] args) {
       String str = "abcdef";
       String str1 = str.substring(3);
       System.out.println(str1);
       System.out.println(str.substring(3,5));
   }
    public static void main5(String[] args) {
        String str = "abc abc ba";
        String[] strings = str.split(" ");
       // System.out.println(Arrays.toString(strings));

       /* String str5 = "a#bc a#bc b#a";
        String[] string5 = str5.split("| |#");
        System.out.println(Arrays.toString(string5));*/

        String[] string2 = null;

        /* for(int i = 0; i < string1.length; i++) {
            string2 = string1[i].split(",");
            System.out.println(Arrays.toString(string2));
        }*/
        String str5="Java string-split#test";
        String[] string5 = str5.split(" |-|#");
        System.out.println(Arrays.toString(string5));

        String str3 = "a#bc a#bc aa bb";
        String[] string3 = str3.split(" ",3);
        //System.out.println(Arrays.toString(string3));



    }
    public static void main4(String[] args) {
        String str1 = "abcdef";
        String str2 = "abc";
        System.out.println(str1.contains(str2));
        System.out.println(str1.indexOf(str2));
    }
    public static void main3(String[] args) {
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.compareTo(str2));
    }
    public static void main2(String[] args) {
        String str1 = "abcdef";
        byte[] bytes = {97,98,99,100};
        String str = new String(bytes,1);
        String str6 = "12345";
        String str2 = new String("abcdef").intern();
        char[] array = {'a','b','c'};
        String str3 = new String(array);
        String str4 = "def";
        String str5 = "ab" + "cd" + str4;
        System.out.println(isNumber(str));
    }

}
