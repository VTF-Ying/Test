package com.vtf.service.test.io;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @ProjectName: logtest
 * @ClassName: IODemo7
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-08-03 14:25
 */
public class IODemo7 {
    public static void main(String[] args) throws UnsupportedEncodingException {
       // method();
       // method1();

        byte[] bytes1 = {-23, -69, -111, -23, -87, -84, -25, -88, -117, -27, -70, -113, -27, -111, -104};
        byte[] bytes2 = {-70, -38, -62, -19, -77, -52, -48, -14, -44, -79};
        String s1 = new String(bytes1);

        System.out.println(s1);

        String s2 = new String(bytes2,"GBK");
        System.out.println(s2);

    }


    // 指定GBK 将中文编码为一系列的字节
    private static void method1() throws UnsupportedEncodingException {
        String s = "黑马程序员";
        byte[] bytes = s.getBytes("GBK");
        System.out.println(Arrays.toString(bytes));
    }

    // 利用 IDEA 默认的 UTF-8 将中文编码为一系列的字节
    private static void method() {
        String s = "黑马程序员";
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));
    }
}
