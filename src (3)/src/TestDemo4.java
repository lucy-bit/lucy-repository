import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2019-11-30
 * Time: 16:10
 */
public class TestDemo4 {

    public static int[] mergeArray(int[] array1,
                                   int[] array2) {
        int len = array1.length+array2.length;
        int[] tmp = new int[len];
        int k = 0;//tmp数组的下标

        int i = 0;//array1的下标
        int j = 0;//array2的下标

        while (i < array1.length
                && j < array2.length) {
            if(array1[i] <= array2[j]) {
                tmp[k++] = array1[i++];
            }else {
                tmp[k++] = array2[j++];
            }
        }
        while (i < array1.length) {
            tmp[k++] = array1[i++];
        }
        while (j < array2.length) {
            tmp[k++] = array2[j++];
        }
        return tmp;
    }

    /**
     * "aaabbbbbccddaaa"--->3a5b2c2d3a
     * @param str
     * @return
     */
    public static String func(String str){
        if(str == null || str.length() <= 0) {
            return null;
        }
        char ch = str.charAt(0);//a
        int repCount = 1;//重复出现的次数
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == ch) {
                repCount++;
            }else {
                sb.append(repCount).append(ch);//2a
                //i->
                ch = str.charAt(i);//b
                repCount = 1;
            }
        }
        return sb.append(repCount).append(ch).toString();
    }

    public static void reverse(char[] array,int left,int right) {
            while (left < right) {
                char tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
                left++;
                right--;
            }
        }

        public static String reverseSentence(String str) {
            char[] array = str.toCharArray();
            reverse(array,0,array.length-1);
            int i = 0;
            int j = 0;
            //单词逆置
            while (i < array.length) {
                if(array[i] == ' ') {
                    i++;
                    j++;
                }else if(j == array.length ||array[j] == ' ' ){
                    reverse(array,i,j-1);
                    i = ++j;
                }else {
                    j++;
                }
            }
            return String.copyValueOf(array);
        }

        public static void main(String[] args) {
            String ret = reverseSentence("i am student");
            System.out.println(ret);
        /*int[] array1 = {1,2,5,7,9};
        int[] array2 = {4,7,9,12,18};
        int[] ret = mergeArray(array1,array2);
        System.out.println(Arrays.toString(ret));*/
    }

    public static void main2(String[] args) {
        try {
            String str = null;
            str.length();
        }catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
    public static void main1(String[] args) {
        int a = 10;
        try {
            if(a == 10) {
                throw new Exception("异常");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("finally");
        }
    }
}
