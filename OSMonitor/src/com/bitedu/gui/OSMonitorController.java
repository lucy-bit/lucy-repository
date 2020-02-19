package com.bitedu.gui;

import com.bitedu.osm.OSResource;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.control.TreeTableView;

import java.util.Timer;
import java.util.TimerTask;

public class OSMonitorController {
    @FXML private LineChart cpuChart;//做注解
    @FXML private TreeTableView fileStat;
    private TimerTask timerTask = null;
    private Timer timer = new Timer();
    public OSMonitorController() {
    }

    public void handleCPUSelectionChanged(Event event) {
       double xyPairs = OSResource.getCPUPercetage();
        System.out.println("Tab selected cpu =" + OSResource.getCPUPercetage());


    }
    public void handleSelectFile() {
        System.out.println("Button action");
    }
}










































