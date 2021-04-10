import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -04 -10
 * Time: 19:53
 */
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = new int[arr1.length];
        System.arraycopy(arr1,0,arr2,0,arr1.length);
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = Arrays.copyOf(arr1,arr1.length);
        System.out.println(Arrays.toString(arr3));
        int[] arr4 = arr1.clone();

    }
}
