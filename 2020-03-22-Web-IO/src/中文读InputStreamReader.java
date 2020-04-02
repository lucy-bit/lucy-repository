import java.io.*;
import java.util.Scanner;

public class 中文读InputStreamReader {
    public static void main(String[] args) throws IOException {
        try (InputStream is = new FileInputStream("中文输入utf8.txt")) {
            try (InputStreamReader isReader = new InputStreamReader(is, "UTF-8")) {

                /*
                int ch;
                while ((ch = isReader.read()) != -1) {
                    char c = (char) ch;
                    System.out.println(c);
                }
                */

                /*
                char[] buf = new char[1024];
                int len;
                while ((len = isReader.read(buf)) != -1) {
                    for (int i = 0; i < len; i++) {
                        System.out.println(buf[i]);
                    }
                }
                */

                // 希望大家能掌握这一种方式即可
                Scanner scanner = new Scanner(isReader);
                while (scanner.hasNextLine()) {
                    System.out.println(scanner.nextLine());
                }
            }
        }
    }
}
