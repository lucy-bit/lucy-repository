import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class 中文写OutputStream {
    public static void main(String[] args) throws IOException {
        String s = "陈沛鑫";

        try (OutputStream os = new FileOutputStream("输出内容utf8.txt")) {
            writeContent(os, s, "UTF-8");
        }

        try (OutputStream os = new FileOutputStream("输出内容gb18030.txt")) {
            writeContent(os, s, "GB18030");
        }
    }

    private static void writeContent(OutputStream os, String s, String charset) throws IOException {
        byte[] bytes = s.getBytes(charset);
        System.out.println(charset);
        System.out.println(bytes.length);

        os.write(bytes);
        os.flush();
    }
}
