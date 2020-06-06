package com.vtf.test;

import com.vtf.job.PlanJob;
import lombok.val;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @ProjectName: test
 * @ClassName: TestQuartz
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-05-12 11:27
 */
public class TestQuartz {
    public static void main(String[] args) {
        JobBuilder jobBuilder = JobBuilder.newJob(PlanJob.class);

        // 产生实际能使用的job
        JobDetail build = jobBuilder.withIdentity("提醒业务", "group1").build();
        // 触发器:时间规则   依赖两个对象( TriggerBuilder , Schedulel )

        TriggerBuilder builder = TriggerBuilder.newTrigger();
        builder   = builder.withIdentity("会议触发器", "group1");
        builder.startNow();   // 满足条件时立刻执行
        // Schedulel 定义执行的周期或者时机
        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule();
        scheduleBuilder.withIntervalInSeconds(2);  // 每隔一秒执行一次
        scheduleBuilder.withRepeatCount(3);       // 一共执行 10+1 次

        // 产生触发器
        Trigger trigger = builder.withSchedule(scheduleBuilder).build();

        // 调度器( 工厂产生调度器 )
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();

        try {
            // 产生调度器
            Scheduler scheduler = schedulerFactory.getScheduler();
            // 通过调度器 将任务 和 触发器 以一一对应
            scheduler.scheduleJob(build,trigger);
            scheduler.start();
            Thread.sleep(12000);
            scheduler.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
