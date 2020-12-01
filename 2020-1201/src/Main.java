import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -12 -01
 * Time: 16:35
 */
/*import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                arrayList.add(i);
            }
            int i = 0;

            while(arrayList.size() > 1) {
                i += 2;
                arrayList.remove(i%arrayList.size());

            }
            System.out.println(arrayList.get(0));
        }
    }
}*/

/*
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n > 1000) {
                n = 999;
            }
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                list.add(i);
            }
            int i = 0;
            while (list.size() > 1) {
                i = (i + 2) % list.size();
                list.remove(i);
            }
            System.out.println(list.get(0));
        }
    }
}
*/

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            //思路：创建一个长度为k的大根堆，然后用数组中其他数和堆顶元素依此比较
            //若比堆顶元素大，不考虑；若比堆顶元素小，交换，堆重新调整，最后的即为所得k个值
            String[] arr = sc.nextLine().split(" ");
            int[] arr2 = new int[arr.length-1];
            int k = 0;
            for(int i = 0; i < arr.length; i++) {
                if(i == arr.length-1) {
                    k = Integer.parseInt(arr[i]);
                }else {
                    arr2[i] = Integer.parseInt(arr[i]);
                }

            }
            PriorityQueue<Integer> pq = new PriorityQueue<>(k, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });

            for(int i = 0; i < arr2.length; i++) {
                if(pq.size() < k) {
                    pq.offer(arr2[i]);
                }else {
                    if(pq.peek() > arr2[i]) {
                        pq.poll();
                        pq.offer(arr2[i]);
                    }
                }

            }
            int[] ret = new int[k];
            for(int i = 0; i < k; i++) {
                ret[i] = pq.poll();

            }
            for(int i = k-1; i >= 0; i--) {

                System.out.print(ret[i] + " ");
            }
        }
    }
}
