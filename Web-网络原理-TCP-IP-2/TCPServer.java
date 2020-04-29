import java.util.*;
import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8099);
        while (true) {
            Socket socket = serverSocket.accept();

            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();

            socket.close();
        }
    }
}