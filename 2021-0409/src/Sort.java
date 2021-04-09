import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -04 -09
 * Time: 19:29
 */
public class Sort {
    public static void main(String[] args) {
        int[] arr = {1,2,435,6,34,7,8,95,3};
        insertSort(arr);
        //binaryInsertSort(arr);
        //bubbleSort(arr);
        //selectSort(arr);
        //heapSort(arr);
        //quickSort(arr);
        System.out.println(Arrays.toString(arr));
        //System.out.println("折半插入排序: " + Arrays.toString(arr));

        int[] arrRandom = new int[10_00000];
        Random random = new Random();
        for(int i = 0; i < arrRandom.length; i++) {
            arrRandom[i] = random.nextInt(10_00000);
        }
        long startTime = System.currentTimeMillis();
        insertSort(arrRandom);
        //binaryInsertSort(arrRandom);
        //bubbleSort(arrRandom);
        //selectSort(arrRandom);
        //heapSort(arrRandom);
        //quickSort(arrRandom);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
    //直接插入排序
   /* public static void insertSort(int[] arr,int left,int right) {
        for(int i = 1+left; i <= right; i++) {
            int tmp = arr[i];
            int j = 0;
            for(j = i-1; j > left; j--) {
                if(tmp < arr[j]) {
                    arr[j+1] = arr[j];
                }else {
                    break;
                }
            }
            arr[j+1] = tmp;
        }
    }*/

   public static void insertSort(int[] arr) {
       for(int i = 1; i < arr.length; i++) {
           int tmp = arr[i];
           int j = 0;
           for(j = i-1; j >= 0; j--) {
               if(tmp < arr[j]) {
                   arr[j+1] = arr[j];
               }else {
                   break;
               }
           }
           arr[j+1] = tmp;
       }
   }
    //优化后的折半插入排序
    public static void binaryInsertSort(int[] arr) {
        /*for(int i = 1; i < arr.length; i++) {
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
        }*/


        /*for(int i = 1; i < arr.length; i++) {
            int left = 0;
            int right = i;
            int tmp = arr[i];
            while(left < right) {
                //int mid = left + (right - left) >> 1;
                int mid = (left+right)/2;
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

        }*/

        for(int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            int left = 0;
            int right = i;
            while(left < right) {
                int mid = left + (right-left)/2;
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
                break;//说明一趟比较完没有发生交换，序列已经有序，无需再往下比较
            }
        }

      /*  boolean flag = true;
        for(int i = 0; i < arr.length-1; i++) {
           flag = true;
            for(int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    swap(arr,j,j+1);
                    flag = false;
                }
            }
            if(flag) {
                break;
            }
        }*/
    }

    private static void swap(int[] arr, int j, int i) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    //选择排序
    public static void selectSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[i]) {
                    swap(arr,i,j);
                }
            }
        }
    }

    /*//堆排序
    public static void heapSort(int[] arr) {
        //排升序建大根堆，排降序建小根堆
        //1. 建立大根堆
        createHeap(arr);
        // 2. 从树的最后一个节点往前走，每次将 root 和最后一个节点交换，然后树的长度-1
        int len = arr.length - 1;
        while(len > 0) {
            swap(arr,0,len);
            adjustDown(arr,0,len);
            len--;
        }
    }

    private static void createHeap(int[] arr) {
        for(int i = (arr.length-1-1)/2; i >= 0; i--) {
            adjustDown(arr,i,arr.length-1);
        }
    }

    private static void adjustDown(int[] arr, int root,int len) {
        int parent = root;
        int child = 2*parent + 1;
        while(child < len) {
            //有左子树
            if((child+1) < len && arr[child+1] > arr[child]) {
                //有右子树并且让 child 指向较大的子树
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
    }*/

/*    //向下调整
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
            adjustDown(arr,i,arr.length);
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
    }*/

//再写一遍堆排序(降序）
   /* public static void heapSort(int[] arr) {
        //排降序建小根堆
        *//*PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for(Integer data : arr) {
            priorityQueue.add(data);
        }*//*
        createSmallHeap(arr);
        int len = arr.length - 1;

    }

    private static void createSmallHeap(int[] arr) {
        for(int i = arr.length-2; i >= 0; i--) {
            adjustUp(arr,i,arr.length-1);
        }
    }

    private static void adjustUp(int[] arr, int child, int len) {
        int parent = (child-1)/2;
        while(child > 0) {

        }
    }*/

    public static void heapSort(int[] arr) {
        createHeap(arr);

        int len = arr.length - 1;
        while(len > 0) {
            swap(arr,0,len);
            adjustDown(arr,0,len);
            len--;
        }
    }

    private static void createHeap(int[] arr) {
        for(int i = (arr.length-2)/2; i >= 0; i--) {
            adjustDown(arr,i,arr.length-1);
        }
    }

    private static void adjustDown(int[] arr, int root, int len) {
        int parent = root;
        int child = 2*parent + 1;
        while(child < len) {
            if((child+1) < len && arr[child+1] > arr[child]) {
                child++;
            }
            if(arr[child] > arr[parent]) {
                swap(arr, child, parent);
                parent = child;
                child = 2 * parent + 1;
            }else {
                break;
            }
        }
    }

   //快排
    public static void quickSort(int[] arr) {
        quick(arr,0,arr.length-1);
    }
    public static void quick(int[] arr,int left,int right) {
        if(left >= right) {
            return;
        }
        /*if((right-left+1) < 100) {
            insertSort(arr,left,right);
            return;
        }*/
        // 1. 将基准数据放在 left 下标处
        selectPivot(arr,left,right);
        // 2. partition 方法，将序列分为两部分
        int pivot = partition(arr,left,right);
        // 3. 对两部分递归上述步骤
        quick(arr,left,pivot-1);
        quick(arr,pivot+1,right);
    }

    private static int partition(int[] arr,int left,int right) {
        int tmp = arr[left];

        //挖坑法
        while(left < right) {
            //先从后找
            while((left < right) && (arr[right] >= tmp)) {
                right--;
            }
            arr[left] = arr[right];
            while((left < right) && (arr[left] <= tmp)){
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = tmp;
        return left;
    }

    private static void selectPivot(int[] arr,int left, int right) {
        // 1. 简单版本——不操作，直接让left处的值做基准
        // 2. 随机数做基准
       /* Random random = new Random();
        int index = random.nextInt(right-left) + left;
        swap(arr,index,left);*/

       // 3. 三数取中法
        //mid < left < right
        int mid = left + (right-left)/2;
        if(arr[mid] > arr[right]) {
            swap(arr,mid,right);
        }
        if(arr[left] < arr[mid]) {
            swap(arr,left,mid);
        }
        if(arr[left] > arr[right]) {
            swap(arr,left,right);
        }
    }

//时间复杂度：O(n*logn) 总共递归n次，每次递归相当于一个二叉树，时间复杂度为树的高度
    //也就是logn,也相当于是一次二分查找，两者乘在一起即为时间复杂度)
//时间复杂度也可以这样理解：每做一次partition，时间复杂度是O(n),一共有多少层，看二叉树的高度，二叉树高度一般是log(n),最坏情况下是O(n)
//空间复杂度：logn 左树开辟的内存可为右树所用，所以求左树的空间复杂度就好，左树下
    //又有子树，空间复杂度为树的深度
//空间复杂度最坏情况下是O（n）
//稳定性：不稳定


/*    //挖坑法：
    public static int partition(int[] arr,int left,int right) {
        //确定基准
        int tmp = arr[left];
        while(left < right) {
            //在后面找比tmp小的数
            //因为可能right会一直--导致数组越界问题，所以每一次都要判断left < right
            while(left < right && arr[right] >= tmp) {
                right--;
            }
            arr[left] = arr[right];
            //在前面找比tmp大的数
            while(left < right && arr[left] <= tmp) {
                left++;
            }
            arr[right] = arr[left];
        }
        //相遇之后
        arr[left] = tmp;
        return left;
    }
    public static void quick(int[] arr,int left,int right) {
        if(right <= left) {
            return;
        }
        //确定基准并根据基准将序列分为两部分
        int pivot = partition(arr,left,right);
        //对基准左边序列进行排序
        quick(arr,left,pivot-1);
        //对基准右边序列进行排序
        quick(arr,pivot+1,right);
    }
    //快速排序
    public static void quickSort(int[] arr) {
        quick(arr,0,arr.length-1);
    }*/

 /*   public static void quickSort(int[] arr) {
        quick(arr,0,arr.length-1);
    }

    private static void quick(int[] arr, int left, int right) {
        if(left >= right) {
            return;
        }
        selectPivot(arr,left,right);
        int pivot = partition(arr,left,right);
        quick(arr,left,pivot-1);
        quick(arr,pivot+1,right);
    }
    private static void selectPivot(int[] arr, int left, int right) {
    }
    private static int partition(int[] arr,int left,int right) {
        int tmp = arr[left];
        while(left < right) {
            while((left < right) && (arr[right] >= tmp)) {
                right--;
            }
            arr[left] = arr[right];
            while((left < right) && (arr[left] <= tmp)) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = tmp;
        return left;
    }*/
}
