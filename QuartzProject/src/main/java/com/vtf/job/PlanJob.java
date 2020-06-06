package com.vtf.job;

import com.vtf.service.MeetingService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @ProjectName: test
 * @ClassName: planjob
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-05-12 11:24
 */
public class PlanJob implements Job {
    MeetingService meetingService = new MeetingService();
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        // 存放计划执行的任务…………
        meetingService.calClassMeeting();
    }
}
