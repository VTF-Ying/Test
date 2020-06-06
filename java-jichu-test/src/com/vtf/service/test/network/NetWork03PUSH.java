package com.vtf.service.test.network;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @ProjectName: test
 * @ClassName: NetWork03PUSH
 * @Description: TODO(使用TCP协议发送数据)
 * @Author: VTF
 * @create: 2020-05-06 18:16
 */
public class NetWork03PUSH {
    public static void main(String[] args) throws Exception {
        // 创建发送端 Socket 对象
        Socket s = new Socket(InetAddress.getByName("KYE-1000656553.ky-tech.com.cn"), 10086);
        // 获取输出流对象
        OutputStream os = s.getOutputStream();
        // 发送数据
        String str = "hello tcp,im comming!!!";
        os.write(str.getBytes());
        // 释放资源
        //os.close();
        s.close();
    }
}
