import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -10 -24
 * Time: 19:00
 */
public class TestHeap {
    public int[] elem;
    public int usedSize;
    public TestHeap() {
        this.elem = new int[10];
        this.usedSize = 0;
    }
    //调整函数
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
                parent = child;
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

    public void adjustUp(int child) {
        int parent = (child-1)/2;
        while(child > 0) {
            if(this.elem[child] > this.elem[parent]) {
                int tmp = this.elem[parent];
                this.elem[parent] = this.elem[child];
                this.elem[child] = tmp;
                child = parent;
                parent = (child-1)/2;
            }else {
                break;
            }
        }
    }
    private boolean isFull() {
        return this.usedSize == this.elem.length;
    }

    public void push(int val) {
        if(isFull()) {
            //扩容
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        this.elem[this.usedSize] = val;
        this.usedSize++;
        adjustUp(this.usedSize-1);
    }


    private boolean isEmpty() {
        return this.usedSize == 0;
    }
    public void pop() {
        if(isEmpty()) {
            throw new RuntimeException("堆为空");
        }
        this.elem[0] = this.elem[this.usedSize-1];
        this.usedSize--;
        adjustDown(0,this.usedSize);
    }

    //堆排序
    public void heapSort() {
        int end = this.usedSize-1;
        while(end > 0) {
            int tmp = this.elem[0];
            this.elem[0] = this.elem[end];
            this.elem[end] = tmp;
            adjustDown(0,end);
            end--;
        }
    }
}
