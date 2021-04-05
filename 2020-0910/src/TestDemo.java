import java.util.Arrays;



/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -09 -10
 * Time: 13:47
 */
public class TestDemo {
    public static int getOnce(int[] arr) {
        int ret = arr[0];
        for(int i = 1; i < arr.length; i++) {
            ret ^= arr[i];
        }
        return ret;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,3,4};
        System.out.println(getOnce(arr));
    }
    public static void main5(String[] args) {
        //定义不规则二维数组
        int[][] array = new int[2][];
        array[0] = new int[3];
        array[1] = new int[2];
        System.out.println(Arrays.deepToString(array));
        /*//定义二维数组
        int[][] array1 ={{1,2,3},{4,5,6}};
        int[][] array2 = new int[][]{{1,2,3},{4,5,6}};
        int[][] array3 = new int[2][3];
        //打印二维数组
        System.out.println(Arrays.deepToString(array1));
        for(int i = 0; i < array1.length; i++) {
            for(int j = 0; j < array1[i].length;j++) {
                System.out.print(array1[i][j]+" ");
            }
            System.out.println();
        }*/
    }
    public static void swap(int[] arr) {
        //前面遇到奇数停止，后面遇到偶数停止，然后交换，直到前后相遇
        int left = 0;
        int right = arr.length-1;
        while(left < right) {
            while(left <right && arr[left]%2 == 0) {
                left++;
            }
            //此时left遇到奇数 或 left与right相遇
            while(arr[right]%2 != 0) {
                right--;
            }
            //此时right遇到偶数 或 left与right相遇
            if(left <right) {
                //必须要有if这个条件，因为走到这一步时有两种可能：1）需要交换 2）left与right相遇了
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
    }
    public static void main4(String[] args) {
        //交换数组中的数字，使得数组中偶数在前，奇数在后
        int[] array = {1,2,3,4,5,6,7};
        swap(array);
        System.out.println(Arrays.toString(array));
    }
    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while(left <= right) {
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }
    public static void main3(String[] args) {
        //逆序数组
        int[] array = {1,2,3,4,5,6,7};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }
    public static void bubbleSort(int[] arr) {
        Boolean flg = false;
        //趟数
        for(int i = 0; i < arr.length-1; i++) {
            //每一趟比较的flg都要重新置为false，因为可能排着排着就有序了
            flg = false;
            //每一次比较的次数都比上一次少一次
            for(int j = 0; j<arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flg = true;
                }
            }
            if(flg)
                return;
        }

    }
    public static void main2(String[] args) {
        //练习冒泡排序
        int[] array = {1,4,6,3,34,67,13};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static boolean isUp(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1])
                return false;
        }
        return true;
    }
    public static void main1(String[] args) {
        //判断一个数组是否为升序的
        int[] array = {1,2,53,58,78};
        System.out.println(isUp(array));
    }
}
