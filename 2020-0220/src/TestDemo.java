import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -02 -20
 * Time: 14:53
 */
public class TestDemo {
    //TopK问题（找最大）：建立小堆（或大堆），将k个元素放到堆里面去，然后用堆顶元素和其余元素一一比较，如果
    //堆顶元素小于其他元素，poll——add（包含了调整过程）
    //注意点：在建立堆的时候，可以用调整器控制大小堆
    public static Integer[] findKNum(int[] array,int k) {
        //1、建立大小为k的小堆（找最大）
        PriorityQueue<Integer> minHeap = new PriorityQueue<>
                (k, new Comparator<Integer>() {
          //调整器，可以控制大小堆
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);//小堆
            }
        });
        for(int i = 0; i < array.length; i ++) {
            if(minHeap.size() < k) {
                minHeap.add(array[i]);
            }else {
                Integer top = minHeap.peek();
                if(top != null && top > array[i])
                /*if(minHeap.peek() != null && minHeap.peek().compareTo(array[i]) > 0)*/{
                    minHeap.poll();
                    minHeap.add(array[i]);
                }
            }
        }
        Integer[] ret = new Integer[k];
        for(int i = 0; i < k; i++) {
            ret[i] = minHeap.poll();
        }

        return ret;
    }

    //找出前k个高频单词
    //思路：与TopK问题相似——使用小堆。
    //将单词和出现次数对应到Map中，然后在堆中放入k个元素，拿堆顶元素和其余元素进行比较
    //难点：1、在单词出现次数相同时，按照单词首字母的先后顺序。
    //      2、ArrayList的add方法默认是尾插法，这样出来的结果与题目要求不符，所以我们需要用头插法进行调整，但是
    //      在频率相同时，堆本身已经调整为升序，所以单词首字母顺序应调整为由后向前
    public List<String> topKFrequent(String[] words, int k) {
        List<String> list = new ArrayList<>();

        //1、遍历words数组，将每个单词和出现的次数一一对应到Map中去
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0; i < words.length; i++) {
            if(!map.containsKey(words[i])) {
                map.put(words[i],1);
            }else {
                map.put(words[i],map.get(words[i])+1);
            }
        }
        //在堆中加入k个元素,并用堆顶元素进行比较
        PriorityQueue<Map.Entry<String,Integer>> minHeap = new PriorityQueue<>(k, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                //当单词一样时，看字母顺序
                if(o1.getValue().equals(o2.getValue())) {
                    return o2.getKey().compareTo(o1.getKey());
                }else {
                    //当单词不一样时
                    return o1.getValue().compareTo(o2.getValue());
                }

            }
        });
        for (Map.Entry<String,Integer> tmp : map.entrySet()) {
            if(minHeap.size() < k) {
                //放元素
                minHeap.add(tmp);
            }else {
                //比较
                Map.Entry<String,Integer> top = minHeap.peek();
                if(top != null && top.getValue().compareTo(tmp.getValue()) < 0) {
                    minHeap.poll();
                    minHeap.add(tmp);
                }else {
                    //出现频率相同
                    if(top != null && top.getValue().equals(tmp.getValue())) {
                        if(top.getKey().compareTo(tmp.getKey()) > 0) {
                            minHeap.poll();
                            minHeap.add(tmp);
                        }

                    }
                }
            }
        }
        System.out.println(minHeap);
        for(int i = 0; i < k; i++) {
            Map.Entry<String,Integer> top = minHeap.peek();
            list.add(0,top.getKey());
            minHeap.poll();
        }
        return list;
    }

    public static void main(String[] args) {

    }
    public static void main2(String[] args) {
        int[] array = {13,54,7,8,82,32};
        Integer[] ret = findKNum(array,4);
        System.out.println(Arrays.toString(ret));

    }
}
