import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -10 -31
 * Time: 19:27
 */
public class TestSort {
    //直接插入排序
    public static void inserSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j;
            for(j = i-1; j >= 0; j--) {
                if(tmp > arr[j]) {
                    break;
                }else {
                    arr[j+1] = arr[j];
                }
            }
            arr[j+1] = tmp;
        }
    }

    //优化的二分查找插入排序
    //未排序元素在排序序列中寻找合适位置时，若在此过程中能应用二分查找，速度会大大提高
    public static void binarySearchInsertSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            //[left,right)
            int left = 0;
            int right = i;

            while(left < right) {
                int mid = (left+right)/2;
                if(arr[mid] > tmp) {
                    right = mid;
                }else {
                    left = mid+1;
                }
            }
            for(int j = i; j > left; j--) {
                arr[j] = arr[j-1];
            }
            arr[left] = tmp;
        }
    }

    //希尔排序
    private static void shell(int[] arr,int gap) {
        for(int i = gap; i < arr.length; i += gap) {
            int tmp = arr[i];
            int j;
            for( j = i-gap; j > 0; j -= gap) {
                if(arr[j] > tmp) {
                    arr[j+gap] = arr[j];
                }else {
                    break;
                }
            }
            arr[j+gap] = tmp;
        }
    }
    public static void shellSort(int[] arr) {
        int[] array = {5,2,1};
        for(int i = 0; i < array.length; i++) {
            shell(arr,array[i]);
        }
    }
    public static void main(String[] args) {
        int[] array = {1,4,7,2,634,67,12,22,4,24};
        //inserSort(array);
        //binarySearchInsertSort(array);
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }
}
