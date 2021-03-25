import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -25
 * Time: 23:45
 */
class TopKComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
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
