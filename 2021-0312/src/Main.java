/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -12
 * Time: 17:17
 */
import javax.xml.soap.Node;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr);
        for(int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void quickSort(int[] arr) {
        quick(arr,0,arr.length-1);

    }
    public static void quick(int[] arr,int left,int right) {
        if(right <= left) {
            return;
        }
        //1.找基准
        int pivot = selectPivot(arr,left,right);
        //2.partition将序列分隔开
        int pivotIndex =  partition(arr,pivot,left,right);
        //3.对基准两边的序列重复上述操作
        quick(arr,left,pivotIndex-1);
        quick(arr,pivotIndex+1,right);
    }
    public static int selectPivot(int[] arr, int left,int right) {
        //return left;
        //随机选取
       /* Random random = new Random();
        int pivotIndex = random.nextInt(right-left)+left;
        swap(arr,pivotIndex,left);*/

       //三数取中法
        int mid = (left + right)/2;
        if(arr[left] > arr[right]) {
            swap(arr,left,right);
        }
        if(arr[mid] > arr[left]) {
            swap(arr,left,mid);
        }
        if(arr[mid] > arr[right]) {
            swap(arr,right,mid);
        }
        return arr[left];
    }
    public static int partition(int[] arr,int pivot,int left,int right) {

        //基准右边小的话停下来
        //基准左边大的话停下来，交换，实现挖坑法交换
        while(right > left) {
           /* while(left < right) {
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
            swap(arr,left,right);*/
           while(right > left && arr[right] >= pivot) {
               right--;
           }
            arr[left] = arr[right];
           while(right > left && arr[left] <= pivot) {
               left++;
           }
           arr[right] = arr[left];
        }
        arr[left] = pivot;
        return left;
    }
    public static void swap(int[] arr,int left,int right) {
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }




    //再写一遍删除关键字为key的结点
    public void remove(int key) {
        Node cur = root;
        Node parent = null;
        //找到要删除的结点
        while(cur != null) {
            parent = cur;
            if(cur.data == key) {
                //找到了，删除该节点
                removeNode(parent,cur);
            }else if(cur.data < key){
                cur = cur.right;
            }else {
                cur = cur.left;
            }
        }
    }
    public void removeNode(Node parent,Node cur) {
        //分为三种情况
        if(cur.left == null) {
            //又分为三种情况
            if(cur == root) {
                root = cur.right;
            }else if(cur == parent.left) {
                parent.left = cur.right;
            }else {
                parent.right = cur.right;
            }
        }else if(cur.right == null) {
            //同上面方法类似
            if(cur == root) {
                root = cur.left;
            }else if(cur == parent.left) {
                parent.left = cur.left;
            }else {
                parent.right = cur.left;
            }
        }else {
            //cur.left != null && cur.right != null的情况
            Node target = cur.left;
            Node targetParent = cur;
            //以找左边最大值为例
            while(target.right != null) {
                targetParent = target;
                target = target.right;
            }
            //找到了target，且target.right == null
            //替换
            cur.data = target.data;
            //删除target
            if(target == targetParent.left) {
                targetParent.left = target.left;
            }else {
                targetParent.right = target.left;
            }
        }
    }
}