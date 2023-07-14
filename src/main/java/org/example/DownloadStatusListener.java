package org.example;

//声明一个接口

public interface DownloadStatusListener {
    //定义一个方法
    void onStart();
    //标识下载完成
    void onDownloadOver();
    //标识下载失败
    void onFailure();
}
