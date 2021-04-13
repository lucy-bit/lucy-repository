import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -04 -13
 * Time: 23:51
 */
public class Main {
    public static void main(String[] args) {
        String str = "abc abc ba";
        String[] strings = str.split(" ");
        System.out.println(Arrays.toString(strings));//[abc, abc, ba]

//多次分割
        String str2 = "a,bc a,bc b,a";
        String[] string1 = str2.split(" ");
        String[] string2 = null;
        for(int i = 0; i < string1.length; i++) {
            string2 = string1[i].split(",");
            System.out.println(Arrays.toString(string2));
        }
//[a, bc]
//[a, bc]
//[b, a]
//也可以用|   如果一个字符串中有多个分隔符，可以用"|"作为连字符.
        String str5="Java string-split#test";
        String[] string5 = str5.split(" |-|#");
        System.out.println(Arrays.toString(string5));//[Java, string, split, test]

        String str3 = "a#bc a#bc aa bb";
        String[] string3 = str3.split(" ",3);//只能分为三组，最后两个不分了
        System.out.println(Arrays.toString(string3));//[a#bc, a#bc, aa bb]

//注意：IP地址的拆分要特别注意字符转义
//字符"|","*","+","."都得加上转义字符，前面加上"\".
//而如果是""，那么就得写成"\\"
        String str = "192.168.1.1";
        String[] strings = str.split("\\.");
        System.out.println(Arrays.toString(strings));//[192, 168, 1, 1]
//第一个\指的是将第二个\转译为\，第二个\指的是将\.转译为.
        //将字符串中的a全部替换为b 注意：这里的替换指的不是将字符串改变，而是返回了新的对象
        String str = "aabaa";
        System.out.println(str.replace('a','b'));//bbbbb
        System.out.println(str.replace("aa","##"));//##b##
        System.out.println(str.replaceAll("aa","##"));//作用与replace一样
        System.out.println(str.replaceFirst("aa","##"));//##baa 替换第一个aa

        //看是否包含该字符串,底层调用了indexOf方法
        String str1 = "abcdef";
        String str2 = "abc";
        String str3 = "  abc def  ";
        System.out.println(str1.comtains(str2));//true

//如果包含返回它的下标，indexOf效率更高
        System.out.println(str1.indexOf(str2));//0 从头开始找
        System.out.println(str1.indexOf(str2，2));//从2号下标开始找，即c开始找
        System.out.println(str1.lastIndexOf("cd"));//2 从后往前找，找到返回下标
        System.out.println(str1.lastIndexOf("cd"，3));//2 从3号下标从后往前找

//判断当前字符串是否以传入的字符串开头或结尾，也可以给偏移量
        System.out.println(str1.startsWith("abc"));//true
        System.out.println(str1.endsWith("cd"));//false

//将字符串首尾的空格全部去掉,中间的空格保留
        System.out.println(str3.trim());//abc def


        String str1 = "hello";
        String str2 = "Hello";
//判断是否相等
        System.out.println(str1.equals(str2));//false 不能忽略大小写
        System.out.println(str1.equalsIgnoreCase(str2));//true 忽略大小写

//判断字符串大小
        System.out.println(str1.compareTo(str2));//-32
//compareTo可以直接使用是因为String中已经实现了compareAble接口，如果str1 < str2
//返回一个小于0的数，相等返回0，大于返回大于0的数

        //字符串转换为字符数组
        String str = "hello";
        char[] array = str.toCharArray();
//字符数组转换为字符串
        char[] array = {'a','b','c'};
        String str1 = new String(array2);//abc
        String str2 = new String(array2,1,2)//偏移量 bc
//也可以用String.copyValueOf()方法
//字符串转换为字符
        String str = "abc";
        char ch = str.charAt(0)//a

//byte数组转换为字符串
        byte[] bytes = {97,98,99,100};
        String str = new String(bytes);//abcd,因为String由byte类型的构造方法
        String str2 = new String(bytes,1,2);//bc 有偏移量
//字符串转换为字节
        String str = "abcd";
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));
    }
}
