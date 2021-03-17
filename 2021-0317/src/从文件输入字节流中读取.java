import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -17
 * Time: 17:42
 */
public class 从文件输入字节流中读取 {
    public static void main(String[] args) throws IOException {
        try(InputStream is = new FileInputStream("楠楠.txt")) {
            byte[] buffer = new byte[1024];
            int len = is.read(buffer);
            for(int i = 0; i < len; i++) {
                System.out.println((char)buffer[i]);
            }
        }
    }
}
