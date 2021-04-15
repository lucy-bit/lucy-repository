/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -04 -15
 * Time: 15:23
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        testException(arr);
    }

    private static void testException(int[] arr) {
        try{
            System.out.println(arr[4]);
        }catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("数组越界");
        }finally {
            return;
        }
    }
}
