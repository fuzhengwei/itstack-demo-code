package org.itstack.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoTask {

    private Logger logger = LoggerFactory.getLogger(DemoTask.class);

    public void execute() throws Exception{
        logger.info("定时处理用户信息任务：0/5 * * * * ?");
    }

}
