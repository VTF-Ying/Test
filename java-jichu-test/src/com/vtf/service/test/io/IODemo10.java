package com.vtf.service.test.io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @ProjectName: logtest
 * @ClassName: IODemo10
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-08-04 12:09
 */
public class IODemo10 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("java-jichu-test/src/com/vtf/service/test/io/txt/c.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入账户");
        String root = sc.next();
        System.out.println("请输入密码");
        String pwd = sc.next();
        String str1 = "账号:"+root;
        String str2 = "密码:"+pwd;

        fw.write(str1);
        fw.write("\r\n");
        fw.write(str2);
        fw.close();
    }
}
