package socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -28
 * Time: 21:57
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //()里头分别是 要连接的IP地址，端口号
        Socket socket = new Socket("127.0.0.1",8080);
        // socket 已经建立好连接

        InputStream inputStream = socket.getInputStream();
        Scanner scanner = new Scanner(inputStream);

        OutputStream outputStream = socket.getOutputStream();
        Writer writer = new OutputStreamWriter(outputStream);
        PrintWriter printWriter = new PrintWriter(writer);

        printWriter.printf("你好，我是中国人\r\n");//向服务器发送消息
        printWriter.flush();// 只有进行了 flush 刷新操作，才能把数据真正写入

        String message = scanner.nextLine();        //向服务器读取信息
        System.out.println(message);

        socket.close();
    }
}
