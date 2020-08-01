package com.vtf.service.test.io;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;


import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ProjectName: test
 * @ClassName: IODemo1
 * @Description: TODO(字节流写文件最基本的方式)
 * @Author: VTF
 * @create: 2020-07-30 17:19
 */
public class IODemo1 {
    public static void main(String[] args) throws IOException {
        // 1.创建字节输出流的对象
        // 注意点
        // 1.如果文件不存在 会帮我们自动创建出来
        // 2. 如果文件存在，会把文件清空
        FileOutputStream fors = new FileOutputStream("D:\\local\\a.txt");
        // 2.写数据 write();      传递一个整数时 那么实际上写到文件中的  是这个整数在码表中对应的那个字符
        fors.write(97);
        // 3.释放资源
        fors.close();   // 告诉操作系统，我现在已经不再用这个文件了
    }
}
