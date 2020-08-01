package com.vtf.service.test.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ProjectName: test
 * @ClassName: IODemo5
 * @Description: TODO(把 a.txt 复制为 b.txt)
 * @Author: VTF
 * @create: 2020-07-31 17:22
 */
public class IODemo5 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        FileOutputStream fos = new FileOutputStream("D:\\local\\b.txt");
        FileInputStream fis = new FileInputStream("D:\\local\\a.txt");
        // method(fos, fis);
        // niceMethod(fos, fis);
        byte[] bytes = new byte[8192];
        int len;  // 本次读到的有效字节个数 -- 这次多了几个字节
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);  // 字节数组复制到新文件
        }
        fis.close();
        fos.close();
        long end = System.currentTimeMillis();
        System.out.println("共耗时" + (end - start) + "毫秒");
    }

    private static void niceMethod(FileOutputStream fos, FileInputStream fis) throws IOException {


    }

    private static void method(FileOutputStream fos, FileInputStream fis) throws IOException {
        long start = System.currentTimeMillis();  // 单字节复制到新文件
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }
        fis.close();
        fos.close();
        long end = System.currentTimeMillis();
        System.out.println("共耗时" + (end - start) + "毫秒");
    }
}
