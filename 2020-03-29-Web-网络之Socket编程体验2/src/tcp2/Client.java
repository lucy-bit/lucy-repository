package tcp2;

import java.io.*;
import java.net.Socket;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Scanner stdinScanner = new Scanner(System.in);

        try (Socket socket = new Socket("127.0.0.1", 8192)) {
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osWriter = new OutputStreamWriter(os, "UTF-8");
            PrintWriter printWriter = new PrintWriter(osWriter);

            InputStream is = socket.getInputStream();
            InputStreamReader isReader = new InputStreamReader(is, "UTF-8");
            Scanner scanner = new Scanner(isReader);

            //List<String> requestList = Arrays.asList("今天吃了么", "今天好冷啊", "今天好热啊", "回家吃去吧");
            //for (String request : requestList) {
            System.out.print("请输入请求> ");
            while (stdinScanner.hasNextLine()) {
                String request = stdinScanner.nextLine();

                printWriter.println(request);
                System.out.println("客户端请求 ->: " + request);
                printWriter.flush();

                String response = scanner.nextLine();
                System.out.println("<- 服务器应答: " + response);

                System.out.print("请输入请求> ");
            }
        }
    }
}
