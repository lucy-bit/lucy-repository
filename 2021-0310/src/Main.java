/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -10
 * Time: 17:01
 */
public class Main {
    public static void func(String str,char[] ch) {
        str = "abc";
        ch[0] = 'g';
    }
    public static void main(String[] args) {
        String str1 = "abcdef";
        char[] chars = {'a'};
        func(str1,chars);
        System.out.println(str1);
        System.out.println(chars);
    }
}
