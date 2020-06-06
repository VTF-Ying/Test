package com.vtf.service.test.thread;

/**
 * @ProjectName: test
 * @ClassName: Thread01
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-05-06 15:09
 */
public class Thread01 {
    public static void main(String[] args) {
        // 创建线程实例
        ThreadDemo th = new ThreadDemo();
        // 修改线程名称
        th.setName("线程0");
        // 启动线程
        th.start();

        // 创建线程实例
        ThreadDemo th2 = new ThreadDemo();
        // 修改线程名称
        th2.setName("线程1");
        // 启动线程
        th2.start();
    }
}
