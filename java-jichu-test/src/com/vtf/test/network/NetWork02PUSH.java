package com.vtf.test.network;

import java.net.*;

/**
 * @ProjectName: test
 * @ClassName: NetWork02
 * @Description: TODO(使用UDP协议发送数据)
 * @Author: VTF
 * @create: 2020-05-06 16:26
 */
public class NetWork02PUSH {
    // DatagramSocket 此类表示用来发送和接收数据 基于UDP协议的
    // DatagramSocket() : 创建 Scoket 对象并随机分配端口号
    // DatagramSocket(int port) : 创建Scoket对象并指定端口号
    public static void main(String[] args) {
        try {
            // 创建 发送消息端 Scoket 对象
            DatagramSocket ds = new DatagramSocket();
            /**
             * 创建数据并打包
             * DatagramPacker : 这类表示一个数据报包。
             *  数据 byte[]
             *  设备的地址ip
             *  进程的地址 (端口号)
             *
             **/
            String s = "Hello";
            byte[] bys = s.getBytes();
            int length = bys.length;
            InetAddress byName = InetAddress.getByName("KYE-1000656553.ky-tech.com.cn");// 发送给 这个设配
            int port = 8888;
            // 打包
            DatagramPacket dp = new DatagramPacket(bys,length,byName,port);
            // 发送数据
            ds.send(dp);
            // 释放资源
            ds.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
