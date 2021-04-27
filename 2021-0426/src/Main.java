/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -04 -26
 * Time: 0:21
 */
public class Main {
    public static void main(String[] args) {
        int ch = 97;
        char num = (char)ch;
        System.out.println(num );

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
    }
}
