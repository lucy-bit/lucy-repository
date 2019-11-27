/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -26
 * Time: 21:09
 */
public class TestDemo {
    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = new String("abcdef");
        System.out.println(str1 == str2);//false
        String str3 = "abc"+"def";//拼接
        System.out.println(str1 == str3);//false  true
        String str4 = "abc"+ new String("def");
        System.out.println(str1 == str4);//false
        String str5 = "abc";
        String str6 = "def";
        String str7 = str5+str6;
        System.out.println(str1 == str7);//false
        String str8 = str5+new String("def");
        System.out.println(str4 == str8);//false
    }
    public static void main2(String[] args) {
        String str = "abcdef";//直接赋值
        String str1 = new String("abcdef");
        char[] array = {'a','b','c'};//通过定义字符数组来赋值
        String str2 = new String(array);
        /*String str = "112345";
        int len = str.length();
        int i = 0;
        for( i = 0; i < len; i++) {
            char a = str.charAt(i);
            if (a > '9' || a < '0') {
                break;
            }
        }
        if(i == len - 1) {
            System.out.println("都是数字");
        }else {
            System.out.println("不都是数字");
        }*/
    }






}
