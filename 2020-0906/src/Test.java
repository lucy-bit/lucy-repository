import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -09 -06
 * Time: 21:47
 */
public class Test {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            System.out.println("num = " + num);

        }catch(Exception e) {
            e.printStackTrace();
        }
    }
   /* public static void main2(String[] args) {
        int[] arr = {1,2,3};
        try {
            System.out.println("before");
            int num = arr[100];
            System.out.println("after");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally code");
        }
    }*/
}
