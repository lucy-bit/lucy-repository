package com.peixinchen;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    private static final int PORT = 8080;

    public static void main(String[] args) throws IOException {
        /**
         * TCP 服务器：
         * 1. 创建 Socket
         * 2. 绑定本地 ip + port
         * 3. 对 socket 进行 Listen
         * 4. 通过调用 accept 等待三次握手成功的客户端
         */

        /**
         * 通过使用线程池的方式，支持客户端并发处理
         * TODO: NIO 的方式支持并发
         */
        ExecutorService pool = Executors.newFixedThreadPool(8);

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            while (true) {
                Socket socket = serverSocket.accept();
                pool.execute(new TransactionTask(socket));
            }
        }
    }
}
