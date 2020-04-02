package tcp2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

// 一个连接中有多个请求
// 长连接 + 根据 \r\n 来分割请求和响应
public class Server {
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(8192)) {
            while (true) {
                Socket socket = serverSocket.accept();   // 等待有客户端连接上来 - 主线程处理
                // 下面的工作，交给另一个线程处理
                ServerWaiter waiter = new ServerWaiter(socket);
                waiter.start();
            }
        }
    }
}
