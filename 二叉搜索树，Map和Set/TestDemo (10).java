import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2020-02-19
 * Time: 11:26
 */

/**
 * MAP:底层是一个哈希表-》key可能是不一样的，但是v可能一样
 * key是不能够重复的->key 的值可以为null
 * Set:
 * key是不能够重复的->key 的值可以为null
 */
public class TestDemo {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        System.out.println(set);

        //迭代器->只要实现了iterable接口
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


    public static void main1(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"abc");
        map.put(10,"hello");
        map.put(null,"goh");
        String s = map.get(10);
        s = map.getOrDefault(40,"hhhhh");
        System.out.println(map);
        System.out.println(s);

        String s1 = map.remove(10);
        System.out.println(s1);
        System.out.println(map);

        Set<Integer> set = map.keySet();
        System.out.println(set);

        Collection<String>collection =  map.values();
        System.out.println(collection);
        System.out.println("===============");
        //Set<Map.Entry<K, V>>  -> Map.Entry<K, V>
        //int[] array               int
        for ( Map.Entry<Integer, String> entrySet  :   map.entrySet()) {
            System.out.println(entrySet.getKey()+" "+entrySet.getValue());
        }

    }

}
