package com.vtf.service.test.io;

import java.io.*;

/**
 * qq交流群215383682
 *
 * @author xeclass
 * @date 2020-07-31 20:11
 */
public class TestDemo2 {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream("D:\\local\\a.txt");
        BufferedInputStream bis = new BufferedInputStream(inputStream); //默认有8M的缓存
        FileOutputStream outputStream = new FileOutputStream("D:\\local\\d.txt");
        BufferedOutputStream bos = new BufferedOutputStream(outputStream);
        int len;

        byte[] bs = new byte[1];
        long start = System.currentTimeMillis();
        while ((len = bis.read(bs)) != -1) {
            bos.write(bs, 0, len); //先从硬盘读出8M到缓存中。然后read，这里的read并不是从硬盘中读取，而是从那8M缓存（内存）中读取，自然要比从硬盘中快得多。8M缓存用完后又会从硬盘补充（也就是说，一次从硬盘获取8M字节的数据） 。每8M与硬盘交互一次
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时" + (end - start) + "毫秒");
    }
}
