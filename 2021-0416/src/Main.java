import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -04 -16
 * Time: 23:15
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,44,2,5,77,8};
        //insertSort(arr);
        binaryInsertSort(arr);
        //bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void binaryInsertSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int left = 0;
            int right = i;
            int tmp = arr[i];
            while(left < right) {
                int mid = left + (right-left)/2;
                if(arr[mid] > tmp) {
                    right = mid;
                }else {
                    left = mid + 1;
                }
            }
            for(int j = i; j > left; j--) {
                arr[j] = arr[j-1];
            }
            arr[left] = tmp;
        }
    }

    private static void bubbleSort(int[] arr) {
        boolean flag = false;
        for(int i = 0; i < arr.length; i++) {
            flag = false;
            for(int j = i+1; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    swap(arr,j,j+1);
                    flag = true;
                }
            }
            if(!flag) {
                break;
            }
        }
    }

    private static void insertSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j = 0;
            for(j = i-1; j >= 0; j--) {
                if(arr[j] > tmp) {
                    arr[j+1] = arr[j];
                }else {
                    arr[j+1] = tmp;
                    break;
                }
            }
        }
    }

    /*private static void insertSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j = 0;
            for(j = i-1; j >=0 ; j--) {
                if(arr[j] > tmp) {
                    arr[j+1] = arr[j];
                }else {
                    arr[j+1] = tmp;
                    break;
                }
            }

        }
    }*/


    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
