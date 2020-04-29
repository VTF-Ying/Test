package com.vtf.test.IO;

import java.io.File;
import java.io.IOException;

/**
 * @ProjectName: Test
 * @ClassName: test1
 * @Description: TODO(File类测试)
 * @Author: VTF
 * @create: 2020-04-29 16:27
 */
public class test1 {
    public static void main(String[] args) {
                                        // 也可以写成  D:/Test/IOTest/a/a.txt
        File f = new File("D:\\Test\\IOTest\\a\\a.txt"); //file这个时候 就是 a.txt
        File f1 = new File("src/com/vtf/test/IO/test1.java"); // 这是一个相对路径
        // 注意, \ 在文件中 是文件分隔符  在java 文件中 一个 \ 是 转移符   java文件中 的 分隔符 要用双斜杠 \\ 或反斜杠 / 来表示
        // File 只能操作文件 不能操作文件内容

        System.out.println(f.getName());  // 获取文件名或文件夹名称  getName()
        System.out.println(f.getPath());  // 获取文件名或文件夹路径  getPath()
        System.out.println(f1.getAbsolutePath()); // 获取当前文件的绝对路径
        System.out.println(f1);
        System.out.println(f1.getAbsoluteFile()); // 返回用当前文件的绝对路径构建的flie对象
        System.out.println(f1.getParent()); //返回当前文件或文件夹的 父级路径
        f.renameTo(new File("D:\\Test\\IOTest\\a\\tt1.txt"));// 给文件或文件夹重重命名
        File f2 = new File("D:\\Test\\IOTest\\a\\tt1.txt");
        System.out.println(f2.exists());  // 判断 文件 或者文件夹是否存在 存在 true 不存在 false
        System.out.println(f2.canWrite()); // 是否可写
        System.out.println(f2.canRead()); // 是否可读

        System.out.println(f2.isFile());  // 是否是文件
        System.out.println(f2.isDirectory()); //是否是文件夹

        System.out.println(f2.lastModified()); // 文件最后修改时间(返回的是毫秒数)
        System.out.println(f2.length());      // 文件长度 单位是字节数

        File f3 = new File("D:/Test/IOTest/a/sss.txt");
        System.out.println(f3.exists());
        if(!(f3.exists())){
            try {
                f3.createNewFile();  // 创建文件
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        f3.delete();  // 删除文件
        File f4 = new File("D:/Test/IOTest/cc");
        if(!(f4.exists())){
            f4.mkdir();  // 创建单层目录
        }
        File f5 = new File("D:/Test/a/b/c/d");
        f5.mkdirs();

        File f6 = new File("D:/Test");
        String[] fl =f6.list(); // 返回当前文件夹的子集  包括了目录和文件
        for (String s : fl) {
            System.out.println(s);
        }
        File[] fs = f6.listFiles();
        for (File file : fs) {
            System.out.println(file);
        }
    }
}
