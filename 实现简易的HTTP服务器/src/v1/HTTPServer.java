package v1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -28
 * Time: 23:17
 */
public class HTTPServer {
    //没有使用线程池时
   /* public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        while(true) {
            Socket socket = serverSocket.accept();
            //引入RequestResponseTask实现多线程
            Runnable task = new RequestResponseTask(socket);
            new Thread(task).start();
        }
    }*/

    //线程池版本
    public static void main(String[] args) throws IOException {
        ExecutorService threadPool = Executors.newFixedThreadPool(10);//为了方便起见，调用Excutors下面的现成的线程池，规定大小为10
        ServerSocket serverSocket = new ServerSocket(8080);
        while (true) {
            Socket socket = serverSocket.accept();
            //引入RequestResponseTask实现多线程
            Runnable task = new RequestResponseTask(socket);
            threadPool.execute(task);
        }
    }
}
