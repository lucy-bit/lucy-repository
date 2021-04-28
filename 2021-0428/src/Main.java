import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -04 -28
 * Time: 23:52
 */
public class Main {
    public static void main(String[] args) {
        //1、使用for循环去拷贝
//2、System.arraycopy
        int[] array1 = {1,2,3,4,5};
        int[] array2 = new int[array1.length];
        System.arraycopy(array1,0,array2,0,array1.length);
//3、Arrays.copyOf
        int[] array1 = {1,2,3,4,5};
        int[] array3 = Arrays.copyOf(array1,array1.length);
        System.out.println(Arrays.toString(array3));
//4、数组名.clone();  clone是Object的方法
        int array2 = array1.clone();


        public static String toString(int[] array) {
            String str = "[";
            for(int i=0; i<array.length; i++) {
                str += array[i];
                if(i != array.length-1) {
                    str += ",";
                }
            }
            str += "]";
            return str;
        }
        public static void main(String[] args) {
            int[] array = {1,2,3,4,5,6};
            System.out.println(toString(array));
        }


/*        //数组的逆置
        public static int[] reverse(int[] arr) {
            int left = 0;
            int right =  arr.length-1;
            int tmp = 0;
            while(left < right) {
                tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left++;
                right--;
            }
            return arr;
        }

        public static void bubbleSort(int[] arr) {
            int tmp = 0;
            //趟数
            for(int i = 0; i < arr.length-1; i++) {
                boolean flag = true;
                //每趟比较的次数
                for(int j = 0; j < arr.length-1-i; j++) {
                    flag = true;
                    if(arr[j] > arr[j+1]) {
                        tmp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tmp;
                        flag = false;
                    }
                }
                if(flag) {
                    break;
                }
            }
        }

        字符串的查找
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

        字符串的替换
//将字符串中的a全部替换为b 注意：这里的替换指的不是将字符串改变，而是返回了新的对象
        String str = "aabaa";
        System.out.println(str.replace('a','b'));//bbbbb
        System.out.println(str.replace("aa","##"));//##b##
        System.out.println(str.replaceAll("aa","##"));//作用与replace一样
        System.out.println(str.replaceFirst("aa","##"));//##baa 替换第一个aa

        字符串的分割
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

        字符串的截取
        String str = "abcdefg";
        System.out.println(str.substring(3));//defg 从3号下标开始截取
        System.out.println(str.substring(3,5));//de [) 左闭右开


        if(str.substring(a+1).contains(str.substring(a,a+3))){
            return "NG";
        }*/
    }
}
