import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -04 -04
 * Time: 23:54
 */
//找出前k个高频单词
//思路：与TopK问题相似——使用小堆。
//将单词和出现次数对应到Map中，然后在堆中放入k个元素，拿堆顶元素和其余元素进行比较
//难点：
//1、在单词出现次数相同时，按照单词首字母的先后顺序。
//2、ArrayList的add方法默认是尾插法，这样出来的结果与题目要求不符
//所以我们需要用头插法进行调整，但在频率相同时，堆本身已经调整为升序
//所以单词首字母顺序应调整为由后向前
class Solution {
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
            String top = minHeap.peek().getKey();
            list.add(0,top);
            minHeap.poll();
        }
        return list;
    }
}