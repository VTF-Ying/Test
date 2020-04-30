package com.vtf.test.io;

import java.io.*;

/**
 * @ProjectName: test
 * @ClassName: Test6
 * @Description: TODO(缓冲流的测试)
 * @Author: VTF
 * @create: 2020-04-30 14:51
 */
public class Test6 {
    public static void main(String[] args) {
        try {
            //testBufferedInputStream("D:/Test/IOTest/a/tt4.txt");
            //testBufferedOutputStream("D:/Test/IOTest/a/test.txt");
            copyFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void testBufferedInputStream(String inPath) throws Exception {
        File file = new File(inPath);
        // 文件字节 输入流对象
        FileInputStream in = new FileInputStream(inPath);
        // 把文件字节输入流 放到 缓冲字节 输入流对象
        BufferedInputStream br = new BufferedInputStream(in);
        byte[] b = new byte[Math.toIntExact(file.length())];
        System.out.println(new String(b,0,in.read(b)));
        br.close();
        in.close();
    }
    public static void  testBufferedOutputStream(String outPath) throws Exception {
        //创建 字节输出流对象
        FileOutputStream out = new FileOutputStream(outPath);
        // 把字节输出流对象 放到缓冲字节输出流对象
        BufferedOutputStream bo = new BufferedOutputStream(out);
        String s = "hello word";
        bo.write(s.getBytes()); //写到内存中
        bo.flush();  // 刷到硬盘上
        bo.close();
        out.close();
    }
    public static void copyFile() throws Exception{
        File file = new File("D:/Test/IOTest/a/tt4.txt");

        BufferedInputStream br = new BufferedInputStream(new FileInputStream("D:/Test/IOTest/a/tt4.txt"));
        BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("D:/Test/IOTest/a/tt6.txt"));

        byte[] b = new byte[Math.toIntExact(file.length())];
        System.out.println(new String(b,0,br.read(b)));

        bo.write(b);
        bo.flush();
        bo.close();
        br.close();


    }
}

