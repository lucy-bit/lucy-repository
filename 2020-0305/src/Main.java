/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -03 -05
 * Time: 13:54
 */
import java.util.*;

public class Main {
    private static int getCount(int n) {
        if(n == 2) {
            return 1;
        }
        if(n < 2) {
            return 0;
        }
        int count = n / 3;
        int count2 = getCount(count + n % 3);
        return count + count2;
    }
    public static void main(String[] args) {
        //空瓶问题——采用递归思想
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int i = 0;
        while(sc.nextInt() != 0) {
            array[i] = sc.nextInt();
            i++;
        }
        for(int j = 0; j < array.length; j++) {
            System.out.println(getCount(array[j]));
        }


    }
}