/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -11 -30
 * Time: 19:59
 */


import java.util.*;
public class Main {
    public static int[] elem = new int[100];
    public static int usedSize = 0;
    //创建大小为k的大根堆
    public static void createHeap(int[] arr,int k) {
        for(int i = 0; i < k; i++) {
            elem[i] = arr[i];
            usedSize++;
        }
        //调整为大根堆
        for(int i = (usedSize-1-1)/2; i >= 0; i--) {
            adjustDown(i,k);
        }
    }
    private static void adjustDown(int root,int len) {
        int parent = root;
        int child = 2*parent + 1;

        while(child < len) {
            //此时有左孩子

            //此时有右孩子并且右孩子数比左孩子大
            if(child+1 < len && elem[child] < elem[child+1]) {
                //让child指向左右孩子中较大的孩子
                child++;
            }
            if(elem[child] > elem[parent]) {
                int tmp = elem[child];
                elem[child] = elem[parent];
                elem[parent] = tmp;
            }
            parent = child;
            child = 2*parent + 1;
            if(elem[child]< elem[child+1]) {
                int tmp = elem[child];
                elem[child] = elem[child+1];
                elem[child+1] = tmp;
            }
        }
    }
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
            createHeap(arr2,k);
            for(int i = k; i < arr2.length; i++) {
                if(elem[0] > arr2[i]) {
                    elem[0] = arr2[i];
                    adjustDown(0,k);
                }
            }
            for(int i = k-1; i >= 0; i--) {
                System.out.print(elem[i] + " ");
            }
        }
    }
}