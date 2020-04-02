import java.io.*;

public class 中文写PrintWriter {
    public static void main(String[] args) throws IOException {
        try (OutputStream os = new FileOutputStream("写入中文内容_utf8.txt")) {
            try (OutputStreamWriter osWriter = new OutputStreamWriter(os, "UTF-8")) {
                PrintWriter printWriter = new PrintWriter(osWriter);

                printWriter.println("日记：今天天气不错");
                printWriter.println("           2020-03-22");
                printWriter.println("我出去郊游了！");

                printWriter.flush();    // 千万不要忘记刷新缓冲区
            }
        }
    }
}
