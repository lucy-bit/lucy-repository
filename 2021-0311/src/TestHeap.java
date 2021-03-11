/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -11
 * Time: 22:31
 */
//建立大根堆
public class TestHeap {

    public int[] elem;
    public int usedSize;
    public TestHeap() {
        this.elem = new int[10];
        this.usedSize = 0;
    }
    public void adjustHeap(int root,int len) {
        //如果有左右子树，从中选出较大的
        int parent = root;
        int child = (root+1)/2;//左树坐标
        while(child < len) {
            if((child+1)<len && elem[child] < elem[child+1]) {
                child++;
            }
            if(elem[child] > elem[parent]) {
                int tmp = this.elem[parent];
                this.elem[parent] = this.elem[child];
                this.elem[child] = tmp;
                parent = child;
                child = (parent+1)/2;
            }else {
                break;
            }
        }
    }

    public void createHeap(int[] arr) {
        //思路：从最后一棵树开始向下调整，逐步调整为大根堆
        for(int i = 0; i < arr.length; i++) {
            this.elem[i] = arr[i];
            this.usedSize++;
        }

        //调整为大根堆
       for(int i = (this.usedSize-1-1)/2; i > 0; i--) {
            adjustHeap(i,this.usedSize);
       }

    }

    //向上调整
    public void adjustUp(int child) {
        int parent = (child-1)/2;
        while(child > 0) {
            if(elem[child] > elem[parent]) {
                child = parent;
                parent = (child-1)/2;
            }else {
                break;
            }
        }
    }


}
