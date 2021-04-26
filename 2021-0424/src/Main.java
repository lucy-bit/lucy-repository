import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -04 -24
 * Time: 22:33
 */
public class Main {

    public static int myBinarySearch(int[] arr,int key) {
        int left = 0;
        int right = arr.length;

        while(left <= right) {
            int mid = (left + right)/2;
            //可优化为 mid = (left+right)>>>2
            //无符号右移：位运算的速度快
            if(arr[mid] < key) {
                left = mid + 1;
            }else if(arr[mid] > key) {
                right = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] array = {2,4,7,9,10,14};
        int key = 10;
        System.out.println( myBinarySearch(array,key));
        // Arrays.binarySearch(array,5);
        // Arrays工具类中含有二分查找法
    }


/*    public static void main(String[] args) {
        *//*Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();

        }*//*
        int[] arr = {1,4,11,5,9,6,2,3,12};
        //bubbleSort(arr);
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr) {
        quick(arr,0,arr.length-1);
    }

    private static void quick(int[] arr, int left, int right) {
        if(left >= right) {
            return;
        }
        int pivot = partition(arr,left,right);
        quick(arr,left,pivot-1);
        quick(arr,pivot+1,right);
    }

    private static int partition(int[] arr, int left, int right) {
        int tmp = arr[left];
        while(left < right) {
            while(left < right && arr[right] > tmp) {
                right--;
            }
            arr[left] = arr[right];
            while(left < right && arr[left] < tmp) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = tmp;
        return left;
    }

    private static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    swap(arr,j,j+1);
                }
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }*/
}
