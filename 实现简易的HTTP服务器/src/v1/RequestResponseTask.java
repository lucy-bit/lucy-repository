package v1;

import java.io.*;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -29
 * Time: 0:01
 */
public class RequestResponseTask implements Runnable {
    private final Socket socket;
    public RequestResponseTask(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            System.out.println("一条TCP连接已经建立");
            //暂时不读取/解析请求

            //直接写回响应
            OutputStream outputStream = socket.getOutputStream();
            Writer writer = new OutputStreamWriter(outputStream, "UTF-8");//其实真正的 HTTP 服务器不是以UTF-8编码的，这里为了简单起见
            PrintWriter printWriter = new PrintWriter(writer);

            Thread.sleep(2_000);
            //写响应，因为需要精确的控制换行符，所以用printf
            //写响应行
            printWriter.printf("HTTP/1.0 200 OK\r\n");
            //写响应头
            printWriter.printf("Content-Type: text/html; charset=utf-8\r\n");//文本类型是text，并且是utf-8编码的
            //写入空行，代表响应头结束
            printWriter.printf("\r\n");
            //写响应体，html内容
            printWriter.printf("<h1>正常工作了</h1>");
            //刷新，把数据写入 TCP 发送缓冲区
            printWriter.flush();
        }catch (IOException | InterruptedException e){
            //InterruptedException——当线程因为wait、sleep等方法进入阻塞时抛出该异常
            // 因为单次的请求响应周期错误，不应该影响其他请求响应周期
            // 所以，我们只做打印，不终止进程
            e.printStackTrace(System.out);
        }finally {
            try{
                socket.close();
                System.out.println("一条TCP连接已经释放");
            } catch (IOException e) {
                e.printStackTrace(System.out);
            }
        }
    }
}
