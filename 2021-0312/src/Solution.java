/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -12
 * Time: 0:25
 */
import java.util.*;

class TopKComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1,Integer o2) {
        return o2-o1;
    }
}
public class Solution {

    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        //找最小的K个数——建立大根堆——利用优先级队列，重写里面的compare方法

        ArrayList<Integer> arrayList = new ArrayList<>();
        if(input == null || k<=0 || input.length < k) {
            return arrayList;
        }
        TopKComparator topkComparator = new TopKComparator();
        PriorityQueue<Integer> pq = new PriorityQueue(k,topkComparator);
        for(int i = 0; i < input.length; i++) {
            if(pq.size() < k) {
                pq.offer(input[i]);
            }else {
                int val = pq.peek();
                if(val > input[i]) {
                    pq.poll();
                    pq.offer(input[i]);
                }
            }
        }
        while(!pq.isEmpty()) {
            arrayList.add(pq.poll());
        }
        return arrayList;
    }

   /* public static void main(String[] args) {
        int[] arr = {4,5,1,6,2,7,3,8};
        ArrayList<Integer> al = GetLeastNumbers_Solution(arr,4);
        System.out.println(al);
    }*/
}