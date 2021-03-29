package v3;

import java.io.*;
import java.net.Socket;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

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

    private static final String SESSION_BASE = "C:\\Users\\86187\\Java\\实现简易的HTTP服务器\\sessions";

    @Override
    public void run() {
        try {
            System.out.println("一条TCP连接已经建立");

            //进行 HTTP 请求解析——解析出路径（为了简单，暂时不考虑 查询字符串 部分
            InputStream inputStream = socket.getInputStream();
            Scanner scanner = new Scanner(inputStream,"UTF-8");
            scanner.next();// 读取出来的是方法，暂时不用，不保存
            String path = scanner.next();//请求行中的url
            scanner.nextLine();//读取 HTTP 版本号，暂时不用，不保存

            //判断是否包含查询字符串 queryString
            String requestURI = path;
            String queryString = "";
            if(path.contains("?")) {
                int i = path.indexOf("?");
                requestURI = path.substring(0,i);
                queryString = path.substring(i+1);
            }

            Map<String,String> headers = new HashMap<>();
            //通过 scanner，读取请求头
            String headerLine;
            while(scanner.hasNextLine() && !(headerLine = scanner.nextLine()).isEmpty()) {
                //请求头的每组KV通过 ":" 分割
                String[] part = headerLine.split(":");
                String name = part[0].trim().toLowerCase();// HTTP 的 header-name 大小写不区分
                String value = part[1].trim();

                headers.put(name,value);
            }
            // 通过类似这样的处理，使得 / => /index.html 同样的效果
            if(requestURI.equals("/")) {
                // welcome-file
                requestURI = "/index.html";
            }
            if(requestURI.equals("/required-login")) {
                String uuid = null;
                String cookie = headers.getOrDefault("cookie","");
                System.out.println("Cookie是 :" + cookie);
                for(String cookieKV : cookie.split(":")) {
                    if(cookieKV.isEmpty()) {
                        continue;
                    }
                    String[] kv = cookieKV.split("=");
                    String cookieName = kv[0];
                    String cookieValue = kv[1];
                    //带有username的，我们认为是已登录状态。用户名直接写在cookie里面了
                    if(cookieName.equals("username")) {
                        uuid = cookieValue;
                    }
                }
            }
            else if(requestURI.equals("/login")) {
                //省略了验证用户是否成功的步骤
                User user = new User(1,"HelloWorld","男");

                //创建session对象——req.getSession();
                String uuid = UUID.randomUUID().toString();//UUID做session-id用
                Map<String,Object> sessionData = new HashMap<>();

                //将需要保存的数据（user）保存到 session 中
                //session.setAtrribute("user",user);
                sessionData.put("user",user);

                // 剩下的工作就是 Tomcat 帮我们默默工作的
                //种cookie
                // cookie-name: session-id
                // cookie-value: uuid
                // 把 sessionData 持久化
                try(OutputStream outputStream =new FileOutputStream(SESSION_BASE + "/" + "uuid" + ".session")) {
                    try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
                        objectOutputStream.writeObject(sessionData);
                    }
                }
                OutputStream outputStream = socket.getOutputStream();
                Writer writer = new OutputStreamWriter(outputStream, "UTF-8");//其实真正的 HTTP 服务器不是以UTF-8编码的，这里为了简单起见
                PrintWriter printWriter = new PrintWriter(writer);

                printWriter.printf("HTTP/1.0 200 OK\r\n");
                printWriter.printf("Set-cookie: session-id=%s\r\n",uuid);
                printWriter.printf("Content-Type: text/html; charset=utf-8\r\n");//文本类型是text，并且是utf-8编码的
                printWriter.printf("\r\n");
                printWriter.printf("登陆成功");
                printWriter.flush();
            }else if(requestURI.equals("/set-cookie")) {
                //种cookie
                OutputStream outputStream = socket.getOutputStream();
                Writer writer = new OutputStreamWriter(outputStream, "UTF-8");//其实真正的 HTTP 服务器不是以UTF-8编码的，这里为了简单起见
                PrintWriter printWriter = new PrintWriter(writer);

                printWriter.printf("HTTP/1.0  307 Temporary Redirect\r\n");
                printWriter.printf("Set-Cookie: username=nannan\r\n");
                printWriter.printf("Location: profile\r\n");
                printWriter.printf("\r\n");
                printWriter.flush();

            }else if(requestURI.equals("/profile")) {
                //profile——镜像，反映出用户自身状况
                OutputStream outputStream = socket.getOutputStream();
                Writer writer = new OutputStreamWriter(outputStream, "UTF-8");//其实真正的 HTTP 服务器不是以UTF-8编码的，这里为了简单起见
                PrintWriter printWriter = new PrintWriter(writer);

                String username = null;
                //从 cookie 中获取 username
                String cookie = headers.getOrDefault("cookie","");
                System.out.println("Cookie是 :" + cookie);
                for(String cookieKV : cookie.split(":")) {
                    if(cookieKV.isEmpty()) {
                        continue;
                    }
                    String[] kv = cookieKV.split("=");
                    String cookieName = kv[0];
                    String cookieValue = kv[1];
                    //带有username的，我们认为是已登录状态。用户名直接写在cookie里面了
                    if(cookieName.equals("username")) {
                        username = cookieValue;
                    }
                }
                printWriter.printf("HTTP/1.0 200 OK\r\n");
                printWriter.printf("Content-Type: text/html; charset=utf-8\r\n");//文本类型是text，并且是utf-8编码的
                printWriter.printf("\r\n");
                if(username != null) {
                    printWriter.printf("<h1>当前用户是：%s</h1>",username);
                }else {
                    printWriter.printf("<h1>您需要先进行登录</h1");
                }
                printWriter.flush();

            }else if(requestURI.equals("/redirect-to")) {
               OutputStream outputStream = socket.getOutputStream();
               Writer writer = new OutputStreamWriter(outputStream, "UTF-8");//其实真正的 HTTP 服务器不是以UTF-8编码的，这里为了简单起见
               PrintWriter printWriter = new PrintWriter(writer);

               printWriter.printf("HTTP/1.0  307 Temporary Redirect\r\n");
               printWriter.printf("Location: /hello.jpg\r\n");//文本类型是text，并且是utf-8编码的
               printWriter.printf("\r\n");
               printWriter.flush();

           }else if(requestURI.equals("/goodbye.html")) {
                //先判断是否是动态资源
                //处理动态资源
                OutputStream outputStream = socket.getOutputStream();
                Writer writer = new OutputStreamWriter(outputStream, "UTF-8");//其实真正的 HTTP 服务器不是以UTF-8编码的，这里为了简单起见
                PrintWriter printWriter = new PrintWriter(writer);

                String target = "默认";
                for(String kv : queryString.split("&")) {
                    if(kv.isEmpty()) {
                        continue;
                    }
                    String[] part = kv.split("=");
                    //URL需要对中文字符进行编码处理
                    String key = URLDecoder.decode(part[0],"UTF-8");
                    String value = URLDecoder.decode(part[1],"UTF-8");

                    if(key.equals("target")) {
                        target = value;
                    }

                }

                printWriter.printf("HTTP/1.0  200 OK\r\n");
                printWriter.printf("Content-Type: text/html; charset=utf-8\r\n");//文本类型是text，并且是utf-8编码的
                printWriter.printf("\r\n");
                printWriter.printf("<h1>再见 %s</h1>",target);
                printWriter.flush();
            }else {
                String filePath = DOC_BASE + requestURI;  // 用户请求的静态资源对应的路径
                // 0. 暂时先不考虑，文件是一个目录的情况
                // 1. 判断该文件是否存在 —— File
                File resource = new File(filePath);
                if (resource.exists()) {
                    // 读取文件内容，并写入 response body 中
                    OutputStream outputStream = socket.getOutputStream();
                    Writer writer = new OutputStreamWriter(outputStream, "UTF-8");//其实真正的 HTTP 服务器不是以UTF-8编码的，这里为了简单起见
                    PrintWriter printWriter = new PrintWriter(writer);

                    String contentType = "text/html";//默认路径是这个
                    //找到路径对应的后缀，以字符串处理
                    if (path.contains(".")) {
                        int i = path.lastIndexOf(".");
                        //路径后缀
                        String suffix = path.substring(i + 1);
                        contentType = mimeTypeMap.getOrDefault(suffix, contentType);

                        // 如果 contentType 是 "text/..."，代表是文本——用contentType的开头判断
                        // 我们都把字符集统一设定成 utf-8
                        if (contentType.startsWith("text/")) {
                            contentType = contentType + "; charset=utf-8";
                        }
                    }
                    printWriter.printf("HTTP/1.0 200 OK\r\n");
                    printWriter.printf("Content-Type: %s\r\n", contentType);//文本类型是text，并且是utf-8编码的
                    printWriter.printf("\r\n");
                    printWriter.flush();

                    //读入响应体
                    try (InputStream resourceInputStream1 = new FileInputStream(resource)) {
                        byte[] buffer = new byte[1024];
                        while (true) {
                            int len = resourceInputStream1.read(buffer);
                            if (len == -1) {
                                break;//静态资源文件中的内容已经被读完
                            } else {
                                outputStream.write(buffer, 0, len);
                            }
                        }
                        outputStream.flush();//将数据输出到 TCP发送缓冲区 中
                    }

                } else {
                    // response 404
                    OutputStream outputStream = socket.getOutputStream();
                    Writer writer = new OutputStreamWriter(outputStream, "UTF-8");//其实真正的 HTTP 服务器不是以UTF-8编码的，这里为了简单起见
                    PrintWriter printWriter = new PrintWriter(writer);
                    printWriter.printf("HTTP/1.0 404 Not Found\r\n");

                    printWriter.printf("Content-Type: text/html; charset=utf-8\r\n");//文本类型是text，并且是utf-8编码的
                    printWriter.printf("\r\n");
                    printWriter.printf("<h1>%s: 对应的资源不存在</h1>", path);
                    printWriter.flush();
                }

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
