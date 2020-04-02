package tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// 有连接的
public class Server {
    public static void main(String[] args) throws IOException {
        // 1. 创建 TCP 的 Server Socket
        //    1. 创建(create) socket
        //    2. 绑定(bind)   socket <-> 本地 ip + 本地 port
        //    3. 监听(listen) socket 等待客户端过来连接
        try (ServerSocket serverSocket = new ServerSocket(9527)) {
            while (true) {
                // 不断的接待客户
                // 和 UDP 不同，不是以请求为单位接待，而是以连接(Connection) (client <-> server)
                try (Socket connectionSocket = serverSocket.accept()) {

                    // TCP 是面向字节流的
                    InputStream is = connectionSocket.getInputStream();
                    //OutputStream os = connectionSocket.getOutputStream();

                    // IO 流中的字节流
                    // is 可以读取 client 发送过来的数据
                    // os 可以把写给 client 的数据发送过去

                    // TCP 字节流的特性
                    // 把字节流封装成字符流
                    InputStreamReader isReader = new InputStreamReader(is, "UTF-8");
                    //OutputStreamWriter osWriter = new OutputStreamWriter(os, "UTF-8");

                    // 封装成 Scanner 和 PrintWriter 方便读写
                    //Scanner isScanner = new Scanner(isReader);
                    //PrintWriter osPrintWriter = new PrintWriter(osWriter);

                    // 一个连接中只会发送一个请求

                    int offset = 0;
                    int capacity = 8192;
                    char[] receiveBuffer = new char[capacity];  // 假设请求肯定不会这么长
                    int len;
                    while (true) {
                        len = isReader.read(receiveBuffer, offset, capacity - offset);
                        if (len == -1) {
                            break;
                        }

                        offset += len;
                    }
                    len = offset;

                    /*
                    char[] receiveBuffer = new char[8192];
                    int len = isReader.read(receiveBuffer);
                    System.out.println(isReader.read());    // 一定打印 -1
                    */

                    String request = new String(receiveBuffer, 0, len);
                    System.out.println("%" + request + "%");
                }
            }
        }
    }
}
