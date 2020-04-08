package tcp;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        try (Socket socket = new Socket("127.0.0.1", 9527)) {
            // 建立连接，剩下的循环，全部在一个连接中完成

            Scanner netScanner = new Scanner(new InputStreamReader(socket.getInputStream(), "UTF-8"));
            PrintWriter netWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"));

            while (true) {
                String request = scanner.nextLine();

                netWriter.println(request);
                netWriter.flush();

                String response = netScanner.nextLine();

                System.out.println(response);
            }
        }
    }
}
