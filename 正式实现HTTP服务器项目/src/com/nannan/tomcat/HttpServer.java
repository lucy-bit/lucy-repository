package com.nannan.tomcat;


import com.nannan.standard.Servlet;
import com.nannan.standard.ServletException;
import com.nannan.tomcat.ConfigReader;
import com.nannan.tomcat.Context;
import com.nannan.tomcat.RequestResponseTask;
//import com.nannan.tomcat.servlets.DefaultServlet;
//import com.nannan.tomcat.servlets.NotFoundServlet;

import com.nannan.standard.Servlet;
import com.nannan.tomcat.servlets.DefaultServlet;
import com.nannan.tomcat.servlets.NotFoundServlet;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -30
 * Time: 18:26
 */
public class HttpServer {
    public static DefaultServlet defaultServlet = new DefaultServlet();
    public static NotFoundServlet notFoundServlet = new NotFoundServlet();

    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, ServletException {
        // 1. 找到所有的 Servlet 对象，进行初始化
        initServer();

        // 2. 处理服务器逻辑
        startServer();

        // 3. 找到所有的 Servlet 对象，进行销毁
        destroyServer();
    }

    private static void startServer() throws IOException {
        //线程池——大小为10
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        ServerSocket serverSocket = new ServerSocket(8080);//监听8080端口

        // 2.每次循环，都要处理一个请求
        while (true) {
            Socket socket = serverSocket.accept();
            Runnable task = new RequestResponseTask(socket);
            threadPool.execute(task);
        }

    }

    private static void destroyServer() {
        defaultServlet.destroy();
        notFoundServlet.destroy();

        for (Context context : contextList) {
            context.destroyServlets();
        }
    }


    private static void initServer() throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, ServletException {
        //1.扫描所有的Context
        scanContexts();
        //2. 进行 web.conf 的配置解析，找出其中有多少个 servlet 对象
        parseContextConf();
        //3. 执行类的加载——反射
        loadServletClasses();
        //4. 实例化所有的 servletObjects 对象
        instantiateServletObjects();
        //5. 调用临时方法进行初始化
        initializeServletObjects();
    }

    private static void initializeServletObjects() throws ServletException {
        System.out.println("第五步：执行每个 servlet 对象的初始化");
        for (Context context : contextList) {
            context.initServletObjects();
        }

        defaultServlet.init();
        notFoundServlet.init();
    }

    private static void instantiateServletObjects() throws InstantiationException, IllegalAccessException {
        System.out.println("第四步：实例化每个 servlet 对象");
        for (Context context : contextList) {
            context.instantiateServletObjects();
        }
    }

    private static void loadServletClasses() throws ClassNotFoundException {
        System.out.println("第三步：加载每个 Servlet 类");
        for (Context context : contextList) {
            context.loadServletClasses();
        }
    }

    private static void parseContextConf() throws IOException {
        System.out.println("第二步：解析每个 Context 下的配置文件");
        for (Context context : contextList) {
            context.readConfigFile();
        }
    }

    public static final String WEBAPPS_BASE = "C:\\Users\\86187\\Java\\正式实现HTTP服务器项目\\webapps";
    public static final List<Context> contextList = new ArrayList<>();
    private static final ConfigReader configReader = new ConfigReader();
    public static final DefaultContext defaultContext = new DefaultContext(configReader);

    //文件的目录扫描
    private static void scanContexts() {
        System.out.println("第一步：扫描出所有个 contexts");
        File webappsRoot = new File(WEBAPPS_BASE);
        //取出它下面的子目录
        File[] files = webappsRoot.listFiles();
        if (files == null) {
            throw new RuntimeException();
        }

        // 遍历子目录文件，如果它不是目录，那么他就不是一个 web 应用
        for (File file : files) {
            if (!file.isDirectory()) {
                continue;
            }

            String contextName = file.getName();
            System.out.println(contextName);
            Context context = new Context(configReader, contextName);

            contextList.add(context);
        }
    }
}


