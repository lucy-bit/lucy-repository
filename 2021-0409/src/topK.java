import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -04 -09
 * Time: 23:22
 */
public class topK {
    public  void main(String[] args) {
        int[] arrRandom = new int[10_00000];
        Random random = new Random();
        for(int i = 0; i < arrRandom.length; i++) {
            arrRandom[i] = random.nextInt(10_00000);
        }
    }
    public void TopK(int[] arr, int k) {
        // 求前K个最小的数——大根堆
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k);
        TopKComparator topKComparator = new TopKComparator();
        for(int i = 0; i < k; i++) {
            maxHeap.offer(arr[i]);
        }
        for(int i = k; i < arr.length; i++) {
            if(arr[i] < maxHeap.peek()) {
                maxHeap.poll();
                maxHeap.offer(arr[i]);
            }
        }


    }
    class TopKComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1,Integer o2) {
            return o2 - o1;
        }
    }
}
