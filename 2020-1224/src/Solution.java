import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -12 -24
 * Time: 20:38
 */
/*
public class Solution {
    public double Power(double base, int exponent) {
        //若底数为0
        if(base == 0) {
            return 0;
        }
        double result = base;
        //指数分大于0、小于0、等于0三种情况
        if(exponent > 0) {
            for(int i = 1; i < exponent; i++) {
                result *= base;
            }
        }else if(exponent < 0) {
            for(int i = -1; i > exponent; i--) {
                result *= base;
            }
            result = 1/result;
        }else {
            result = 0;
        }
        return result;
    }
}*/



/*
public class Solution {
    private static void swap(int[] arr,int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public void reOrderArray(int [] array) {
        //i和j从前往后走，当遇到奇数时，i++；遇到偶数，j++
        int left = 0;
        int right = array.length-1;
        while(left < right) {
            while((array[left] % 2) != 0) {
                left++;
            }
            while((array[right] % 2) == 0) {
                right--;
            }
            swap(array,left,right);
        }

    }
}*/
/*
public class Solution {
    public static void reOrderArray(int [] array) {
        String str = "";
        for(int i = 0; i < array.length; i++) {
            if(array[i]%2 != 0) {
                System.out.print(array[i] + " ");
            }else {
                str += array[i];
                str += " ";
            }
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        reOrderArray(array);
    }
}
*/


public class Solution {
    public void reOrderArray(int [] array) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                q2.offer(array[i]);
            }else {
                q1.offer(array[i]);
            }
        }
        int i = 0;
        while(!q1.isEmpty()) {
            array[i++] = q1.poll();
        }
        while(!q2.isEmpty()) {
            array[i++] = q2.poll();
        }
        for(i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i != array.length-1) {
                System.out.print(" ");
            }
        }
    }
}

