package com.vtf.test.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @ProjectName: test
 * @ClassName: NetWork01
 * @Description: TODO(InetAddress 表示互联网协议IP地址)
 * @Author: VTF
 * @create: 2020-05-06 16:05
 */
public class NetWork01 {
    public static void main(String[] args) {
        try {
            InetAddress PCIp = InetAddress.getByName("KYE-1000656553.ky-tech.com.cn");
            InetAddress PCName = InetAddress.getByName("6.1.1.1"); // ip地址是唯一的 而 主机名 不一定唯一
            System.out.println(PCIp);
            System.out.println(PCName);

            String hostAddress = PCName.getHostAddress();
            String hostName = PCName.getHostName();
            System.out.println(hostAddress);
            System.out.println(hostName);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
