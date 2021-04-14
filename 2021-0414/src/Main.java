/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -04 -14
 * Time: 20:19
 */

/*题目描述：
        小明得到一个只包含大小写英文字母的字符串s，下标从1开始计算。现在他希望得到这个字符串下标的一个奇怪的集合。这个奇怪的集合需要满足的条件是：

        1. 集合中的任意下标i对应的字母s[i]必须是小写字母

        2. 对于集合中的任意两个下标i、j，对于任意数字k，i<=k<=j，有s[k]是小写字母

        3. 集合中的下标对应的字母是两两不同的

        4. 集合中的数字尽可能的多

        帮助小明计算这个集合最多可以有多少下标。



        输入描述
        一行一个字符串，字符串长度不超过200

        输出描述
        集合可以包含的下标最大可能是多少


        样例输入
        aaBBBabBaAb
        样例输出
        2

        提示
        样例2：

        样例2输入：aabbcc

        样例2输出：3

        样例2解释：可以是下标1，3，5组成的集合。满足所有条件。*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            //ArrayList<Set<Character>> list = new ArrayList();
            int max_Count  = 0;
            Set<Character> set = new LinkedHashSet<>();
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    set.add(str.charAt(i));
                }else {
                    int count = set.size();
                    if(count > max_Count) {
                        max_Count = count;
                    }
                    set.clear();
                }
                if(i == str.length()-1 && max_Count == 0) {
                    max_Count = set.size();
                }
            }
            System.out.println(max_Count);
            //int count = 0;
            //StringBuffer sb = new StringBuffer();
            //Set<Character> set = new LinkedHashSet<>();
          /*  Map<Character,Boolean> map = new LinkedHashMap<>();
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    map.put(str.charAt(i),true);
                }
            }

            System.out.println(map.size());*/
           /* for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    set.add(str.charAt(i));
                }
            }*/
            //System.out.println(set.size());
        }
    }
}


/*
叠杯
        时间限制： 3000MS
        内存限制： 589824KB
        题目描述：
        叠杯是一种具有高观赏性的竞赛，一般叠杯会使用一定数量的杯子，上下往复改变杯子的位置，令人眼花缭乱。

        小A有2n个杯子，编号分别为1-2n。小A在表演一开始的时候，会将这些杯子按编号从小到大放成一排。小A会进行m次动作，第i次动作，小A从最左端的杯子开始，每数个杯子，将这个杯子的顺序反转。小A会进行次这种操作。

        每次操作完，小A想知道，这些杯子的编号构成序列的逆序对个数是多少。所谓逆序对，指在序列a1,a2...an中，满足1≤i＜j≤n，ai＞aj，则称为一对逆序对。



        输入描述
        输入第一行包含两个整数n，m（m≤20，m≤100000,0≤ti≤n）

        接下来m行，每行一个整数ti

        输出描述
        输出包含m个整数，代表操作完第i次操作后的逆序对个数。


        样例输入
        2 3
        2
        1
        2
        样例输出
        6
        4
        2

        提示
        样例解释

        开始序列为：1 2 3 4
        第1次操作后：4 3 2 1
        第2次操作后：3 4 1 2
        第3次操作后：2 1 4 3*/

/*
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int size = (int)Math.pow(2,n);
            int[] arr = new int[size];
            while(size != 0) {
                arr[size-1] = size--;
            }

            int m = sc.nextInt();
            for(int i = 0; i < m; i++) {
                int ti = sc.nextInt();
                int count = (int)Math.pow(2,ti);
                int times = (int)Math.pow(2,n-ti);
                int left = 0;
                int right = count - 1;
                while(times != 0) {
                    reverse(arr,left,right);
                    times--;
                    left += count;
                    right += count;
                }
                //计算有多少对逆序对
                System.out.println(countReverse(arr));
            }
        }
    }

    private static int countReverse(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length-1; i++) {
            int tmp = arr[i];
            boolean flag = false;
            for(int j = i+1; j < arr.length; j++) {
                if(tmp > arr[j]) {
                    count++;
                    flag = true;
                }
            }
            if(!flag) {
                if(judgeSort(arr)) {
                    break;
                }
            }
        }
        return count;
    }

    private static boolean judgeSort(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }

    private static void reverse(int[] arr, int left, int right) {
        while(left < right) {
            swap(arr,left,right);
            left++;
            right--;
        }
    }

    private static void swap(int[] arr, int left, int right) {
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }
}*/


/*
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int size = (int)Math.pow(2,n);
            int[] arr = new int[size];
            while(size != 0) {
                arr[size-1] = size--;
            }

            int m = sc.nextInt();
            for(int i = 0; i < m; i++) {
                int ti = sc.nextInt();
                int count = (int)Math.pow(2,ti);
                int times = (int)Math.pow(2,n-ti);
                int left = 0;
                int right = count - 1;
                while(times != 0) {
                    while(left < right) {
                        int tmp = arr[left];
                        arr[left] = arr[right];
                        arr[right] = tmp;
                        left++;
                        right--;
                    }
                    times--;
                    left += count;
                    right += count;
                }
                //计算有多少对逆序对
                System.out.println(countReverse(arr));
            }
        }
    }

    private static int countReverse(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length-1; i++) {
            int tmp = arr[i];
            boolean flag = false;
            for(int j = i+1; j < arr.length; j++) {
                if(tmp > arr[j]) {
                    count++;
                    flag = true;
                }
            }
            if(!flag) {
                if(judgeSort(arr)) {
                    break;
                }
            }
        }
        return count;
    }

    private static boolean judgeSort(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }
}*/
