package com.nannan.tomcat;

import com.nannan.standard.Servlet;
import com.nannan.standard.http.HttpServletRequest;
import com.nannan.standard.http.HttpServletResponse;

import java.net.Socket;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -30
 * Time: 18:36
 */
public class RequestResponseTask implements Runnable{
    private Socket socket;
    public RequestResponseTask(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        // 1. 解析并得到请求对象
        HttpServletRequest request = null;
        // 2. 实例化一个响应对象
        HttpServletResponse response = null;
        // 2. 实例化一个响应对象
       /* Context context = null;
        // 4. 根据 request.getServletPath() 找到 Context 中的哪个 HttpServlet 进行
        Servlet servlet = null;
        // 5. 调用 servlet.service(request, response)，交给业务处理
        servlet.service(request,response);
        //System.out.println(response);
        // 6. 根据 response 对象中的数据，发送 HTTP 响应
        sendResponse(response);*/
    }
}
