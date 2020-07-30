package com.vtf.service.test.io;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * @ProjectName: test
 * @ClassName: FileDemo7Test
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-07-30 15:51
 */
public class FileDemo7Test {
    public static void main(String[] args) throws IOException {
        String path = "D:\\img";
        File file  = new File("D:\\img");
        // addDir(path);
       deleteDir(file);
    }

    private static void addDir(String path) throws IOException {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }

        for (Integer integer : list) {
            path+= "\\"+ integer;
            File add = new File(path);
            add.mkdirs();
            File addtext = new File(add,integer+"text");
            addtext.createNewFile();
        }
    }

    private static void deleteDir(File file) {
        // 先删除文件夹里面的内容
        //注意：可以解决所有文件夹和 递归相结合的题目
            // 1.进入 --- 得到文件夹里面所有的内容
        File[] files = file.listFiles();
            // 2.遍历得到文件夹下每一个文件或文件夹
        for (File file1 : files) {
            System.out.println(file1);
            if (file1.isFile()){
                // 3.判断 --- 如果遍历到File对象是一个 文件 那么直接删除
                file1.delete();
                System.out.println("文件"+file1+"已删除");
            }else{
                deleteDir(file1);
                System.out.println("文件夹"+file1+"已删除");
            }
        }
        // 最后再删除这个文件
        file.delete();
    }
}
