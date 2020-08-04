package com.vtf.service.test.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @ProjectName: logtest
 * @ClassName: IODemo8
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-08-04 11:53
 */
public class IODemo8 {
    public static void main(String[] args) throws IOException {
        // flush() 刷新流  刷新完毕后 还可以继续写数据
        // close() 关闭流 释放资源  一旦关闭 就不能写数据
        FileWriter fw = new FileWriter("java-jichu-test/src/com/vtf/service/test/io/txt/c.txt");
        fw.write("黑马程序员");
        fw.flush();
        fw.write("666");
        fw.flush();

        fw.close();
    }
}
