import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {
    public static void main(String[] args) throws IOException {
        try (InputStream is = new FileInputStream("输入文件.txt")) {
            byte[] buf = new byte[8192];
            int len;

            while ((len = is.read(buf)) != -1) {
                // 有效数据是 buf[0, len)
                for (int i = 0; i < len; i++) {
                    // 如果直接按照数字打印出来，就是打印 ASCII
                    // System.out.println(buf[i]);
                    char c = (char)buf[i];
                    System.out.print(c);
                }
            }
        }
    }
}
