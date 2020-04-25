/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2019-11-30
 * Time: 11:45
 */
public class TestDemo2 {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            str.append(i);
        }
        System.out.println(str);
    }

    public static void main1(String[] args) {
        StringBuilder sb = new StringBuilder("abcdef");
        System.out.println(sb);
        sb.append("java");
        System.out.println(sb);
    }
    public static void main2(String[] args) {
       /* String str = "abc";
        String str2 = str+"def";
        //String的拼接底层会优化为StringBuilder
        System.out.println(str2);
*/
        //String str = "abc";
 /*       StringBuilder sb = new StringBuilder("abc");
        sb.append("def");
        sb.append("ghtil");
        //String str2 = sb.toString();
        System.out.println(sb);*/

    }
}
