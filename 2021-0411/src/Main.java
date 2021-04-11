import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -04 -11
 * Time: 10:11
 */

//给一个长度为n的只包含0和1的序列，每次可以使用魔法消除相邻的3个数。在可以用任意次魔法的前提下，
// 0的个数和1的个数的最大差值为多少？输出这个最大差值。
//
//
//
//输入描述
//第一行是一个正整数n，表示序列的长度。
//
//第二行是只包含0和1的序列，其长度为n。
//
//输出描述
//输出一个整数，表示这个最大差值。
   /* 样例输入
            5
            00001
            样例输出
            3*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            if(n < 0) {
                System.out.println("0");
            }
            int count0 = getCount(str,'0');
            int count1 = getCount(str,'1');
            int max = Math.abs(count0 - count1);
            for(int i = 0; i < str.length()-2; i++) {
                 count0 = getCount(str.substring(0,i) + str.substring(i+3),'0');
                 count1 = getCount(str.substring(0,i) + str.substring(i+3),'1');
                int count = Math.abs(count0 - count1);
                if(count > max) {
                    max = count;
                }
            }
            count0 = getCount(str.substring(0,1) + str.substring(str.length()-2),'0');
            count1 = getCount(str.substring(0,1) + str.substring(str.length()-2),'1');
            int count = Math.abs(count0 - count1);
            if(count > max) {
                max = count;
            }
            count0 = getCount(str.substring(0,2) + str.substring(str.length()-1),'0');
            count1 = getCount(str.substring(0,2) + str.substring(str.length()-1),'1');
            count = Math.abs(count0 - count1);
            if(count > max) {
                max = count;
            }
            System.out.println(max);
        }


    }
    private static int getCount(String str,char ch) {
        int count  = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}



/*题目描述：
        定义一个字符串为关键串当且仅当该串中出现次数最多的字符严格超过了字符总数（即串长）的一半。

        例如字符串"a","aab","aaab","abccc"是关键串，而"ab","abc","aabb","abcc"不是。

        给一个长度为n的字符串s，有多少个子串是关键串？

        子串：对于一个给定的字符串，串中任意个连续的字符组成的子序列称为该串的子串。



        输入描述
        第一行是一个正整数n，表示字符串的长度。

        第二行是一个长度为n的仅包含小写字母的字符串s。

        输出描述
        输出一行，表示字符串s中是关键串的子串个数。


        样例输入
        5
        ccccb
        样例输出
        14

        提示
        14个符合关键串定义的子串分别为"c","c","c","c","b","cc","cc","cc","ccc","ccc","ccb","cccc","cccb","ccccb"*/
/*
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            int count  = str.length();
            if(str.length() >= 2) {
                for(int i = 2; i <= str.length(); i++) {
                    if(i == str.length()) {
                        if(isKeyString(str)) {
                            count++;
                        }
                        break;
                    }
                    for(int j = 0; j <= str.length()-i; j++) {
                        if(j == str.length()-i) {
                            if(isKeyString(str.substring(j))) {
                                count++;
                            }
                            break;
                        }

                       if(isKeyString(str.substring(j,j+i))) {
                            count++;
                        }
                    }
                }
            }

            System.out.println(count);
        }
    }

    private static boolean isKeyString(String str) {
        //看是否是关键字符串
        int len = str.length();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        if(len % 2 == 0) {
            //偶数
            if(arr[len/2] == arr[len/2-1] && (arr[len/2] == arr[0] || arr[len/2] == arr[len-1])) {
                return true;
            }else {
                return false;
            }
        }else {
            if(arr[0] == arr[len/2] || arr[len-1] == arr[len/2]) {
                return true;
            }else {
                return false;
            }
        }
    }
}
*/
