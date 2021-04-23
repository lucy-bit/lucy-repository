/*
import java.util.Arrays;
import java.util.Scanner;

*/
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -04 -23
 * Time: 9:57
 *//*

public class Main {
    public static void main(String[] args) {
        */
/*Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {

        }*//*


        int[] arr={6,3,8,2,9,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void bubbleSort(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length-i-1; j++) {
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
    }
}


*/


public class Main {
    public static void main(String[] args) {
        //冒泡排序
//未优化的版本：
//时间复杂度：好坏都是O(n^2)
//空间复杂度：O(1)
//稳定性：稳定
        public static void bubbleSort(int[] arr) {
            for(int i = 0; i < arr.length-1; i++) {
                //每一趟比较
                for(int j = 0; j < arr.length-i-1; j++) {
                    if(arr[j] > arr[j+1]) {
                        int tmp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tmp;
                    }
                }
            }
        }

//优化之后
//时间复杂度：最好情况下是O(n),一般情况下是O(n^2)
        public static void bubbleSort(int[] arr) {
            boolean flag = false;
            for(int i = 0; i < arr.length-1; i++) {
                flag = false;
                for(int j = 0; j < arr.length-i-1; j++) {
                    if(arr[j] > arr[j+1]) {
                        int tmp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tmp;
                        flag = true;
                    }
                }
                if(!flag) {
                    break;//说明一趟比较完没有发生交换，序列已经有序，无需再往下比较
                }
            }
        }
    }
}