package com.vtf.service.test.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ProjectName: test
 * @ClassName: IODemo2
 * @Description: TODO(字节流写数据的三种方式 和 字节流续写开关)
 * @Author: VTF
 * @create: 2020-07-31 11:01
 */
public class IODemo2 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\local\\a.txt");
        // method(file);
        method2(file);
        // method3(file);
        // method4(file);
    }

    private static void method4(File file) throws IOException {
        FileOutputStream fos = new FileOutputStream(file, true);  // 这个true 是续写开关
        byte[] bys = {103, 102, 101, 100, 99, 98, 97};
        fos.write(103);
        fos.write("\r\n".getBytes());
        fos.write(102);
        fos.write("\r\n".getBytes());
        fos.write(101);
        fos.write("\r\n".getBytes());
        fos.write(100);
        fos.write("\r\n".getBytes());
        fos.write(99);
        fos.write("\r\n".getBytes());
        fos.write(98);
        fos.write("\r\n".getBytes());
        fos.write(97);
        fos.write("\r\n".getBytes());
        fos.close();
    }


    /**
     * 一次写一个字节数组的一部分
     **/
    private static void method3(File file) throws IOException {
        FileOutputStream fos = new FileOutputStream(file);
        byte[] bys = {97, 98, 99, 100, 101, 102, 103};
        fos.write(bys, 2, 3); // 从bys数组里第二个下标开始数三个
        fos.close();
    }

    /**
     * 一次写一个字节数组
     **/
    private static void method2(File file) throws IOException {
        FileOutputStream fos = new FileOutputStream(file);
        byte[] bys = {97, 98, 99, 100, 101, 102, 103};
        fos.write(bys);
        fos.close();
    }

    /**
     * 一次写一个字节
     **/
    private static void method(File file) throws IOException {
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(97);
        fos.close();
    }
}
