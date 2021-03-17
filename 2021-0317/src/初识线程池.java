import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -17
 * Time: 12:02
 */
public class 初识线程池 {
    public static void main(String[] args) {
        // ExecutorService pool = new ThreadPoolExecutor()
        String str1 = new String("Hello").intern();
        String str2 = "Hello";
        System.out.println(str1 == str2);

    }
}
