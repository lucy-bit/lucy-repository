package com.bitedu.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

//所以javafx主程序必须派生自Application类
public class OSMonitorApplication extends Application {

    //子类必须覆盖父类的start方法
    public void start(Stage primaryStage) throws IOException {
        //1. 加载.fxml文件
        //java虚拟机执行一个类时必须先加载一个类，需要通过类加载器来加载
        //getClass()返回一个Class类对象，通过getClassLoader类加载器来加载(从resource目录下加载，所以要记得将resource目录设置为资源根目录)
        //getResource返回URL类型
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource
                ("os_monitor_tab.fxml"));
        //2. 加载
        Parent root = loader.load();

        //3. 创建一个 Scene 对象（场景）
        Scene scene = new Scene(root,800,600);

        //4.给 Stage 设置标题
        primaryStage.setTitle("OS monitor");

        //5. 将 Scene 添加到 Stage 中
        primaryStage.setScene(scene);

        //6. 展示
        primaryStage.show();
        //
    }
   /* @Override
    public void start(Stage primaryStage) throws Exception{
        // 1. 加载 .fxml 文件
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource
                ("os_monitor_tab.fxml"));
        // 2. 真正的加载
        Parent root = loader.load();

        // 3. 创建一个 Scene 对象，也就是场景
        Scene scene = new Scene(root, 800, 600);

        // 4. 给 Stage 设置标题
        primaryStage.setTitle("OS Monitor");

        // 5. 将 Scene 添加到 Stage
        primaryStage.setScene(scene);

        // 6. 展示
        primaryStage.show();
    }*/
    public static void main(String[] args)
    {
        //调用launch方法，主应用程序就能运行起来
        launch(args);
    }

}
