import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -04 -19
 * Time: 22:45
 */
public class Main {
    public static void main(String[] args) {
        //练习set
        Set<Integer> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        int[] int_arr = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            int_arr[i] = Integer.valueOf(arr[i]);
            set.add(int_arr[i]);
        }
        System.out.println(set);
    }
    public static void main2(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //test1
       /* int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        char[] ch_arr = sc.nextLine().toCharArray();
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.valueOf(ch_arr[i]);
        }*/
       /* for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            //System.out.println(arr[i]);
        }*/
        //System.out.println(Arrays.toString(arr));
        //查找最长重复字符串 aabbbcccc
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
           // String str = sc.nextLine();
            char[] arr = sc.nextLine().toCharArray();
            Map<Character,Integer> map = new HashMap<>();
            for(int i = 0; i < arr.length; i++) {
                map.put(arr[i],map.getOrDefault(arr[i],0) + 1);
            }
            int max = 0;
            char ch = arr[0];
            for(Map.Entry<Character,Integer> entry : map.entrySet()) {
                if(entry.getValue() > max) {
                    max = entry.getValue();
                    ch = entry.getKey();
                }
            }
            StringBuffer sb = new StringBuffer();
            while(max > 0) {
                sb.append(ch);
                max--;
            }
            System.out.println(sb);
        }

    }
}
