/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -04 -21
 * Time: 8:55
 */

/*
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int max = 0;
            for(int i = 0; i < n; i++) {
                for(int j = i+1; j < n; j++) {
                    //让arr[i]放大的数
                    if(arr[i] < arr[j]) {
                        swap(arr,i,j);
                    }
                    int count = arr[i]*arr[j] + arr[i] - arr[j];
                    if(count > max) {
                        max = count;
                    }
                }
            }
            System.out.println(max);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
*/


import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int max = 0;
            //先排序
            //可能有负数的情况
            Arrays.sort(arr);
            for(int i = 0; i < n-1; i++) {
                int last = arr[n-1];
                if(arr[i] < 0) {
                    last = arr[i+1];
                }
                int count = arr[i]*last + last - arr[i];
                if(count > max) {
                    max = count;
                }
            }
            System.out.println(max);
        }
    }
}


/*
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            while(n > 0) {
                int L = sc.nextInt();
                int R = sc.nextInt();
                int k = sc.nextInt();
                int resoult = 0;
                int i = 0;
                for(i = L; i <= R; i++) {
                    //计算 i 的二进制中1的个数
                    int count = 0;
                    int tmp = 1;
                    while(tmp > 0) {
                        if((tmp&i) > 0) {
                            count++;
                        }
                        tmp <<= 1;
                    }
                    if(count == k) {
                        resoult++;
                    }
                }
                System.out.println(resoult);
                n--;
            }
        }
    }
}
*/

