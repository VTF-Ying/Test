package com.vtf.test.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @ProjectName: test
 * @ClassName: Test3
 * @Description: TODO(文件字节的输入流)
 * @Author: VTF
 * @create: 2020-04-30 10:05
 */
public class Test3 {
    public static void main(String[] args) {
        String fiel = "D:/Test/IOTest/a/tt1.txt";
        testFileInPutStream(fiel);
        testFileOutPutStream();
    }

    // 文件字节输入流
    public static void testFileInPutStream(String a){
        File file = new File(a);
        Long i = file.length();
        try {
            FileInputStream in = new FileInputStream(a);
            byte[] b = new byte[Math.toIntExact(i)];  // 因为 是字节流 所以用 byte数组 接收 读取的文件内容

            /**
             *  in.read  方法有一个返回值 返回值是读取的数据长度
             *  如果读取到最后一个数据还会向后读一个  这个时候返回值是 -1
             *  也就意味着 当 in.read的返回值是 -1 的时候整个文件就读取完了
             **/


//            int i= in.read(b);
            System.out.println(new String(b,0,in.read(b)));
            in.close();    // 注意 流在使用过后一定要关闭
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 文件字节输出流
    public static void testFileOutPutStream(){
        try {
            FileOutputStream out = new FileOutputStream("D:/Test/IOTest/a/tt4.txt"); //指定向 tt4里 输出数据
            String str = " 最后还是她 陪我春秋冬夏 愈合我的伤疤 ";
            out.write(str.getBytes());  // 把 数据写到内存中
            
            /**
             * 数据先传入缓冲区 塞满后一块传到硬盘 重复多次
             * 若最后一组数据没塞满缓冲区 则会残留 此时close就会丢失其中的数据
             * 所以要先flush手动传输一次数据 清空缓冲区
             **/
            out.flush();  // 把内存中的数据刷写到硬盘
            out.close();  //关闭流
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
