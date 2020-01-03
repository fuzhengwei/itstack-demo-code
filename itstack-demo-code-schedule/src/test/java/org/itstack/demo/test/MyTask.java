package org.itstack.demo.test;

import org.itstack.demo.DemoTask;
import org.quartz.JobDetail;
import org.quartz.impl.JobDetailImpl;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import java.io.IOException;
import java.text.ParseException;

public class MyTask {

    public static void main(String[] args) throws Exception {

        DemoTask demoTask = new DemoTask();

        // 定义了；执行的内容(job)
        MethodInvokingJobDetailFactoryBean methodInvokingJobDetailFactoryBean = new MethodInvokingJobDetailFactoryBean();
        methodInvokingJobDetailFactoryBean.setTargetObject(demoTask);
        methodInvokingJobDetailFactoryBean.setTargetMethod("execute");
        methodInvokingJobDetailFactoryBean.setConcurrent(true);
        methodInvokingJobDetailFactoryBean.setName("demoTask");
        methodInvokingJobDetailFactoryBean.afterPropertiesSet();

        // 定义了；执行的计划(trigger)
        CronTriggerFactoryBean cronTriggerFactoryBean = new CronTriggerFactoryBean();
        cronTriggerFactoryBean.setJobDetail(methodInvokingJobDetailFactoryBean.getObject());
        cronTriggerFactoryBean.setCronExpression("0/50 * * * * ?");
        cronTriggerFactoryBean.setName("demoTask");
        cronTriggerFactoryBean.afterPropertiesSet();

        // 调度了；执行的计划(scheduler)
        SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
        schedulerFactoryBean.setTriggers(cronTriggerFactoryBean.getObject());
        schedulerFactoryBean.setAutoStartup(true);
        schedulerFactoryBean.afterPropertiesSet();

        schedulerFactoryBean.start();

        // 暂停住
        System.in.read();

    }

}
