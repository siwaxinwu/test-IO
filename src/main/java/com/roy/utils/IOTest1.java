package com.roy.utils;

import java.io.*;

/**
 * description：
 * author：dingyawu
 * date：created in 14:18 2020/11/21
 * history:
 */
public class IOTest1 {

    public static void write(File file) throws IOException {
        // 缓冲字节流，提高了效率
        BufferedOutputStream bis = new BufferedOutputStream(new FileOutputStream(file, true));

        // 要写入的字符串
        String string = "松下问童子，言师采药去。只在此山中，云深不知处。";
        // 写入文件
        bis.write(string.getBytes());
        // 关闭流
        bis.close();
    }

    public static String read(File file) throws IOException {
        BufferedInputStream fis = new BufferedInputStream(new FileInputStream(file));

        // 一次性取多少个字节
        byte[] bytes = new byte[1024];
        // 用来接收读取的字节数组
        StringBuilder sb = new StringBuilder();
        // 读取到的字节数组长度，为-1时表示没有数据
        int length = 0;
        // 循环取数据
        while ((length = fis.read(bytes)) != -1) {
            // 将读取的内容转换成字符串
            sb.append(new String(bytes, 0, length));
        }
        // 关闭流
        fis.close();

        return sb.toString();
    }
}
