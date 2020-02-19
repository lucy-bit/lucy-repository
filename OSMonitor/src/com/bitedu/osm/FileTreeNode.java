package com.bitedu.osm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -02 -15
 * Time: 10:34
 */
public class FileTreeNode {
    private String finleName;//文件名
    private long totalLength;//文件总长度
    private //  记录系统文件
    public String getFinleName() {
        return finleName;
    }

    public void setFinleName(String finleName) {
        this.finleName = finleName;
    }

    public long getTotalLength() {
        return totalLength;
    }

    public void setTotalLength(long totalLength) {
        this.totalLength = totalLength;
    }

    public List<FileTreeNode> getChildrens() {
        return childrens;
    }

    public void setChildrens(List<FileTreeNode> childrens) {
        this.childrens = childrens;
    }

    private List<FileTreeNode> childrens = new ArrayList<>();

}























