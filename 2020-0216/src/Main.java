import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -02 -16
 * Time: 9:38
 */
public class Main {
    //递归写法
    public static void main(String[] args) {
        int array[] = {12,34,5,6,7,8,3,5,13};
        System.out.println(Arrays.toString(array));
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }


  /*  private static void mergeSort(int[] array) {
        mergeSortInternal(array,0,array.length-1);
    }
    //递归函数
    private static void mergeSortInternal(int[] array, int low, int high) {
        //递归结束的条件
        if(low >= high) {
            return;
        }
        int mid =(low + high)/2;
        //像二叉树，分散有序的
        mergeSortInternal(array,0,mid);
        mergeSortInternal(array,mid+1,high);
        //合并
        merge(array,low,mid,high);
    }

    private static void merge(int[] array, int low, int mid, int high) {
        int s1 = low;
        int s2 = mid + 1;
        int i = 0;
        int[] tmp = new int[high - low + 1];
        //当两个归并段内都有数据时
        while(s1 <= mid && s2 <= high) {
            //稳定，没有=就不稳定了
            if(array[s1] < array[s2]) {
                tmp[i++] = array[s1++];
            }else {
                tmp[i++] = array[s2++];
            }
        }
        //不写if而写成循环是因为可能不止一个数
        while(s1 <= mid) {
            tmp[i++] = array[s1++];
        }
        while(s2 <= high) {
            tmp[i++] = array[s2++];
        }
        //将tmp中存放的有效数据放回array中去
        for(int j = 0; j < tmp.length; j++) {
            array[low+j] = tmp[j];
        }
       }*/
  //再写一遍

    private static void mergeSort(int[] array) {
        //划分
        mergeSortInternal(array,0,array.length-1);
        //
    }
    //递归函数
    private static void mergeSortInternal(int[] array,int low,int high) {
        if(low >= high) {
            return;
        }
        int mid = low + (high - low)/2;
        mergeSortInternal(array,low,mid);
        mergeSortInternal(array,mid+1,high);
        //合并
        merge(array,low,mid,high);
    }

    private static void merge(int[] array, int low, int mid, int high) {
        int s1 = low;
        int s2 = mid + 1;
        int i = 0;
        int[] tmp = new int[high - low + 1];
        while(s1 <= mid && s2 <= high) {
            if(array[s1] < array[s2]) {
                tmp[i++] = array[s1++];
            }else {
                tmp[i++] = array[s2++];
            }
        }

        while(s1 <= mid) {
            tmp[i++] = array[s1++];
        }

        while(s2 <= high) {
            tmp[i++] = array[s2++];
        }

        for(int j = 0; j < tmp.length; j++) {
            array[j + low] = tmp[j];
        }
    }

}














