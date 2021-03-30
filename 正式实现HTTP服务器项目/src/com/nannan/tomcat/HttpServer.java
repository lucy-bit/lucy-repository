package com.nannan.tomcat;


import com.nannan.standard.Servlet;
import com.nannan.standard.ServletException;
import com.nannan.tomcat.ConfigReader;
import com.nannan.tomcat.Context;
import com.nannan.tomcat.RequestResponseTask;
//import com.nannan.tomcat.servlets.DefaultServlet;
//import com.nannan.tomcat.servlets.NotFoundServlet;

import com.nannan.standard.Servlet;

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
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, ServletException, InstantiationException {
        //线程池——大小为10
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        ServerSocket serverSocket = new ServerSocket(8080); //监听8080端口

        // 1. 找到所有的 Servlet 对象，对其进行初始化
        initServer();
        for(Context context : contextList) {
            for(Servlet servlet : context.servletList) {
                System.out.println(servlet);
            }
        }

        // 2.每次循环，都要处理一个请求
        while (true) {
            Socket socket = serverSocket.accept();
            Runnable task = new RequestResponseTask(socket);
        }

        //3. 找到所有的 Servlet 对象，进行销毁
      /*  for(Servlet servlet : servlets){
            servlet.destroy();
        }*/
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

       /* for(Servlet servlet : servlets) {
            servlet.init();
        }*/
    }

    private static void initializeServletObjects() throws ServletException {
        System.out.println("第五步：执行每个 servlet 对象的初始化");
        for (Context context : contextList) {
            context.initServletObjects();
        }
    }

        private static void instantiateServletObjects () throws InstantiationException, IllegalAccessException {
            System.out.println("第四步：实例化每个 servlet 对象");
            for (Context context : contextList) {
                context.instantiateServletObjects();
            }
        }

        private static void loadServletClasses () throws ClassNotFoundException {
            System.out.println("第三步：加载每个 Servlet 类");
            for (Context context : contextList) {
                context.loadServletClasses();
            }
        }


        private static void parseContextConf () throws IOException {
        System.out.println("第二步：解析每个 Context 下的配置文件");
        for (Context context : contextList) {
                // 针对每一个context，读取它的配置文件
                context.readConfigFile();
                //readConfigFile会调用reader的read方法，将结果放到config里，config里维护着两个map
            }

        }

        private static List<Context> contextList = new ArrayList<>();
        public static final String WEBAPPS_BASE = "C:\\Users\\86187\\Java\\正式实现HTTP服务器项目\\webapps";
        private static final ConfigReader configReader = new ConfigReader();
        //文件的目录扫描
        private static void scanContexts () {
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


