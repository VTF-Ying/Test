package com.vtf.service.test.io;

import java.io.File;

/**
 * @ProjectName: test
 * @ClassName: FileDemo5
 * @Description: TODO(File 的高级获取功能  listFile)
 * @Author: VTF
 * @create: 2020-07-30 15:22
 */
public class FileDemo5 {
    /**
     * public File[] listFiles()
     **/
    public static void main(String[] args) {
        File file = new File("D:\\");
        File[] files = file.listFiles();  // 返回一个File类型数组
        for (File file1 : files) {
            System.out.println(file1);
        }

        // 进入文件夹,获取这个文件里面所有的文件和文件夹的File对象   并把这些File对象都放在一个 数组中返回
        // 包括隐藏文件和隐藏文件夹 都可以获取

        // 此方法注意事项:
            // 1. 当调用者是一个文件时                         会报空指针异常
            // 2. 当调用者是一个空文件夹时                     会返回数组长度0
            // 3. 当调用者是一个有权限才能进入的文件件时       会返回 null


    }
}
