package com.vtf.test.thread;

/**
 * @ProjectName: test
 * @ClassName: Thread02
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-05-06 15:39
 */
public class ThreadDemo2 implements Runnable
{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
