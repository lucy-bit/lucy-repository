import java.io.*;
import java.util.Scanner;

public class 推荐大家使用 {
    // 图片、视频、MySQL的数据
    private static void 如果读取的是二进制数据() throws IOException {
        try (InputStream is = new FileInputStream("某张图片.jpg")) {
            byte[] buf = new byte[8192];
            int len;

            while ((len = is.read(buf)) != -1) {
                // 使用读到的数据 buf[0, len)
            }
        }
    }

    // 图片、视频、MySQL的数据
    private static void 如果写的是二进制数据() throws IOException {
        try (OutputStream os = new FileOutputStream("某张图片.jpg")) {
            byte[] buf = new byte[1024];    // 根据业务场景得到的数据
            for (int i = 0; i < 5; i++) {
                // 如果需要多次写
                int start = 5;
                int len = 10;
                os.write(buf, start, len);
            }

            os.flush();
        }
    }

    // 读的是文本(无论是否是中文、还是英文、还是其他文本
    private static void 如果读取的是字符数据() throws IOException {
        try (InputStream is = new FileInputStream("某篇文章.txt")) {
            try (InputStreamReader isReader = new InputStreamReader(is, "UTF-8")) {
                try (Scanner scanner = new Scanner(isReader)) {
                    // 我想要按行读
                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                    }
                }
            }
        }
    }

    // 写的文本
    private static void 如果写的是字符数据() throws IOException {
        try (OutputStream os = new FileOutputStream("某篇文章.txt")) {
            try (OutputStreamWriter osWriter = new OutputStreamWriter(os, "UTF-8")) {
                try (PrintWriter printWriter = new PrintWriter(osWriter)) {
                    printWriter.println("");
                    printWriter.printf("");
                    printWriter.print("");
                    printWriter.format("");

                    printWriter.flush();
                }
            }
        }
    }
}
