package tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public static void main(String[] args) throws IOException {
        // 因为线程只有 10 个
        // 同时能处理的连接，也就只有 10 个
        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        try (ServerSocket serverSocket = new ServerSocket(9527)) {
            while (true) {
                Socket socket = serverSocket.accept();
                // socket 代表就是一个建立好的连接

                // 每次过了一个连接，就创建一个线程
                //Thread thread = new Worker(socket);
                //thread.start();

                // 线程池（Thread Pool） 好处： 不需要每次都创建线程，销毁线程
                // 正式员工/临时工/队列多长
                threadPool.execute(new Worker(socket));
            }
        }
    }
}
