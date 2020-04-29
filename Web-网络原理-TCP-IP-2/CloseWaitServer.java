import java.util.*;
import java.io.*;
import java.net.*;


public class CloseWaitServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8099);
        while (true) {
            Socket socket = serverSocket.accept();

            // 没有关闭 socket，就直接循环下一次了
            socket.close();
        }
    }
}