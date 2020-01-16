import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -01 -16
 * Time: 13:17
 */
public class TestDemo {
    public static void rotate(int[] nums, int k) {
        //第一种方法：定义一个新的数组，让对应下标i + k,如果结果比length-1大的话，就-length
        int[] ret = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
            if ((i + k) > (nums.length - 1)) {
                ret[i + k - nums.length] = nums[i];
            } else {
                ret[i + k] = nums[i];
            }
        System.out.println(Arrays.toString(ret));
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
    }
}
    //数组的逆置
    public static int[] reverse(int[] arr) {
        int left = 0;
        int right =  arr.length-1;
        int tmp = 0;
        while(left < right) {
            tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
        return arr;
    }
    public static void bubbleSort(int[] arr) {
        int i = 0;
        int j = 0;
        boolean flag = false;
        //趟数
        for(i = 0; i < arr.length - 1; i++) {
            //因为每一趟都可能不用交换
            flag = false;
            //次数
            for(j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flag = true;
                }
            }
            if(!flag) {
                return;
            }
        }
    }
    public static void main(String[] args) {
        //写冒泡排序
        int[] array = {1,4,9,2,5};
        int[] array2 = {3,4,5,6,7};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));