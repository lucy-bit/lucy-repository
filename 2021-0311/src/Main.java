/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -11
 * Time: 0:46
 */
public class Main {
    public static void insertSort(int[] array) {
        //直接插入排序
        //把数组分为有序区间和无序区间，每次从无需区间取一个数，在有序区间找到合适的位置插入
        //取的方法：从1开始向后找，0下标的数视为有序
        //找合适位置：从有序区间自后向前查找合适位置，如果取出的无序数tmp比有序区间的数字大或者相等就在此数后面添加，如果比有序区间数字小，则将有序区间自此数字向后的数都向后移一位
        for(int i =1; i < array.length; i++) {
            int v = array[i];
            int j = i-1;
            for(; j >= 0 ; j--) {
                if(array[j] > v) {
                    array[j] = array[j-1];
                }
            }
            array[j+1] = v;
        }
    }

    //折半插入排序
    public static void bsInserSort(int[] arr) {
        //在有序区间查找合适位置时利用二分查找会节省时间
        for(int i = 1; i < arr.length; i++) {
            int v = arr[i];
            int left = 0;
            int right = i;
            while(left < right) {
                int mid = (left+right)/2;
                if(arr[mid] <= v) {
                    left = mid+1;
                }else {
                    right = mid;
                }
            }
            //找到合适位置了，将right/left位置后的元素向后移
            for(int j = i-1; j >= right; j--) {
                arr[j+1] = arr[j];
            }
            arr[right] = v;
        }
    }


    //希尔排序
    public static void shellSort(int[] arr) {
        int[] drr = {5,3,1};
        for(int i = 0; i < drr.length; i++) {
            insertSortGap(arr,drr[i]);
        }
    }
    public static void insertSortGap(int[] arr,int gap) {
        for(int i = gap; i < arr.length; i++) {
            int tmp = arr[i];
            int j;
            for(j = i-gap; j > 0; j -= gap) {
                if(arr[j] > tmp) {
                    arr[j+1] = arr[j];
                }else {
                    break;
                }
            }
            arr[j+gap] = tmp;
        }
    }


    //选择排序
    public static void selectSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[i]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}

