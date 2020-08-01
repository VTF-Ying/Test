package com.vtf.service.test.io;

import java.io.File;

/**
 * @ProjectName: test
 * @ClassName: FileDemo3
 * @Description: TODO(File 删除方法)
 * @Author: VTF
 * @create: 2020-07-30 14:46
 */
public class FileDemo3 {
    /* 这章只有删除方法  public boolean delete() 删除文件或者文件夹  */
    public static void main(String[] args) {
        // 注意点
        // 1. 删除后不走回收站
        // 2. 如果删除的是文件 那么直接删除,如果删除的是文件夹那么只能删除空文件夹
        // 3. 如果想删除一个有内容的文件夹 只有 删除文件夹内的所有文件再删除文件夹

        method();
        // method1();
    }

    private static void method1() {
        File file = new File("java-jichu-test/src/com/vtf/service/test/io/txt/");
        boolean result = file.delete();
        System.out.println(result);
    }

    private static void method() {
        File file = new File("java-jichu-test/src/com/vtf/service/test/io/txt/a.txt");
        boolean result = file.delete();
        System.out.println(result);
    }
}
