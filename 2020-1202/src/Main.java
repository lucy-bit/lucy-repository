/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -12 -02
 * Time: 17:13
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            //求阶乘,递归
            int n = sc.nextInt();
            int result = factorial(n);
            int count = 0;
            while(result%10 == 0) {
                count++;
                result /= 10;
            }
            System.out.println(count);
        }
    }
    public static int factorial(int n) {
        //1.递归
        if(n == 1) {
            return 1;
        }
        return factorial(n)*factorial(n-1);
    }
}