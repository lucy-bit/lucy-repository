import java.util.*;
/*
*
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -02 -19
 * Time: 11:26*/


public class TestDemo1 {
   /* public int singleNumber(int[] nums) {
        //1、首先我们选定用set（里面不能放重复的元素）
        Set<Integer> set = new HashSet<>();
        //2、遍历数组，如果集合set当中有该元素就删除
        for(int j = 0; j < nums.length; j++) {
            if(set.contains(nums[j]) == true) {
                set.remove(nums[j]);
            }else {
                set.add(nums[j]);
            }
        }
        //3、最后遍历集合，集合中剩下的元素就是哪个出现一次的数字
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
            return it.next();
        }
    }
*/
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"abc");
        map.put(10,"hello");
        map.put(12,"goh");map.get(10);
        //k不能重复，否则会覆盖原来的k

        //通过key值得到对应的value
        String s = map.get(10);
       /* System.out.println(s);
        System.out.println(map);
        for (Integer key : map.keySet()) {
            System.out.print(key);
        }*/
        for (Map.Entry<Integer,String> tmp : map.entrySet()) {
            System.out.print(tmp.getKey() + "=" + tmp.getValue() + " ");
        }

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        //迭代器->只要实现了iterable接口
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

}
