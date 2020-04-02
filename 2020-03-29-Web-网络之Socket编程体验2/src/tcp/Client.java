package tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        // 1. 创建 socket
        // 2. 绑定本地 ip + 本地 port（OS 分配）
        // 3. 连接远端 ip + 远端 port（127.0.0.1:9527)
        // 面向连接
        try (Socket socket = new Socket("127.0.0.1", 9527)) {
            /*
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osWriter = new OutputStreamWriter(os, "UTF-8");
            PrintWriter printWriter = new PrintWriter(osWriter);

            printWriter.print("|发送一个请求|");
            printWriter.flush();
            */

            // 裸用 OutputStream
            /*
            OutputStream os = socket.getOutputStream();
            String[] requests = {"你好", "世界", "中国"};
            for (String request : requests) {
                request = String.format("%d: |%s|: %d", 1, request, 100);
                byte[] requestBytes = request.getBytes("UTF-8");
                os.write(requestBytes, 0, requestBytes.length);
                os.flush();
            }
            */

            /*
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osWriter = new OutputStreamWriter(os, "UTF-8");
            PrintWriter printWriter = new PrintWriter(osWriter);

            String[] requests = {"你好", "世界", "中国"};
            for (String request : requests) {
                printWriter.printf("%d: |%s|: %d", 1, request, 100);
                printWriter.flush();
            }
            */
        }
    }
}
