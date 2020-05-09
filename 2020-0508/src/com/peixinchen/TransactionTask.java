package com.peixinchen;

import java.net.Socket;

public class TransactionTask implements Runnable {
    private final Socket socket;

    public TransactionTask(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        // HTTP 1.0 协议，一条 TCP 连接中，只处理一组 HTTP 请求 - 响应

        try {
            // 1. 读取 TCP 连接中的输入
            // 2. 遵照 HTTP 请求的格式，解析输入
            // 3. 解析过程，可能读到错误格式的请求（直接不处理）
            // 4. 解析成功，封装成 HttpServletRequest 对象
            HttpServletRequest request = HttpServletRequest.readAndParse(socket.getInputStream());
            // 为了观察中间步骤 —— DEBUG
            System.out.println(request);

            // 5. 构建一个空的 HttpServletResponse 对象(进行了基本的初始化）
            //HttpServletResponse response = HttpServletResponse.build(socket.getOutputStream());

            // 6. 区分是静态资源还是动态资源

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
