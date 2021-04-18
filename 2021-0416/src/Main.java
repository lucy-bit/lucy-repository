import java.util.Arrays;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -04 -16
 * Time: 23:15
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,44,2,5,77,8,2,65,7,3};
        //insertSort(arr);
        //binaryInsertSort(arr);
        //bubbleSort(arr);
        //selectSort(arr);
        heapSort(arr);
        //quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void heapSort(int[] arr) {
        createHeap(arr);
        int end = arr.length - 1;
        while(end > 0) {
            swap(arr,0,end);
            adjustDown(arr,0,end);
            end--;
        }
    }

    private static void createHeap(int[] arr) {
        for(int i = (arr.length-1)/2; i >= 0; i--) {
            adjustDown(arr,i,arr.length-1);
        }
    }

    private static void adjustDown(int[] arr, int root, int len) {
        int parent = root;
        int child = 2*parent + 1;
        while(child < len) {
            if((child+1) < len && arr[child] < arr[child+1]) {
                child++;
            }
            if(arr[child] > arr[parent]) {
                swap(arr,parent,child);
                parent = child;
                child = 2*parent + 1;
            }else {
                break;
            }
        }
    }

/*
    private static void heapSort(int[] arr) {
        createHeap(arr);
        int end = arr.length-1;
        while(end > 0) {
            swap(arr,0,end);
            adjustDown(arr,0,end);
            end--;
        }
    }

    private static void adjustDown(int[] arr, int root, int len) {
        int parent = root;
        int child = 2*parent + 1;
        while(child < len) {
            if((child+1) < len && arr[child+1] > arr[child]) {
                child++;
            }
            if(arr[parent] < arr[child]) {
                swap(arr,parent,child);
                parent = child;
                child = 2*parent + 1;
            }else {
                break;
            }
        }
    }

    private static void createHeap(int[] arr) {
        for(int i = (arr.length-1)/2; i >= 0; i--) {
            adjustDown(arr,i,arr.length-1);
        }
    }
*/

    private static void quickSort(int[] arr) {
        quick(arr,0,arr.length-1);
    }

    private static void quick(int[] arr, int left, int right) {
        if(left >= right) {
            return;
        }
        // 1. 选择基准——将基准放在 left 位置
        selectPivot(arr,left,right);
        // 2. partition函数，将序列分为两部分
        int pivot = partition(arr,left,right);
        // 3. 对基准两边的部分递归调用1、2步骤
        quick(arr,left,pivot-1);
        quick(arr,pivot+1,right);
    }

    private static int partition(int[] arr, int left, int right) {
        int tmp = arr[left];
        while(left < right) {
            while(left < right && arr[right] >= tmp) {
                right--;
            }
            arr[left] = arr[right];
            while(left < right && arr[left] <= tmp) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = tmp;
        return left;
    }

    private static void selectPivot(int[] arr,int left,int right) {
        // 1. 最简单的方法——不做处理，直接取 arr[left] 做基准
        //return;
        // 2. 随机数做基准
       /* Random random = new Random();
        int pivot = random.nextInt(right-left) + left;
        swap(arr,pivot,left);
        return;*/
       // 3. 三数取中法
        int mid = left + (right-left)/2;
        // arr[mid] < arr[left] < arr[right]

    }

   /* private static void heapSort(int[] arr) {
        //排升序建大堆
        createHeap(arr);
        int len = arr.length - 1;
        while(len > 0) {
            swap(arr,0,len);
            adjustDown(arr,0,len);
            len--;
        }
    }

    private static void createHeap(int[] arr) {
        for(int i = (arr.length-1)/2; i >= 0; i--) {
            adjustDown(arr, i, arr.length - 1);
        }
    }

    private static void adjustDown(int[] arr, int root, int len) {
        int parent = root;
        int child = (2*parent + 1);
        while(child < len) {
            if((child+1) < len && arr[child+1] > arr[child]) {
                child++;
            }
            if(arr[child] > arr[parent]) {
                swap(arr,child,parent);
                parent = child;
                child = 2*parent + 1;
            }else {
                break;
            }

        }
    }*/



    private static void selectSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    swap(arr,i,j);
                }
            }
        }
    }

    private static void binaryInsertSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int left = 0;
            int right = i;
            int tmp = arr[i];
            while(left < right) {
                int mid = left + (right-left)/2;
                if(arr[mid] > tmp) {
                    right = mid;
                }else {
                    left = mid + 1;
                }
            }
            for(int j = i; j > left; j--) {
                arr[j] = arr[j-1];
            }
            arr[left] = tmp;
        }
    }

    private static void bubbleSort(int[] arr) {
        boolean flag = false;
        for(int i = 0; i < arr.length; i++) {
            flag = false;
            for(int j = i+1; j < arr.length-1-i; j++) {
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

    private static void insertSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j = 0;
            for(j = i-1; j >= 0; j--) {
                if(arr[j] > tmp) {
                    arr[j+1] = arr[j];
                }else {
                    arr[j+1] = tmp;
                    break;
                }
            }
        }
    }

    /*private static void insertSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j = 0;
            for(j = i-1; j >=0 ; j--) {
                if(arr[j] > tmp) {
                    arr[j+1] = arr[j];
                }else {
                    arr[j+1] = tmp;
                    break;
                }
            }

        }
    }*/


    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
