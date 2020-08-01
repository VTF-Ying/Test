package com.vtf.service.test.io;

import java.io.File;
import java.io.IOException;

/**
 * @ProjectName: test
 * @ClassName: FileDemo2
 * @Description: TODO(File 创建功能)
 * @Author: VTF
 * @create: 2020-07-30 11:34
 */
public class FileDemo2 {
    /* public boolean mkdirs()  创建多级目录 */
    /* public boolean mkdir() 方法 创建单级目录 */
    /* public boolean createNewFile() 方法 创建文件 */
    public static void main(String[] args) throws IOException {
        method1();
        // method2();
        // method3();

    }

    private static void method3() {
        // public boolean mkdirs()
        // 注意：
        // 1. 可以创建单级文件夹 也可以创建多级文件夹
        // 2. 不管调用者 有没有 后缀名 他只能创建 单级文件夹
        File file = new File("java-jichu-test/src/com/vtf/service/test/io/txt/aaa/bbb/ccc");
        boolean result = file.mkdirs();
        System.out.println(result);
    }

    /**
     * 此方法 不常用 基本上被 mkdirs代替
     **/
    private static void method2() {
        // public boolean mkdir() 方法   
        // 注意点：
        // 1.只能创建单级文件夹
        // 2.不管调用者 有没有 后缀名 他只能创建 单级文件夹
        File file = new File("java-jichu-test/src/com/vtf/service/test/io/txt/a.txt");
        boolean result = file.mkdir();
        System.out.println(result);
    }

    private static void method1() throws IOException {
        //  public boolean createNewFile() 方法
        // 注意点：
        // 1.如果文件存在 那么创建失败  返回 false
        // 2.如果文件不存在  那么创建成功 返回true
        // 3.createNewFile 不管调用者 有没有后缀名 只能创建文件
        File file = new File("java-jichu-test/src/com/vtf/service/test/io/txt/a.txt");
        boolean result = file.createNewFile();
        System.out.println(result);
    }
}
