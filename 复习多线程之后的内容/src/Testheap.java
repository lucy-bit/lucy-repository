/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -22
 * Time: 23:49
 */
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