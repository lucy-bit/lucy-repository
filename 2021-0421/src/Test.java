import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -04 -21
 * Time: 10:13
 */
public class Test {
    public static void main(String[] args) {
        //
        int[] arr = {1,123,3,5,6,1,11,3,44};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr) {
        quick(arr,0,arr.length-1);
    }

    private static void quick(int[] arr, int left, int right) {
        selectPivot(arr,left,right);
        int pivot = partition(arr,left,right);
        quick(arr,pivot+1,right);
        quick(arr,left,pivot-1);
    }

    private static int partition(int[] arr, int left, int right) {
        int tmp = arr[left];
        for(int i = left; i < right; i++) {

        }
    }

    private static void selectPivot(int[] arr, int left, int right) {
        //最简单版本
        return;
    }
}
