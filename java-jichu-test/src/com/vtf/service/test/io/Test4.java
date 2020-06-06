package com.vtf.service.test.io;

import java.io.*;

/**
 * @ProjectName: test
 * @ClassName: Test4
 * @Description: TODO(文件字节流 小练习 : 文件复制)
 * @Author: VTF
 * @create: 2020-04-30 11:04
 */
public class Test4 {
    public static void main(String[] args) {
        copyFile("D:/Test/a/b/c/d", "D:/Test/IOTest/a/ccc");
    }

    public static void copyFile(String inPa, String ouPa) {
        File file = new File(inPa);
        if (file.isFile()) {
            try {
                FileInputStream in = new FileInputStream(inPa);
                FileOutputStream out = new FileOutputStream(ouPa);
                byte[] b = new byte[Math.toIntExact(file.length())];
                out.write(b);
                out.flush();
                out.close();
                in.close();
                System.out.println("复制完毕");
            } catch (Exception e) {
                e.printStackTrace();

            }
        } else {
            System.out.println("这是文件夹");
        }
    }
}
