import java.lang.reflect.Array;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -30
 * Time: 9:46
 */

public class TestDemo {
    /*
   */
/* public static String func(String str) {
        String[] str2 = str.split(" ");
        String ret = "";
        for(String str1 : str2) {
            ret += str1;
        }
        return ret;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ret = func(str);
        System.out.println(ret);
    }*//*

   */
/* public static String reverse(String str) {
        //思路，先将字符串转为数组，数组逆置，数组转字符串
        char[] array = str.toCharArray();
        int right = array.length - 1;
        int left = 0;
        if(array.length != 0) {
            while(right > left) {
                char ret = '0';
                ret = array[left];
                array[left] = array[right];
                array[right] = ret;
                right--;
                left++;
            }
            return String.copyValueOf(array);
           *//*
*/
/* String ret = array.copyValueOf();
            return ret;*//*
*/
/*
        }
        return null;
    }
    public static String reverse2(String str,int start,int end) {
        //思路，先将字符串转为数组，数组逆置，数组转字符串
        char[] array = str.toCharArray();
        *//*
*/
/*int right = array.length - 1;
        int left = 0;
        if(array.length != 0) {
            while(right > left) {
                char ret = '0';
                ret = array[left];
                array[left] = array[right];
                array[right] = ret;
                right--;
                left++;
            }*//*
*/
/*

            while(end > start) {
                char ret = '0';
                ret = array[start];
                array[start] = array[end];
                array[end] = ret;
                end--;
                start++;
            }
            return String.copyValueOf(array);
           *//*
*/
/* String ret = array.copyValueOf();
            return ret;*//*
*/
/*
      \
    }
    public static String func(String str,int k) {
    //思路：三次逆置
        reverse2(str,0,k-1);
        reverse2(str,k,str.length()-1);
        reverse2(str,0,str.length()-1);
        return str;
    }
    public static void main(String[] args) {
      *//*
*/
/*  String str = "abcdef";
        String ret = reverse(str);
        System.out.println(ret);*//*
*/
/*
        String str = "abcdef";
        int k = 0;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        String ret = func(str,k);
        System.out.println(ret);
        }
*//*


    public static void main2(String[] args) {
     */
/*   //1、编写一个类，在其main()方法的try块里抛出。。。
       String str = "";
        try {
            str = null;
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("");
        }
    }*//*


        //2
        int[] arr = {1, 2, 3};
        arr = null;
        try {
            arr = null;
            System.out.println("before");
            System.out.println(arr[0]);

        } catch (NullPointerException e) {
            System.out.println("这是一条空指针异常");
            e.printStackTrace();

        }
        System.out.println("after");
    }

    //1、合并两个有序数组
    public static int[] combine(int[] array1, int[] array2) {
        int[] ret = new int[array1.length + array2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        */
/*for(int k = 0; k < (array1.length + array2.length - 1); k++) {
            if(i == array1.length - 1) {
                ret[k] = array2[j];
                j++;
            }
            else if(j == array2.length - 1) {
                ret[k] = array1[i];
                i++;
            }
            if(array1[i] <= array2[j]) {
                ret[k] = array1[i];
                i++;
            }else {
                ret[k] = array2[j];
                j++;
            }
        }*//*

        while(i < array1.length && j < array2.length) {
            if(array1[i] <= array2[j]) {
                ret[k] = array1[i];
                i++;
                k++;
                //ret[k++] = array1[i];
            }else {
                ret[k] = array2[j];
                j++;
                k++;
            }
        }
        while(i < array1.length) {
            ret[k++] = array1[i++];

        }
        while(j < array2.length) {
            ret[k++] = array2[j++];
        }
      return ret;

    }
    public static void main2(String[] args) {
        int[] array1 = {1,3,6,9};
        int[] array2 = {2,4,6,8};
        System.out.println(Arrays.toString(combine(array1,array2)));
       */
/* int[] ret = new int[array1.length + array2.length];
        ret = combine(array1,array2);
        for(int x:ret) {
            System.out.println(x);
        }*//*

    }
*/



    public static void reverse(char[] array,int left,int right) {

        while(right > left) {
            char ret = '0';
            ret = array[left];
            array[left] = array[right];
            array[right] = ret;
            right--;
            left++;
        }


    }
    public static void reverseSentense(char[] array) {
        int right = array.length - 1;
        int left = 0 ;
        while(right > left) {
            char ret = '0';
            ret = array[left];
            array[left] = array[right];
            array[right] = ret;
            right--;
            left++;
        }
    }
    public static void main(String[] args) {
        //思路：先将字符串转为数组，数组整体逆置，找空格逆置单词，还要
        String str = "i am student";
       char[] array = str.toCharArray();
        reverseSentense(array);
        int i = 0;
        int j = 0;
        while(i < array.length) {
            if(array[i] == ' ') {
                i++;
                j++;
            }else if(j == array.length || array[j] == ' '){
                reverse(array,i,j-1);
                i = ++j;
            }else {
                j++;
            }
        }
        System.out.println(array.toString());

    }


}


