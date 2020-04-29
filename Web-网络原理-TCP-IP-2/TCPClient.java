import java.util.*;
import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        System.out.println("我是主动方: 开始三次握手");
        Socket socket = new Socket("45.40.254.164", 80);
        System.out.println("我是主动方: 三次握手成功");
        
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}