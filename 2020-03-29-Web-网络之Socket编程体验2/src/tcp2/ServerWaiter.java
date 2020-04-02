package tcp2;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ServerWaiter extends Thread {
    private final Socket socket;

    ServerWaiter(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            System.out.println("======================================");
            System.out.println("有一个客户端连接上来了");
            InputStream is = socket.getInputStream();
            InputStreamReader isReader = new InputStreamReader(is, "UTF-8");
            Scanner scanner = new Scanner(isReader);
            // 没有 scanner，需要手动找 \r\n，麻烦的很

            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osWriter = new OutputStreamWriter(os, "UTF-8");
            PrintWriter printWriter = new PrintWriter(osWriter);

            // 一个连接可以发送多个请求
            // 服务器在这个循环中专心处理客户端1的事情
            // 不知道客户端2已经连接上来了
            // 直到客户端1关闭连接了（hasNextLine() 返回 false)
            // 服务器才能重新处理下一个客户端连接
            while (scanner.hasNextLine()) {
                String request = scanner.nextLine();    // 客户端1 没有发送数据，这个方法就不会返回
                System.out.println("++++++++++++++++++");
                System.out.println(request);

                // 处理请求 -> 响应
                String response = request;

                // 发送响应，也需要带着 \r\n
                printWriter.println(response);
                printWriter.flush();    // 千万不要忘掉

                System.out.println("++++++++++++++++++");
            }

            System.out.println("======================================");

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
