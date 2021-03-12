import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -12
 * Time: 0:59
 */
public class Sort {

    //堆排序（排升序）
    public static void heapSort(int[] arr) {
        //建立大根堆
        createHeap(arr);
        //将堆顶元素和树的最后一个元素进行交换
        //树的长度-1
        //调整这棵树
        //重复上述三个步骤，直到遍历完全
        int end = arr.length-1;
        while(end >= 0) {
            int tmp = arr[0];
            arr[0] = arr[end];
            arr[end] = tmp;
            end--;
            adjustDown(arr,0,end);
        }
    }
    public static void createHeap(int[] arr) {
        for(int i = (arr.length-1-1)/2; i >= 0; i--) {

            adjustDown(arr,i,arr.length);
        }
    }
    public static void adjustDown(int[] arr,int root,int len) {
        int parent = root;
        int child = 2*root +1;
        while(child < len) {
            if((child+1) < len && arr[child] < arr[child+1]) {
                child++;
            }
            if(arr[child] > arr[parent]) {
                int tmp = arr[child];
                arr[child] = arr[parent];
                arr[parent] = tmp;
            }else {
                break;
            }
        }
    }

    //冒泡排序
    //排升序
    public static void bubbleSort(int[] arr) {
        boolean flag = false;
        for(int i = 0; i < arr.length; i++) {
            flag = false;
            for(int j = 0; j < arr.length-1-i; j++) {
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
    private static void swap(int[] arr,int i ,int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    //快速排序
    public static void quickSort(int[] arr) {
        quick(arr,0,arr.length-1);
    }
    public static void quick(int[] arr,int left,int right) {
        if(right <= left) {
            return;
        }
        //找基准——三数取中法
        int pivotIndex = selectPivot(arr,left,right);
        //partition
        partition(arr,pivotIndex,left,right);
        //对基准两边的序列继续进行上述两步操作
        quick(arr,left,pivotIndex-1);
        quick(arr,pivotIndex+1,right);
    }
    public static void partition(int[] arr, int pivotIndex, int left, int right) {
        int pivot = arr[pivotIndex];
        while(right > left) {
            while(right > left) {
                if(arr[right] >= pivot) {
                    right--;
                }else {
                    break;
                }
            }
            while(left < right) {
                if(arr[left] <= pivot) {
                    left++;
                }else {
                    break;
                }
            }
            swap(arr,left,right);
            right--;
            left++;
        }
    }
    public static int selectPivot(int[] arr,int left,int right) {
        //按顺序找
        return left;

    }
    public  static void main(String[] args) {
        int[] arr = {5,6,7,3,1,4,9,0};
        quickSort(arr);
        //bubbleSort(arr);
        //heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
