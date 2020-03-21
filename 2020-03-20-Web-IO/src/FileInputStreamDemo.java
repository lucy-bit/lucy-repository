import java.io.*;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("用于读的文件.txt");
        //OutputStream os = new FileOutputStream("用于写的文件.txt");

        //is.read(); // 一次只读一个字节
                   // 什么时候就知道把所有的内容都读完了呢？
                   // End Of Stream: EOS

        /*
        int b;
        while ((b = is.read()) != -1) {     // 70, 105, 114, 115, 116, -1
            System.out.println(b);
        }
        */

        // IO 读取是非常慢的，所以进可能 减少IO次数

        byte[] buf = new byte[8192];
        int len;
        while ((len = is.read(buf)) != -1) {    // new byte[2] len = 2, 2, 1, -1
                                                // new byte[3] len = 3, 2, -1
            System.out.println("读一次");
            for (int i = 0; i < len; i++) {
                System.out.println(buf[i]);
            }
        }

        is.close();
    }
}
