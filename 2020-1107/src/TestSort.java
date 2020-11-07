import java.util.Arrays;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -11 -07
 * Time: 15:30
 */
public class TestSort {
    private static void shell(int[] arr,int gap) {
        for(int i = gap; i < arr.length; i++) {
            int tmp = arr[i];
            int j;
            for(j = i-gap; j >= 0; j -= gap) {
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
        int[] drr = {5,3,1};
        for(int i = 0; i < drr.length; i++) {
            shell(arr,drr[i]);
        }

    }

    public static void selectSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {

            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =tmp;
                }
            }
        }
    }

    //向下调整
    public static void adjustDown(int[] arr,int root,int len) {
        int parent = root;
        int child = 2*parent + 1;
        //有左孩子
        while(child < len) {
            //有右孩子并且右孩子比左孩子大
            if((child+1 < len) && arr[child] < arr[child+1]) {
                child++;//child存放的是左右孩子中较大的那个
            }
            if(arr[child] > arr[parent]) {
                int tmp = arr[child];
                arr[child] = arr[parent];
                arr[parent] =tmp;
                parent = child;//因为无法确定此树是否调整完毕
                child = 2*parent + 1;
            }else {
                break;//不再需要调整
            }
        }
    }
    //创建大根堆
    public static void createHeap(int[] arr) {
        for(int i = (arr.length-1-1)/2; i >= 0; i--) {
            adjustDown(arr,arr[i],arr.length);
        }
    }
    public static void heapSort(int[] arr) {
        //1.建立大根堆
        createHeap(arr);
        //2.待排序序列最后一个元素和堆顶元素交换,再向下调整
        int end = arr.length - 1;
        while(end > 0) {
            int tmp = arr[0];
            arr[0] = arr[end];
            arr[end] = tmp;
            adjustDown(arr,0,end);
            end--;
        }
    }

    //冒泡排序
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
                break;
            }
        }
    }

    //快排
    public static void swap(int[] arr,int a,int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
    public static int partition(int[] arr,int left,int right) {
        int i = left;
        int j = right;
        int pivot = arr[left];
        while (i < j) {
            while (i < j && arr[i] <= pivot) {
                i++;
            }
            while (i < j && arr[j] >= pivot) {
                j--;
            }

            swap(arr, i, j);
        }
        swap(arr, i, left);
        return i;

    }
    public static int partition2(int[] arr,int left,int right) {
        int tmp = arr[left];
        while(left < right) {
            while(left < right && arr[right] >= tmp) {
                right--;
            }
            arr[left] =arr[right];
            while(left < right && arr[left] <= tmp) {
                left++;
            }
            arr[right] =arr[left];
        }
        arr[left] = tmp;
        return left;
    }
    public static void quick(int[] arr,int start,int end) {
        if(start >= end) {
            return;
        }
        int pivot = partition(arr,start,end);
        quick(arr,start,pivot-1);
        quick(arr,pivot+1,end);
    }
    public static void quickSort(int[] arr) {
        quick(arr,0,arr.length-1);
    }

/*
    public static void quickSort(double[] array, int i, int j) {

        if (j <= i)

            return;

        int pivotIndext = (i + j) / 2;

        swap(array, pivotIndext, j);

        int k = partition(array, i - 1, j, array[j]);

        swap(array, j, k);

        quickSort(array, i, k - 1);

        quickSort(array, k, j);

    }

    public static int partition(double[] array, int left, int right, double pivot) {

        do {

            while (array[++left] < pivot)

                ;

            while ((left < right) & (pivot < array[--right]))

                ;

            swap(array, left, right);

        } while (left < right);

        return 0;

    }

    public static void swap(double[] data, int a, int b) {

        double t = data[a];

        data[a] = data[b];

        data[b] = t;

    }*/
    public static void main2(String[] args) {
        //测试有序序列
        int[] arr = new int[10_0000];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        //测试无序随机序列
        Random random = new Random();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10_0000);
        }

        long startTime = System.currentTimeMillis();
        //要测试的排序方法
        //heapSort(arr);
        quickSort(arr);

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {12,34,1,3,5,23,56,8,0,12,44,77,88,14,15};
        int[] arr2 = {6,1,2,7,9,8,4,5,10};
        quickSort(arr2);
        //shellSort(arr);
        System.out.println(Arrays.toString(arr2));
    }
}
