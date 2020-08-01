package com.vtf.service.test.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ProjectName: test
 * @ClassName: IODemo3
 * @Description: TODO(字节流读取 步骤)
 * @Author: VTF
 * @create: 2020-07-31 14:06
 */

// java 运行在内存中
// 所以 内存 到硬盘叫 输出流
// 硬盘 到 内存 叫输入流
public class IODemo3 {
    public static void main(String[] args) throws IOException {
        // 1. 创建字节输入流对象  读取的文件一定要存在 不然会报错
        FileInputStream fis = new FileInputStream("D:\\local\\a.txt");
        // 2. 读取
        int read = fis.read(); // 读取第一个字节 返回的是字符在码表中对应的那个数字
        System.out.println(read);
        System.out.println((char) read);  // 如果想返回字符就 需要强转
        // 3.释放资源
        fis.close();
    }
}
