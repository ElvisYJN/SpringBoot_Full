package com.xinhuanet.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleTask {

    private Logger logger = LoggerFactory.getLogger(ScheduleTask.class);

    @Scheduled(cron = "0 0/10 * * * ?")
    public void task1() {
        logger.info("task1执行啦~");
    }
}
