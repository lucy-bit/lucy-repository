/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -01 -29
 * Time: 14:42
 */
/*
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();//输入第一个数 表示数字个数 n
        String[] nums = sc.nextLine().split(" ");//输入n个数字，空格分割
        String x = sc.nextLine();//输入要找的数字
        System.out.println(Arrays.asList(nums).indexOf(x));
    }
}
*/

/*
import java.util.*;
public class  Main {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String n = sc.nextLine();
            String[] arr = sc.nextLine().split(" ");
            String x = sc.nextLine();
            System.out.println(Arrays.asList(nums).indexOf(x));


    }
}*/

//day31 说反话编程练习
/*
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //思路：首先将每个单词颠倒，然后将整个句子颠倒——需要一个颠倒的函数
        String[] arr = sc.nextLine().split(" ");
        String ret = "";
        for(int i = 0; i < arr.length; i++) {
            reverse(arr[i]);
            if(i != arr.length-1) {
                ret = arr[i] + " ";
            }
        }
        reverse(ret);
        System.out.println(ret);
    }
    //颠倒函数
    public static void reverse(String str) {
        char[] array = str.toCharArray();
        int left = 0;
        int right = array.length-1;
        while(left < right) {
            char tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
        str = new String(array);
    }
}*/

//day31 复杂错误记录
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //首先，题目理解如下。输入的都是错误的记录，我们输出的是错误记录的净文件名，不能包含路径。
        //如果有相同的文件名相同的行号，这算一次错误，但是输出的时候不重复输出了。
        //错误次数最多为8次
        Map<String,Integer> map = new LinkedHashMap<String, Integer>();
        while(sc.hasNext()) {
            String path = sc.next();
            int id = path.lastIndexOf("\\");
            //如果不是路径，直接让fileName = path；如果是路径，要截取\之后的部分作为fileName(纯文件名）
            String fileName = id == -1 ? path : path.substring(id+1);
            //行号——line
            int line = sc.nextInt();
            //统计错误记录出现的次数
            String key = fileName + " " + line;
            if(map.containsKey(key)) {
                map.put(key,map.get(key)+1);
            }else {
                map.put(key,1);
            }
        }
        //排序——按照错误次数由大到小进行排序，由于使用的是java内部的排序算法，所以如果错误次数一样，就按照输入顺序排序
        List<Map.Entry<String,Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        //输出——注意：只输出8条结果，而且输出记录必须小于16个字符
        int m = 0;
        for(Map.Entry<String,Integer> mapping : list) {
            if(m >= 8) {
                break;
            }
            String[] str = mapping.getKey().split(" ");
            String fileName = str[0];
            if(fileName.length() > 16) {
                fileName = fileName.substring(fileName.length()-16);
            }
            String n = str[1];
            Integer count = mapping.getValue();
            System.out.println(fileName + " " + n + " " + count);
            m++;
        }
    }
}