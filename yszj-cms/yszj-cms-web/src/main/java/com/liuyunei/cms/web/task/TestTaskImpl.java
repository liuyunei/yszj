package com.liuyunei.cms.web.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by liuyunei on 20168/04/01.
 */
@Component
public class TestTaskImpl {

    @Scheduled(cron = "0 0/10 * * * ?")
    public void test() {
        System.out.println("Task");
    }

}
