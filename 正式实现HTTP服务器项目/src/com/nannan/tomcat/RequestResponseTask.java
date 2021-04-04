package com.nannan.tomcat;

import com.nannan.standard.Servlet;
import com.nannan.standard.http.Cookie;
import com.nannan.tomcat.http.HttpRequestParser;
import com.nannan.tomcat.http.Request;
import com.nannan.tomcat.http.Response;

import java.io.*;
import java.net.Socket;
import java.util.Map;

public class RequestResponseTask implements Runnable {
    //直接定义一个饿汉模式 单例，往里面传数据
    //我们以后只会用到这一个对象
    // 调用HttpRequestParser.parse 可以对请求进行解析
    private static final HttpRequestParser parser = new HttpRequestParser();

    private final Socket socket;

    public RequestResponseTask(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            // 1. 解析并得到请求对象
            Request request = parser.parse(socket.getInputStream()); //请求信息
            System.out.println(request);

            // 2. 实例化一个响应对象
            Response response = new Response();

            // 3. 根据 request.getContextPath() 找到哪个 Context 进行处理
            Context handleContext = HttpServer.defaultContext;
            for (Context context : HttpServer.contextList) {
                if (context.getName().equals(request.getContextPath())) {
                    handleContext = context;
                    break;
                }
            }
            // 4. 根据 request.getServletPath() 找到 Context 中的哪个 HttpServlet 进行处理
            Servlet servlet = handleContext.get(request.getServletPath());
            if (servlet == null) {
                servlet = HttpServer.defaultServlet;
            }
            // 5. 调用 servlet.service(request, response)，交给业务处理
            servlet.service(request, response);

            // 6. 根据 response 对象中的数据，发送 HTTP 响应
            sendResponse(socket.getOutputStream(), request, response);

            socket.close();
        } catch (Exception exc) {
            exc.printStackTrace(System.out);
        }
    }

    private void sendResponse(OutputStream outputStream, Request request, Response response) throws IOException {
        // 保存 session
        // 1. 种 cookie
        // 2. 保存成文件

        if (request.session != null) {
            Cookie cookie = new Cookie("session-id", request.session.sessionId);
            response.addCookie(cookie);
            request.session.saveSessionData();
        }

        Writer writer = new OutputStreamWriter(outputStream, "UTF-8");
        PrintWriter printWriter = new PrintWriter(writer);

        //HTTP 允许有多个同名的响应头，所以把cookie传进去
        for (Cookie cookie : response.cookieList) {
            response.setHeader("Set-Cookie", String.format("%s=%s", cookie.getName(), cookie.getValue()));
        }

        printWriter.printf("HTTP/1.0 %d\r\n", response.status);
        for (Map.Entry<String, String> entry : response.headers.entrySet()) {
            String name = entry.getKey();
            String value = entry.getValue();

            printWriter.printf("%s: %s\r\n", name, value);
        }
        printWriter.printf("\r\n");
        response.bodyPrintWriter.flush();
        response.bodyOutputStream.flush();
        printWriter.flush();

        byte[] bytes = response.bodyOutputStream.toByteArray();
        outputStream.write(bytes);
        outputStream.flush();
    }
}
