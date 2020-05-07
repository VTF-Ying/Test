package com.vtf.test.network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @ProjectName: test
 * @ClassName: NetWork02PULL
 * @Description: TODO(使用UDP协议接收数据)
 * @Author: VTF
 * @create: 2020-05-06 17:54
 */
public class NetWork02PULL {
    public static void main(String[] args) {
        try {
            // 创建接收端 Socket 对象
            DatagramSocket ds = new DatagramSocket(8888);
            // 创建要接收的包的对象
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys,bys.length);
            System.out.println("-------------------");
            ds.receive(dp);
            System.out.println("===================");
            // 解析数据
            InetAddress address = dp.getAddress();
            byte[] data = dp.getData();
            int length = dp.getLength();
            // 输出数据
            System.out.println("sender" +"----------->"+ address.getHostAddress());
            System.out.println(new String(data,0,length));
            //释放资源
            ds.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
