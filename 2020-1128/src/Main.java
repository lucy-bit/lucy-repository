/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -11 -28
 * Time: 17:20
 */
/*
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //若n为奇数，直接返回-1
        if(n%2 != 0) {
            System.out.println(-1);
        }else if(n%8 == 0) {
            //尽量装8的大袋，装不下了再考虑小袋
            System.out.println(n/8);
        }else if(n%8 == 6) {
            //n为偶数时，n/8的余数只可能是0，2，4，6 若余数为6，直接提供一个小袋
            System.out.println(n/8+1);
        }else if(n%8 == 2) {
            //若余数为2，退两个大袋，凑够三个小袋
            System.out.println(n/8-2+3);
        }else if(n%8 == 4) {
            //若余数为4，退一个大袋，凑够两个小袋
            System.out.println(n/8-1+2);
        }else {
            System.out.println(-1);
        }
}
}*/


/*
import java.util.*;
class A {
    public  A(int x) {

    }
    public void func(int a) {

    }
    public A(String a) {
        this(0);
        func(8);
        this.func(2);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        char[] arr = str2.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            str1 = str1.replaceAll(arr[i]+"","");
        }
        System.out.println(str1);
    }
}
*/

/*
import java.util.*;
public class Main {
    public static int func3(int n) {
        //递归法
        if(n == 1 || n == 2)
            return 1;
        return func3(n-1) + func3(n-2);
    }
    public static void main3(String[] args) {
        System.out.println(func3(3));
    }
    static int n;
    static int[] arr;
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //思路：递归思想。
        choose(40,n);
        System.out.println(count);
    }
    private static void choose(int size,int n) {
        //size 背包中剩余空间
        //n 剩余物品数目
        if(size == 0) {
            //刚好装满
            count++;
            return;
        }
        if((size < 0) || (size > 0 && n <=0)) {
            //背包还有空间，但是物品没有了，装不满
            //或者装不下
            return;
        }
        choose(size-arr[n-2],n-1);
        choose(size,n-1);
    }


}
*/

/*
import java.util.*;
public class Main{
    static int []weight;
    static int count = 0;
    static int n;
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            n = sc.nextInt();
            weight = new int[n+1];
            for(int i = 1;i<weight.length;i++){
                weight[i] = sc.nextInt();
            }
        }
        count(40,n);
        System.out.println(count);
    }
    public static void count(int s,int n){
        if(s == 0){
            count++;
            return;
        }
        if(s<0 || n<1)
            return;
        count(s-weight[n],n-1);
        count(s,n-1);
    }
}*/
import java.util.*;
public class Main {
    static int n;
    static int[] arr;
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //思路：递归思想。
        choose(40,n);
        System.out.println(count);
    }
    public static void choose(int size,int n) {
        //size 背包中剩余空间
        //n 剩余物品数目
        if(size == 0) {
            //刚好装满
            count++;
            return;
        }
        if((size < 0) || (size > 0 && n <=0)) {
            //背包还有空间，但是物品没有了，装不满
            //或者装不下
            return;
        }
        choose(size-arr[n-1],n-1);
        choose(size,n-1);
    }
}




import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {

            //用map的方法

           /* Map<Integer,Integer> map = new HashMap<>();
           String[] arr = sc.nextLine().split(" ");
            for(int i = 0; i < arr.length; i++) {
                int s = Integer.valueOf(arr[i]);
                if(map.containsKey(s)) {
                    map.put(s,map.get(s)+1);
                }else {
                    map.put(s,1);
                }
            }
            Set<Map.Entry<Integer,Integer>> set = map.entrySet();
            for(Map.Entry<Integer,Integer> tmp : set) {
                if(tmp.getValue() >= arr.length/2) {
                    System.out.println(tmp.getKey());
                }
            }
            */

            //若该整数出现次数大于等于n/2，那么数组经排序后最中间的数一定是该整数
            ArrayList<Integer> list = new ArrayList<>();
            while(sc.hasNextInt()) {
                list.add(sc.nextInt());
            }
            Collections.sort(list);
            System.out.println(list.get(list.size()/2));
        }
    }
}