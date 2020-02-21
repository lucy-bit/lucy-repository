package com.bitedu.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class OSMonitorApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("os_monitor_tab.fxml"));
        Parent root = loader.load();
        //Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("os_monitor_tab.fxml"));
        primaryStage.setTitle("OSMonitor");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
