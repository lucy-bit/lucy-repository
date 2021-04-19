import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -04 -19
 * Time: 22:55
 */
public class Test {
    public static void main(String[] args) {
        //char 类型和 int 类型的转换
        char ch = '1';
        System.out.println(ch);
    }
    public static void main2(String[] args) {
        // 写一个字符串中重复字符的个数和对应字符
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            //String str = sc.nextLine();
            char[] arr = sc.nextLine().toCharArray();
            Map<Character,Integer> map = new HashMap<>();
            for(int i = 0; i < arr.length; i++) {
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
            //for(Map.Entry<Character,Integer> entry : map.entrySet())
            for(Map.Entry<Character,Integer> entry : map.entrySet()) {
                //System.out.println(entry.getKey() + " ：" + entry.getValue());
                System.out.println(entry.getKey());
            }

        }
    }
}
