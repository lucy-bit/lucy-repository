package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -28
 * Time: 21:57
 */
public class Server {
    public static void main(String[] args) throws IOException {
        // 作为 TCP 的被动连接方，需要监听一个固定的端口（选择 8080）
        // 端口是随意选择的，只要该端口目前没有被占用

        // 下面的语句完成后，TCP 端口就完成了 LISTEN
        ServerSocket serverSocket = new ServerSocket(8080);

        // 每循环一次，完成一次 请求-响应周期
        // 服务端进行持续的服务提供
        while(true) {
            // 三次握手发生在 accept 的调用过程中
            // 我们通过 socket 向 OS 要已经建立的 TCP 连接
            // 1. 目前有已经建立好的连接，OS 立即返回
            // 2. 否则，会一直等，直到有 client 过来建立好连接
            Socket socket = serverSocket.accept();

            // socket 代表已经建立好的一条 TCP 连接（三次握手结束了）
            System.out.println("有一条 TCP 连接已建立");

            // socket 关联的 TCP 连接已经建立（ESTABLISHED）
            // 我们作为应用层，正常的进行数据通信即可,我们也只能看到这一阶段

            // 我们可以通过 inputStream，读取 client 发送过来的应用层数据
            InputStream inputStream = socket.getInputStream();
            Scanner scanner = new Scanner(inputStream,"UTF-8");
            String line = scanner.nextLine();   //先读取客户端发来的消息
            System.out.println(line);

            // 我们可以通过将数据写入 outputStream，(其实也就是将数据写给了OS的TCP协议栈，TCP再会根据可靠性等流量控制方法慢慢发送给客户端）
            // 经过OS内部的TCP机制，将数据发送给 client——实现一个服务器的进程可以和客户端的进程通信的目的
            OutputStream outputStream = socket.getOutputStream();
            Writer writer = new OutputStreamWriter(outputStream,"UTF-8");
            PrintWriter printWriter = new PrintWriter(writer);
            printWriter.printf("今天项目好难啊\r\n");
            printWriter.flush();// 只有进行了 flush 刷新操作，才能把数据真正写入

            // 触发这个 socket 关联的 TCP 连接的四次挥手
            socket.close();
            //四次挥手结束

        }
    }
}
