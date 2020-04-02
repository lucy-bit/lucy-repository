package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

// 重构第一步：通过命令行读取用户输入作为请求发送
// 重构第二步：读取服务器发回的响应
public class Client {
    // 这里使用 127.0.0.1 代表本机
    private static final String serverIP = "127.0.0.1";
    //private static final String serverIP = "49.233.172.121";

    public static void main(String[] args) throws IOException {
        // 创建 UDP Socket 的
        // 不需要传入端口，让 OS 自动分配一个
        try (DatagramSocket clientSocket = new DatagramSocket()) {
            Scanner scanner = new Scanner(System.in);

            // 这个buffer（缓冲区 —— 数据池子）用来放一会准备接收的数据
            byte[] receiveBuffer = new byte[8192];

            System.out.print("请输入请求> ");
            while (scanner.hasNextLine()) {
                // 1. 准备好请求，同时，传输的必须是字符格式
                String request = scanner.nextLine();

                // 这个 String 本身的一个方法，可以按照指定字符集，把字符串编码成字节数组
                byte[] requestBytes = request.getBytes(Server.CHARSET);

                // 2. 发送请求
                // 2.1 先准备 DatagramPacket
                //     需要指定服务器的 ip + port
                //     创建 发送用的 Packet 的时候，需要提供两类信息
                //          1) 需要发送的数据信息   requestBytes + 0 + requestBytes.length
                //          2) 接收信息的唯一标识(ip + port)
                //              InetAddress.getByName("127.0.0.1") 会把 ip 地址转成 InetAddress 对象
                DatagramPacket packetToServer = new DatagramPacket(
                        requestBytes, 0, requestBytes.length,     // 要发送的数据
                        InetAddress.getByName(serverIP), Server.PORT    // 要发送到互联网的哪个进程上
                );

                clientSocket.send(packetToServer);

                // 接收响应
                DatagramPacket packetFromServer = new DatagramPacket(
                        receiveBuffer, 0, receiveBuffer.length  // 提供的是用来装数据的容器信息
                );

                clientSocket.receive(packetFromServer);

                String response = new String(
                        receiveBuffer, 0, packetFromServer.getLength(), // 已经取到的数据
                        Server.CHARSET
                );
                System.out.println("服务器应答: " + response);

                System.out.print("请输入请求> ");
            }
        }
    }
}
