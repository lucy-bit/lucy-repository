package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class Controller {
    @FXML TextField en;
    @FXML Label cn;
    private DatagramSocket clientSocket;

    {
        try {
            clientSocket = new DatagramSocket();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML public void handleSubmit(ActionEvent event) {
        String request = en.getText();

        byte[] receiveBuffer = new byte[8192];

        // 这个 String 本身的一个方法，可以按照指定字符集，把字符串编码成字节数组
        try {
            byte[] requestBytes = request.getBytes("UTF-8");

            // 2. 发送请求
            // 2.1 先准备 DatagramPacket
            //     需要指定服务器的 ip + port
            //     创建 发送用的 Packet 的时候，需要提供两类信息
            //          1) 需要发送的数据信息   requestBytes + 0 + requestBytes.length
            //          2) 接收信息的唯一标识(ip + port)
            //              InetAddress.getByName("127.0.0.1") 会把 ip 地址转成 InetAddress 对象
            DatagramPacket packetToServer = new DatagramPacket(
                    requestBytes, 0, requestBytes.length,     // 要发送的数据
                    InetAddress.getByName("127.0.0.1"), 9527    // 要发送到互联网的哪个进程上
            );

            clientSocket.send(packetToServer);

            // 接收响应
            DatagramPacket packetFromServer = new DatagramPacket(
                    receiveBuffer, 0, receiveBuffer.length  // 提供的是用来装数据的容器信息
            );

            clientSocket.receive(packetFromServer);

            String response = new String(
                    receiveBuffer, 0, packetFromServer.getLength(), // 已经取到的数据
                    "UTF-8"
            );

            cn.setText(response);
        } catch (IOException e) {
            e.printStackTrace();;
        }
    }
}
