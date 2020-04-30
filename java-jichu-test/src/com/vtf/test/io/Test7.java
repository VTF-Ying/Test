package com.vtf.test.io;

import java.io.File;
import java.io.RandomAccessFile;

/**
 * @ProjectName: test
 * @ClassName: Test7
 * @Description: TODO(随机访问)
 * @Author: VTF
 * @create: 2020-04-30 16:26
 */
public class Test7 {
    public static void main(String[] args) {
        // testRandomAccessFileRead();
        testRandomAccessFileWrite();
    }

    /*读取*/
    public static void testRandomAccessFileRead(){
        /**
         * RandomAccessFile 的构造 有两个参数
         * 参数1 : 文件路径
         * 参数2:访问模式
         * r:以只读方式打开
         * rw:打开以便读取和写入
         * rwd:打开以便读取和写入 同步文件内容的更新
         * rws:打开以便读取和写入 同步文件内容和元数据的更新
         * 最常用的是 r 和 rw
         **/

        try {
            File file = new File("D:/Test/IOTest/a/test.txt");
            RandomAccessFile ra = new RandomAccessFile("D:/Test/IOTest/a/test.txt","r");
            ra.seek(4); // 设置文件读取内容的起始点
            byte[] b = new byte[Math.toIntExact(file.length())];
            System.out.println(new String(b,0,ra.read(b)));
            ra.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*写入*/
    public static void testRandomAccessFileWrite(){
        /**
         * RandomAccessFile 的构造 有两个参数
         * 参数1 : 文件路径
         * 参数2:访问模式
         * r:以只读方式打开
         * rw:打开以便读取和写入
         * rwd:打开以便读取和写入 同步文件内容的更新
         * rws:打开以便读取和写入 同步文件内容和元数据的更新
         * 最常用的是 r 和 rw
         **/

        try {
            File file = new File("D:/Test/IOTest/a/test.txt");
            RandomAccessFile ra = new RandomAccessFile("D:/Test/IOTest/a/test.txt","rw");
            ra.seek(file.length()); // 设置文件写入内容的起始点
            ra.write("\n你好".getBytes());
            ra.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
