package com.vtf.service.test.io;

import java.io.File;

/**
 * @ProjectName: test
 * @ClassName: Test1HM
 * @Description: TODO(File 的访问地址 三种 操作)
 * @Author: VTF
 * @create: 2020-07-30 11:20
 */
public class FileDemo1 {
    public static void main(String[] args) {
        method1();
        // method2();
        // method3();
    }

    private static void method3() {
        File file = new File("java-jichu-test/src/com/vtf/service/test/io/txt/");
        String path = "a.txt";
        File file1 = new File(file, path);
        System.out.println(file1);
    }

    private static void method2() {
        String path1 = "java-jichu-test/src/com/vtf/service/test/io/txt";
        String path2 = "a.txt";
        File file = new File(path1, path2);
        System.out.println(file);
    }

    private static void method1() {
        // File(String pathname)
        String path = "java-jichu-test/src/com/vtf/service/test/io/txt/a.txt/a.txt";
        File file = new File(path);
    }
}
