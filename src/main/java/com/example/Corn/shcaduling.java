package com.example.Corn;


import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.support.CronExpression;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class shcaduling {
    @Scheduled(cron = "0 */5 * * * *")
    public void schedule1(){
        String exp = "0 0 0 1 1 ? 3000";
        boolean valid = CronExpression.isValidExpression(exp);
        System.out.println(valid);

        System.out.println("job run");
    }
}
