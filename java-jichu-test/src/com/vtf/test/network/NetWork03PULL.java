package com.vtf.test.network;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ProjectName: test
 * @ClassName: NetWork03PULL
 * @Description: TODO(使用TCP协议接收数据)
 * @Author: VTF
 * @create: 2020-05-06 18:16
 */
public class NetWork03PULL {
    public static void main(String[] args) throws Exception {
        // 创建 Socket 对象
        ServerSocket ss = new ServerSocket(10086);
        // 监听
        Socket s = ss.accept();
        //获取输入流对象
        InputStream is = s.getInputStream();
        // 获取数据
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        // 输出数据
        InetAddress address = s.getInetAddress();
        System.out.println("clent---->" + address);
        System.out.println(new String(bys,0,len));
        s.close();
        ss.close();
    }
}
