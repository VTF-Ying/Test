package com.vtf.service.test.io;

import java.io.*;

/**
 * @ProjectName: test
 * @ClassName: IODemo6
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-07-31 19:25
 */
public class IODemo6 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        // 创建字节缓冲输入流
        BufferedInputStream bfis = new BufferedInputStream(new FileInputStream("D:\\local\\a.txt"));
        // 创建字节缓冲输出流
        BufferedOutputStream bfos = new BufferedOutputStream(new FileOutputStream("D:\\local\\b.txt"));

        int b;
        while ((b = bfis.read()) != -1) {
            bfos.write(b);
        }
        bfis.close();
        bfos.close();
        long end = System.currentTimeMillis();
        System.out.println("共耗时" + (end - start) + "毫秒");

    }
}
