import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

import static java.sql.JDBCType.NULL;


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
    /*随机选择枢轴的位置，区间在low和high之间*/
    private static int selectPivotRandom(int arr[],int low,int high)
    {
        //产生枢轴的位置
        Random random = new Random();
        int pivot = random.nextInt(high-low) + low;
        //把枢轴位置的元素和low位置元素互换，此时可以和普通的快排一样调用划分函数
        swap(arr,pivot,low);
        return arr[low];
    }
    private static int selectPivotCommon(int[] arr,int low,int high) {
        return arr[low];
    }
    public static void swap(int[] arr,int a,int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;

    }
    private static int selectPivotMedianOfThree(int[] arr,int low,int high) {
        int mid = (high + low) >>> 1;
        //目标：arr[mid] < arr[left] < arr[high]
        if(arr[mid] > arr[high]) {
            swap(arr,mid,high);
        }//目标：arr[mid] < arr[high]
        if(arr[low] > arr[high]) {
            swap(arr,low,high);
        }//目标：arr[low] < arr[high]
        if(arr[low] > arr[mid]) {
            swap(arr,mid,low);
        }//目标：arr[low] < arr[mid]
        swap(arr,low,mid);
        return arr[low];
    }
    public static int partition(int[] arr,int left,int right) {
        int i = left;
        int j = right;
        //int pivot = selectPivotRandom(arr,i,j);
        int pivot = selectPivotCommon(arr,i,j);
        while (i < j) {
            while (i < j && arr[j] >= pivot) {
                j--;
            }
            while (i < j && arr[i] <= pivot) {
                i++;
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

    //采用非递归实现快排
    public static void quickNor(int[] arr,int start,int end) {
        int low = start;
        int high = end;
        //先划分
        int pivot = partition(arr,low,high);
        Stack<Integer> stack = new Stack<>();
        //左边至少两个元素
        if(pivot >low+1) {
            stack.push(low);
            stack.push(pivot-1);
        }
        //右边至少两个元素
        if(pivot < end-1) {
            stack.push(pivot+1);
            stack.push(high);
        }
        while(!stack.empty()) {
            //出栈的顺序不能反
            high = stack.pop();
            low = stack.pop();
            pivot = partition(arr,low,high);
            if(pivot >low+1) {
                stack.push(low);
                stack.push(pivot-1);
            }
            if(pivot < end-1) {
                stack.push(pivot+1);
                stack.push(high);
            }
        }
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
//归并排序
    //合并
    private static void merge(int[] arr,int low,int mid,int high) {
        int s1 = low;//表示第一个归并段的开始下标
        int s2 = mid+1;//表示第二个归并段的开始下标
        int len = high - low + 1;
        int[] tmp = new int[len];//每次的归并段合并之后的数组大小
        int i = 0;//是临时数组tmp的下标

        //两个归并段都是有数据的
        while(s1 <= mid && s2 <= high) {
            if(arr[s1] <= arr[s2]) {
                tmp[i++] = arr[s1++];
            }else {
                tmp[i++] = arr[s2++];
            }
        }
        while(s1 <= mid) {
            //能进这个循环说明第一个归并段还有数据的
            tmp[i++] = arr[s1++];
        }
        while(s2 <= high) {
            //能进这个循环说明第二个归并段还有数据的
            tmp[i++] = arr[s2++];
        }

        //把临时数组tmp里的值，拷贝到原数组当中
        for(int j = 0; j < len; j++) {
            arr[low+j] = tmp[j];
        }
    }
    //分解：递归过程，递归到序列区间内只有一个值算结束
    private static void mergeSortInternal(int[] arr,int low,int high) {
        //截至条件——区间内只有一个数据
        if(low >= high) {
            return;
        }
        int mid = (low+high) >>> 1;
        mergeSortInternal(arr,low,mid);
        mergeSortInternal(arr,mid+1,high);

        //合并
        merge(arr,low,mid,high);

    }
    public static void mergeSort(int[] arr) {
        //时间复杂度：O(n*logn)
        //空间复杂度：O(n)
        //稳定性：稳定的排序
        //先分解，再合并
        mergeSortInternal(arr,0,arr.length-1);
    }

    //归并排序的非递归版本
    private static void mergeNor(int[] arr,int gap) {
        int[] tmp = new int[arr.length];
        int i = 0;
        int s1 = 0;
        int e1 = s1 + gap - 1;
        int s2 = e1 + 1;
        int e2 = s2 + gap - 1 >= arr.length ? arr.length-1 : s2+gap-1;
        while(s2 < arr.length) {
            while(s1 <= e1 && s2 <= e2) {
                if(arr[s1] <= arr[s2]) {
                    tmp[i++] = arr[s1++];
                }else {
                    tmp[i++] = arr[s2++];
                }
            }
            while(s1  <= e1) {
                tmp[i++] = arr[s1++];
            }
            while(s2  <= e2) {
                tmp[i++] = arr[s2++];
            }
            //走下一段
            s1 = e2+1;
            e1 = s1+gap-1;
            s2 = e1+1;
            e2 = s2 + gap - 1 >= arr.length ? arr.length-1 : s2+gap-1;
        }
        //走到这里，说明s2已经没有了，不确定第一个归并段是否还有数据
        while(s1 < arr.length) {
            tmp[i++] = arr[s1++];
        }
        //将临时数组tmp内的值赋给arr
        for(int j = 0; j < tmp.length; j++) {
            arr[j] =tmp[j];
        }

    }
    public static void mergeSortNor(int[] arr) {
        for(int gap = 1; gap < arr.length; gap *= 2) {
            mergeNor(arr,gap);
        }

    }
    public static void main3(String[] args) {
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
        //quickSort(arr2);
        mergeSortNor(arr);
        //shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
