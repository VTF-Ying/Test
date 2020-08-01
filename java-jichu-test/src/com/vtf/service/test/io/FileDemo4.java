package com.vtf.service.test.io;

import java.io.File;

/**
 * @ProjectName: test
 * @ClassName: FileDemo
 * @Description: TODO(File 获取和判断方法)
 * @Author: VTF
 * @create: 2020-07-30 14:56
 */
public class FileDemo4 {
    /**
     * public boolean isDirectory()   是否是文件夹
     * public boolean isFile()        是否是文件
     * public boolean exists()        测试此抽象路径名表示的文件或目录是否存在
     * public boolean getName()       获取文件名
     **/
    public static void main(String[] args) {
        // method1();
        // method2();
        // method3();

        // 注意点
        // 1. 如果获取的是文件，那么获取的是文件名和文件的后缀
        // 2. 如果调用者是一个文件夹 那么获取的是文件的名字
        File file = new File("a.txt");
        String name = file.getName();
        System.out.println(name);

    }

    private static void method3() {
        File file = new File("a.txt");
        boolean result = file.exists();
        System.out.println(result);
    }

    private static void method2() {
        File file = new File("D:\\local");
        boolean result1 = file.isFile();
        boolean result2 = file.isDirectory();
        System.out.println(result1);
        System.out.println(result2);
    }

    private static void method1() {
        File file = new File("D:\\local\\user\\a.txt");
        boolean result1 = file.isFile();
        boolean result2 = file.isDirectory();
        System.out.println(result1);
        System.out.println(result2);
    }
}
