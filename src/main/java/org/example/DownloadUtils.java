package org.example;

public class DownloadUtils {
    public static void download(String url, DownloadStatusListener downloadStatusListener) {
        try {
            downloadStatusListener.onStart(); // 开始下载
            Thread.sleep(2000); // 模拟下载
            // 模拟出错异常
            throw new IllegalArgumentException("下载出错了");
        } catch (InterruptedException e) {
            e.printStackTrace();
            downloadStatusListener.onFailure(); // 下载失败
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            downloadStatusListener.onFailure(); // 下载失败
        }
    }
}