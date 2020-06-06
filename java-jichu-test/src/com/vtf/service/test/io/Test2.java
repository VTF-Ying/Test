package com.vtf.service.test.io;

import java.io.File;

/**
 * @ProjectName: Test
 * @ClassName: Tset2
 * @Description: TODO(IO练习)
 * @Author: VTF
 * @create: 2020-04-29 19:28
 */
public class Test2 {
    public static void main(String[] args) {
        File file = new File("D:/Test");
        test(file);
    }

    /**
     * 递归遍历文件
     **/
    public static void test(File file) {
        if (file.isFile()) {
            System.out.println(file.getAbsolutePath() + "是文件");
        } else {
            System.out.println(file.getAbsolutePath() + "是文件夹");
            //如果是文件夹 这个文件夹就有可能有子文件夹或者文件
            File[] fs = file.listFiles(); //获取当前文件夹下的子文件夹或者文件的file对象
            if (fs != null && fs.length > 0) {
                for (File ff : fs) {
                    test(ff);
                }
            }
        }
    }
}
