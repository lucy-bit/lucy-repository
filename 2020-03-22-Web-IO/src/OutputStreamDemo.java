import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDemo {
    public static void main(String[] args) throws IOException {
        try (OutputStream os = new FileOutputStream("输出内容.txt")) {
            // 一次写一个字节的方式
            // Second
            /*
            os.write('S');
            os.write('e');
            os.write('c');
            os.write('o');
            os.write('n');
            os.write('d');
            os.write('\r');
            os.write('\n');
            */

            /*
            byte[] buf = new byte[1024];
            buf[0] = (byte)'T';
            buf[1] = (byte)'h';
            buf[2] = (byte)'i';
            buf[3] = (byte)'r';
            buf[4] = (byte)'d';
            buf[5] = (byte)'\r';
            buf[6] = (byte)'\n';
            os.write(buf, 0, 7);
            */

            String s = "Hello World\r\n";
            byte[] bytes = s.getBytes();
            os.write(bytes);

            // 输出流为了减少 IO 的次数，有可能进行了数据缓冲（不是马上写入硬盘，而是写在内存中）
            os.flush(); // 保证把所有缓冲的数据全部写入硬盘中
            // 调用 os.close() 一般都会在其内部调用 os.flush();
        }
    }
}
