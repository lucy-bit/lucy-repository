import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -12 -03
 * Time: 15:45
 */
public class TestDemo {
    public static void func1(int[] arr) {
        arr[0] = 99;
    }
    public static void main2(String[] args) {
        int[] arr1 = new int[] {1,2,3};
        System.out.println(arr1[0]);
        func1(arr1);
        System.out.println(arr1[0]);
    }

    public static void func2(int a) {
        a = 99;
    }
    public static void main3(String[] args) {
        int a = 10;
        System.out.println(a);
        func2(a);
        System.out.println(a);
        int[] arr = {1,2,3,4,5};
        for (int x:arr) {
            System.out.println(x);
        }
    }

    public static void main4(String[] args) {

        //int[] array2 = new int[array1.length];
       /* System.arraycopy(array1,0,array2,0,array1.length);
        System.out.println(Arrays.toString(array2));
        int[] array3 = Arrays.copyOf(array1,array1.length);
        System.out.println(Arrays.toString(array3));*/
        int[] array1 = {1,2,3,4,5};
        System.out.println(Arrays.binarySearch(array1,0,4,3));

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
    }
}
