package org.itstack.demo;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JobImpl implements Job {

    private Logger logger = LoggerFactory.getLogger(JobImpl.class);

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        logger.info("定时处理用户信息任务：0/2 * * * * ?");
    }

}
