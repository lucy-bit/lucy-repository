/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -12 -02
 * Time: 15:28
 */
import java.util.*;
class MyException extends Exception{
      /*public MyException(String s) {
            super(s);
        }*/

}
public class TestDemo {

    public static String reverse(String str,
                                 int start,int end) {
        char[] array1 = new char[str.length()];
        char[] array = str.toCharArray();
        while (start < end) {
            char tmp = array[start];
            array[start] = array[end];
            array[end] = tmp;
            start++;
            end--;
        }
        return String.copyValueOf(array);
    }

    public static String func1(String str,int k) {
        if(str == null || k <= 0 || str.length() ==0) {
            return null;
        }
        str  = reverse(str,0,k-1);
        str  = reverse(str ,k,str.length()-1);
        str  = reverse(str ,0,str.length()-1);

        return str;
    }


    public static void main2(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int k = scan.nextInt();
            String str = scan.next();
            String ret = func1(str,k);
            System.out.println(ret);
        }
    }



        public static String func(String str) {
            //思路：定义两个字符数组，遍历字符串，将字母字符和*字符分开存入两数组中，
            //最后再拼接两个数组即可

        /*char[] array1 = {};
        char[] array2 = "";
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '*')
        }*/

            char[] array = str.toCharArray();
            String str1 = "";
            String str2 = "";
            int j = array.length - 1;
            for(int i = j; i >= 0; i--) {
                if(array[i] != '*') {
                    array[j] = array[i];
                    j--;
                }
            }
            for(; j >= 0; j--) {
                array[j] = '*';
            }
            return String.copyValueOf(array);

           /* char[] array = str.toCharArray();
            String str1 = "";
            String str2 = "";
            for(char ch : array) {
                if(ch == '*') {
                    str1 += ch;
                }else {
                    str2 += ch;
                }
            }
            return str1 += str2;*/
        }
        public static void main3(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            System.out.println(func(str));
        }
    public static void func(int a,int b) {
        if(b == 0) {
            throw new ArithmeticException();
        }
        System.out.println(a/b);
    }
    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            func(a,b);
        }catch(ArithmeticException e) {
            e.getStackTrace();
            System.out.println("捕获一条异常");
        }finally {
            sc.close();
            System.out.println("finally永远且会最后被执行");
        }
        System.out.println("LilGuest");
    }


    public static void func2() throws MyException{
        int a = 10;
        if(a == 10) {
            throw new MyException();
        }
    }

    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);//a必须初始化1
        try {
            func2();
        }catch(MyException e) {
            e.printStackTrace();
            System.out.println("自定义异常");
        }
    }


}
class func {
    public int name;
    public static void eat() {
        System.out.println();
    }
    public void sleep() {
        System.out.println(name);
    }
}