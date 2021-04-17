import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -04 -17
 * Time: 10:52
 */
public class Main {
    public static void main(String[] args) {
        //找最长重复子串
        String str = "abbbbbbccccc";
       /* char[] arr = str.toCharArray();
        //思路: 从前往后遍历字符数组，先定义一个最大值 max，遍历过程中找出每个子重复字符串的长度，如果比 max 大——更新,同时将下标也更新
        int max = 0;
        int count = 1;
        int max_Left = 0;
        int left = 0;
        int i = 0;
        while(i < arr.length-1) {
            left = i;
            int j = 0;
            for(j = i; j < arr.length-1; j++) {
                if(arr[j] == arr[j+1]) {
                    count++;
                }else {
                    if(max < count) {
                        max = count;
                        i += count;
                        count = 1;
                        max_Left = left;
                        break;
                    }else {
                        i+= count;
                        break;
                    }
                }
            }
            if(j == arr.length-1) {
                if(max < count) {
                    max = count;
                    i += count;
                    count = 1;
                    max_Left = left;
                    break;
                }else {
                    i+= count;
                    break;
                }
            }

        }*/
        //System.out.println(str.substring(max_Left,max_Left+max));


        // map法
        char[] arr = str.toCharArray();
        Map<String,Integer> map = new HashMap<>();
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == )
        }
    }
}
