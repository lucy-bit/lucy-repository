package com.bitedu.osm;

import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -02 -14
 * Time: 11:27
 */
public class OSResource {
    private static OperatingSystemMXBean mxBean = ManagementFactory.getPlatformMXBean(
            OperatingSystemMXBean.class);

    private static final int DATA_LENGTH = 60;
    private static XYPair[] cpuDatas = new XYPair[DATA_LENGTH];
    private static int firstIndex = DATA_LENGTH;
    private static void moveCPUData(double cpuPercetage) {
        int movIdx = -1;
        if(firstIndex == 0) {
            movIdx = firstIndex + 1;
        }else {
            movIdx = firstIndex;
            firstIndex--;
        }
        for(; movIdx < cpuDatas.length; movIdx++) {
            cpuDatas[movIdx-1].setX(cpuDatas[movIdx].getX()-1);
            cpuDatas[movIdx-1].setY(cpuDatas[movIdx].getY());
        }
        movIdx--;
        cpuDatas[movIdx] = new XYPair(movIdx,cpuPercetage);
    }
    static {
        for(int i = 0; i < cpuDatas.length; i++) {
            cpuDatas[i] = new XYPair(0,0);
        }
    }
    //嵌套类
    public static class XYPair {
        private double x;
        private double y;
        public XYPair(double x,double y) {
            this.x = x;
            this.y = y;
        }
        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }
    }
    public static double getCPUPercetage() {
        return mxBean.getSystemCpuLoad();
    }
}

















