import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class 中文读InputStreamDemo {
    public static void main(String[] args) throws IOException {
        try (InputStream is = new FileInputStream("中文输入utf8.txt")) {
            readContent(is, "UTF-8");
        }

        System.out.println("=========================");

        try (InputStream is = new FileInputStream("中文输入gb18030.txt")) {
            readContent(is, "GB18030");
        }
    }

    private static void readContent(InputStream is, String charset) throws IOException {
        byte[] buf = new byte[8192];
        int len;

        // 这里利用了一个特性，buf 可以一次性的把所有数据都都进来
        while ((len = is.read(buf)) != -1) {
            for (int i = 0; i < len; i++) {
                System.out.println(buf[i]);
            }

            String s = new String(buf, 0, len, charset);
            System.out.println(s);
        }
    }
}
