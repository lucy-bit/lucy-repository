import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -25
 * Time: 10:14
 */
public class Solution {
    public static void main(String[] args) {
        int[] arr = {1,2,44,3,69,4};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //直接插入排序
    public static void insertSort(int[] arr) {
        //思路：将序列分为有序组和无序组，从无序组中依此遍历，在前面找合适位置插入
        for(int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j;
            for(j = i-1; j >= 0; j--) {
                if(arr[j] > tmp) {
                    arr[j+1] = arr[j];
                }else {
                    break;
                }
            }
            arr[j+1] = tmp;
        }
    }
    //折半直接插入排序
    public static void binaryInsertSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int right = i-1;
            int left = 0;
            while(left <= right) {
                int mid = (left + right)/2;
                if(arr[mid] > tmp) {
                    right = mid-1;
                }else if(arr[mid] < tmp) {
                    left = mid+1;
                }else {
                    // i 就是
                    for(int j = right; j>=mid; j--) {
                        arr[j+1] = arr[j];
                    }
                }
            }
        }
    }
}
