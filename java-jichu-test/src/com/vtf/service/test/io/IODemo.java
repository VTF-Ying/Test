package com.vtf.service.test.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @ProjectName: logtest
 * @ClassName: IOdemo
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-08-04 10:12
 */
public class IODemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter(new File("java-jichu-test/src/com/vtf/service/test/io/txt/c.txt"),true);
        // method(fw);
        // method2(fw);
        // method3(fw);
        // method4(fw);
       // method5(fw);
    }

    private static void method5(FileWriter fw) throws IOException {
        String str = "\n黑马程序员abc";
        fw.write(str,0,2);
        fw.close();
    }

    // 写一个字符串
    private static void method4(FileWriter fw) throws IOException {
        String str = "\n黑马程序员abc";
        fw.write(str);
        fw.close();
    }

    // 一次写一个字符数组 的一部分
    private static void method3(FileWriter fw) throws IOException {
        char[] chars = {97,98,99,100,101};
        fw.write(chars,0,3); // 从零索引开始 写三个
        fw.close();
    }

    // 一次写一个字符数组
    private static void method2(FileWriter fw) throws IOException {
        char[] chars = {97,98,99,100,101};
        fw.write(chars);
        fw.close();
    }

    // 一次写一个字符
    private static void method(FileWriter fw) throws IOException {
        fw.write(97);
        fw.write(98);
        fw.write(99);
        fw.close();
    }
}
