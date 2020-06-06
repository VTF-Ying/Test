package com.vtf.service.test.io;

import java.io.*;

/**
 * @ProjectName: test
 * @ClassName: Test5
 * @Description: TODO(文件 字符流)
 * @Author: VTF
 * @create: 2020-04-30 11:49
 */
public class Test5 {

    /**
     * 文件字符流 和 文件 字节流 差不多
     * 只有创建流对象 时不一样
     * 字节流是  FileInputStream 和 FileOutputStream
     * 字符流是  FileReader
     * 字节流 是 byte 数组 字符流 是 char 数组
     **/

    public static void main(String[] args) {
        testFileReader("D:/Test/IOTest/a/tt4.txt");
        testFileWriter("D:/Test/IOTest/a/tt5.txt", "我想要个女朋友");
    }

    /**
     * 文件字符输入流
     **/
    public static void testFileReader(String inPath) {
        File file = new File(inPath);
        try {
            FileReader fr = new FileReader(inPath);  // 创建文件字符输入流对象
            char[] c = new char[Math.toIntExact(file.length())];// 创建 临时存放数据的字符数组
            System.out.println(new String(c, 0, fr.read(c)));
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 文件字符输入流
     **/
    public static void testFileWriter(String outPath, String text) {
        try {
            FileWriter fw = new FileWriter(outPath);
            fw.write(text);
            fw.flush();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
