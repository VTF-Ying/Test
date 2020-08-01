package com.vtf.service.test.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * qq交流群215383682
 *
 * @author xeclass
 * @date 2020-07-31 20:10
 */
public class TestDemo1 {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream("D:\\local\\a.txt");
        FileOutputStream outputStream = new FileOutputStream("D:\\local\\c.txt");
        int len;
// 一次读取一个字节,每读取一个字节都要实现一次与硬盘的交互操作
        long start = System.currentTimeMillis();
        while ((len = inputStream.read()) != -1) {
            outputStream.write(len);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时" + (end - start) + "毫秒");
    }
}
