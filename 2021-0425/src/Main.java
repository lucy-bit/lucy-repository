import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -04 -25
 * Time: 12:38
 */
public class Main {
    public static void main(String[] args) {
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

//看运行时间
//currentTimeMillis，获取当前时间的毫秒数
        long startTime = System.currentTimeMillis();
//要测试的排序方法
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int count = 0;
        int[][] arr = new int[W][H];
        //一种方法：遍历所有盒子，若距该盒子的上下左右2距离长的任意盒子里有蛋糕，该格子不能放蛋糕
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < W; j++) {

                if(!containsCake(arr,i,j)) {
                    arr[i][j] = 1;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    private static boolean containsCake(int[][] arr, int i, int j) {
        if(i-2 >= 0 && arr[i-2][j] == 1){
            return true;
        }
        if(i+2 < arr[i].length && arr[i+2][j] == 1) {
            return true;
        }
        if(j-2 >= 0 && arr[i][j-2] == 1){
            return true;
        }
        if(j+2 < arr.length && arr[i][j+2] == 1) {
            return true;
        }
        return false;
    }
}

//时间复杂度为 O(log2n)
public class TestHeap {
    public int[] elem;
    public int usedSize;
    public TestHeap() {
        this.elem = new int[10];
        this.usedSize = 0;
    }
    //向下调整
    public void adjustDown(int root,int len) {
        int parent = root;
        int child = 2*parent + 1;
        while(child < len) {
            //此时是有左孩子的
            if((child+1) < len && this.elem[child] < this.elem[child+1]) {
                //有右孩子并且右孩子比左孩子大
                child++;//child存放的是左右孩子中较大的那个
            }
            if(this.elem[child] > this.elem[parent]) {
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                parent = child;//因为无法确定此树是否调整完毕
                child = 2*parent+1;
            }else {
                break;//不需要进行调整
            }
        }
    }
    public void createHeap(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            this.elem[i] = arr[i];
            this.usedSize++;
        }

        //调整为大根堆
        for(int i = (this.usedSize-1-1)/2; i >= 0; i--) {
            adjustDown(i,this.usedSize);
        }
    }

}