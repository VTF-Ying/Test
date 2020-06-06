package com.vtf.service.test.thread;

/**
 * @ProjectName: test
 * @ClassName: Thread02
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-05-06 15:43
 */
public class Thread02 {
    public static void main(String[] args) {
        // 创建线程实例
        ThreadDemo2 mt = new ThreadDemo2();
        Thread t = new Thread(mt);
        t.setName("线程0");
        t.start();
        // 创建线程实例
        ThreadDemo2 mt1 = new ThreadDemo2();
        Thread t1 = new Thread(mt1);
        t1.setName("线程1");
        t1.start();
    }
}
