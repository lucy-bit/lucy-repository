import java.util.PriorityQueue;

class TopKComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
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
public class TestDemo {
    //练习自定义类型的比较方式
    public static Integer[] findKNum(Integer[] array,int k) {
        //TOPK问题
        //建立一个堆，这个堆的大小为K，且传入一个比较器，从小到大进行比较
        //求前K个最小的元素
        TopKComparator topKComparator = new TopKComparator();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k,topKComparator);
        for(int i = 0; i < array.length; i++) {
            if(minHeap.size() < k) {
                minHeap.offer(array[i]);
            }else {
                //堆里已经放了K个元素
                Integer val = minHeap.peek();
                //堆顶元素和 数组中的元素进行比较
                //如果堆顶元素da，堆顶元素先出堆，然后把数组中的元素放入堆当中
                if(val != null && val > array[i]) {
                    minHeap.poll();
                    minHeap.offer(array[i]);
                }
            }
        }
        Integer[] ret = new Integer[k];
        for(int i = 0; i < k; i++) {
            ret[i] = minHeap.poll();
        }
        return ret;
    }
}