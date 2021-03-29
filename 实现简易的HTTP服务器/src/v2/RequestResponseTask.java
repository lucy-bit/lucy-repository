package v2;

import java.io.*;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -29
 * Time: 0:01
 */
public class RequestResponseTask implements Runnable {
    private static final String DOC_BASE = "C:\\Users\\86187\\Java\\实现简易的HTTP服务器\\docBase";
    private final Socket socket;
    public RequestResponseTask(Socket socket) {
        this.socket = socket;
    }

    //Key——suffix,  Value——Content-Type
    private static final Map<String,String> mimeTypeMap = new HashMap<>();
    static {
        mimeTypeMap.put("txt","text/plain");
        mimeTypeMap.put("html","text/html");
        mimeTypeMap.put("js","application/javascript");
        mimeTypeMap.put("jpg","image/jpg");
    }

    @Override
    public void run() {
        try {
            System.out.println("一条TCP连接已经建立");

            //进行 HTTP 请求解析——解析出路径（为了简单，暂时不考虑 查询字符串 部分
            InputStream inputStream = socket.getInputStream();
            Scanner scanner = new Scanner(inputStream,"UTF-8");
            scanner.next();// 读取出来的是方法，暂时不用，不保存
            String path = scanner.next();//请求行中的url
            System.out.println(path);

            // 通过类似这样的处理，使得 / => /index.html 同样的效果
            if(path.equals("/")) {
                // welcome-file
                path = "/index.html";
            }

            String filePath = DOC_BASE + path;  // 用户请求的静态资源对应的路径
            // 0. 暂时先不考虑，文件是一个目录的情况
            // 1. 判断该文件是否存在 —— File
            File resource = new File(filePath);
            if(resource.exists()) {
                // 读取文件内容，并写入 response body 中
                OutputStream outputStream = socket.getOutputStream();
                Writer writer = new OutputStreamWriter(outputStream, "UTF-8");//其实真正的 HTTP 服务器不是以UTF-8编码的，这里为了简单起见
                PrintWriter printWriter = new PrintWriter(writer);

                String contentType = "text/html";//默认路径是这个
                //找到路径对应的后缀，以字符串处理
                if(path.contains(".")) {
                    int i = path.lastIndexOf(".");
                    //路径后缀
                    String suffix = path.substring(i+1);
                    contentType = mimeTypeMap.getOrDefault(suffix,contentType);

                    // 如果 contentType 是 "text/..."，代表是文本——用contentType的开头判断
                    // 我们都把字符集统一设定成 utf-8
                    if(contentType.startsWith("text/") ) {
                        contentType = contentType + "; charset=utf-8";
                    }
                }
                printWriter.printf("HTTP/1.0 200 OK\r\n");
                printWriter.printf("Content-Type: %s\r\n",contentType);//文本类型是text，并且是utf-8编码的
                printWriter.printf("\r\n");
                printWriter.flush();

                //读入响应体
                try(InputStream resourceInputStream1 = new FileInputStream(resource)) {
                    byte[] buffer = new byte[1024];
                    while(true) {
                        int len = resourceInputStream1.read(buffer);
                        if(len == -1) {
                            break;//静态资源文件中的内容已经被读完
                        }else {
                            outputStream.write(buffer,0,len);
                        }
                    }
                    outputStream.flush();//将数据输出到 TCP发送缓冲区 中
                }

            }else {
                // response 404
                OutputStream outputStream = socket.getOutputStream();
                Writer writer = new OutputStreamWriter(outputStream, "UTF-8");//其实真正的 HTTP 服务器不是以UTF-8编码的，这里为了简单起见
                PrintWriter printWriter = new PrintWriter(writer);
                printWriter.printf("HTTP/1.0 404 Not Found\r\n");

                printWriter.printf("Content-Type: text/html; charset=utf-8\r\n");//文本类型是text，并且是utf-8编码的
                printWriter.printf("\r\n");
                printWriter.printf("<h1>%s: 对应的资源不存在</h1>",path);
                printWriter.flush();
            }


        }catch (IOException  e){
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
