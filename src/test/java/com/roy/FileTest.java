package com.roy;

import java.io.File;
import java.io.IOException;

/**
 * description：
 * author：dingyawu
 * date：created in 14:32 2020/11/21
 * history:
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Mu/fileTest.txt");

        // 判断文件是否存在
        if (!file.exists()) {
            // 不存在则创建
            file.createNewFile();
        }
        System.out.println("文件的绝对路径：" + file.getAbsolutePath());
        System.out.println("文件的大小：" + file.length());

        // 刪除文件
        file.delete();
    }
}
