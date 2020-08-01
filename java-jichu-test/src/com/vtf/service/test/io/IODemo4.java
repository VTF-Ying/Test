package com.vtf.service.test.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ProjectName: test
 * @ClassName: IODemo
 * @Description: TODO(字节流读取多个字节)
 * @Author: VTF
 * @create: 2020-07-31 14:35
 */
public class IODemo4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("java-jichu-test/src/com/vtf/service/test/io/txt/a.txt");
        // method(fis);
        niceMethod(fis);
    }

    private static void niceMethod(FileInputStream fis) throws IOException {
        int b;
        while ((b = fis.read()) != -1) {
            System.out.println((char) b);
        }
        fis.close();
    }

    private static void method(FileInputStream fis) throws IOException {
        while (true) {
            int read = fis.read();
            if (read == -1) {
                fis.close();
                break;
            }
            System.out.println((char) read);
        }
    }
}
