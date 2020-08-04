package com.vtf.service.test.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @ProjectName: logtest
 * @ClassName: IODemo9
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-08-04 11:59
 */
public class IODemo9 {
    public static void main(String[] args) throws IOException {
        // 创建字符 输入流的对象
        FileReader fr = new FileReader("java-jichu-test/src/com/vtf/service/test/io/txt/c.txt");
        // method(fr);
        // 创建一个数组
        char[] chars = new char[1024];
        int ch;
        while ((ch=fr.read(chars))!=-1){
            System.out.println(new String(chars,0,ch));
        }
    }

    // 读取数据
    // 一次读取一个字符
    private static void method(FileReader fr) throws IOException {
        int ch;
        while ((ch=fr.read())!=-1){
            System.out.println((char)ch);
        }
        fr.close();
    }
}
