package com.nannan.tomcat;

import com.nannan.standard.Servlet;
import com.nannan.standard.ServletException;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -30
 * Time: 21:07
 */
public class Context {
    private final ConfigReader reader;
    private final String name;
    private Config config;
    //每个web应用都有自己的一个 类加载器，我们就简单地拿Context 的类加载器去加载
    //我们平时的 web 应用中的代码，都是由自己 Context 的类加载器进行加载，互不干扰
    private final ClassLoader webappClassLoader = Context.class.getClassLoader();

    public Context(ConfigReader reader,String name) {
        this.reader = reader;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void readConfigFile() throws IOException {
        this.config = reader.read(name);
    }

    List<Class<?>>  servletClassList = new ArrayList<>();
    public void loadServletClasses() throws ClassNotFoundException {
        Set<String> servletClassNames = new HashSet<>(config.servletNameToServletClassNameMap.values());
        for(String servletClassName : servletClassNames) {
            Class<?> sevletClass = webappClassLoader.loadClass(servletClassName);
            servletClassList.add(sevletClass);
        }
    }

    List<Servlet> servletList = new ArrayList<>();
    public void instantiateServletObjects() throws IllegalAccessException, InstantiationException {
        for(Class<?> servletClass : servletClassList) {
            //实例化对象
            //因为 servletClass不知道class 到底是什么类型的，理应赋给Object对象，但是我们自己知道是servlet对象，所以我们强制类型转换一下，有风险，但是不管啦
           Servlet servlet = (Servlet)servletClass.newInstance();  //默认调用该类的无参构造方法
            servletList.add(servlet);
        }
    }

    public void initServletObjects() throws ServletException {
        for(Servlet servlet : servletList) {
            servlet.init();
        }
    }
}
