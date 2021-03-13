/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -13
 * Time: 23:45
 */
//直接插入排序：每次和前面的数据从后往前比较，找合适位置插入
//时间复杂度：最坏情况下为O(n^2),最好情况下为O(n)（有序）
//空间复杂度：O(1)
//稳定性：稳定的
//特点：数据越有序，用直接插入排序越快
public static void insertSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
        int tmp = arr[i];
        int j;
        for(j = i-1; j >= 0; j--) {
        //if里的判断条件有等号的不稳定，去掉等号是稳定的-》看作是稳定的
        if(arr[j] > tmp) {
        arr[j+1] = arr[j];
        }else {
        //前面已经有序
        break;
        }
        }
        arr[j+1] = tmp;
        }
        }
        优化：折半插入排序——前面的区间已经有序，可以使用二分查找来找
//未排序元素在排序序列中寻找合适位置时，若在此过程中能应用二分查找，速度会大大提高
public static void binarySearchInsertSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
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
        }
        }

//希尔排序（分组思想）
//时间复杂度：最坏情况下为O(n^2),最好情况下为O(n)
//空间复杂度：O(1)
//稳定性：不稳定的（有跳跃式交换）
public void shell(int[] arr,int gap) {

        for(int i = gap; i<arr.length; i++) {
        int tmp = arr[i];
        int j;
        for( j = i-gap; j >= 0; j -= gap) {
        if(arr[j] > tmp) {
        arr[j+gap] = arr[j];
        }else {
        break;
        }
        }
        arr[j+gap] = tmp;
        }
        }
public void shellSort(int[] arr) {
        int[] drr = {5,3,1};
        for(int i = 0; i < drr.length;i++) {
        shell(arr,drr[i]);
        }
        }



        选择排序：
        思想：用 i 从前往后遍历序列，每次找到 i 后边的无序序列里最小的值与 i 进行交换，直到遍历完成。
        每次从待排序数字的后面选取一个比当前数字小的数据进行交换，直到当前序列遍历完成。
        用 i 来遍历序列，每一趟排序用 i 位置的元素和后面的无序序列元素依此比较大小，将较小的换		到 i 位置，一趟排序过程后，无序序列中最小的元素换到 i 位置处。
//选择排序
//时间复杂度：O(n^2) 不分好坏
//空间复杂度：O(1)
//稳定性：不稳定的（有跳跃式交换）
public void selectSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
        for(int j = i+1; j < arr.length; j++) {
        if(arr[j] < arr[i]) {
        int tmp =arr[i];
        arr[i] =arr[j];
        arr[j] = tmp;
        }
        }
        }
        }

//堆排序
//时间复杂度：O(nlogn) 创建大根堆的时间复杂度是O(n),向下调整的时间复杂度是O(logn)
//空间复杂度：O(1)
//稳定性：不稳定的（有跳跃式交换）

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