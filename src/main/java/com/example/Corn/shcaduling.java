package com.example.Corn;


import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.support.CronExpression;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class shcaduling {
    @Scheduled(cron = "0 * * * * *")
    public void schedule1(){
        String exp = "0 * * * * *";
        DateTime now = DateTime.now();
        CronDefinition cronDefinition = CronDefinitionBuilder.instanceDefinitionFor(QUARTZ);
        CronParser parser = new CronParser(cronDefinition);
        ExecutionTime executionTime = ExecutionTime.forCron(parser.parse("* * * * * * *"));
        DateTime nextExecution = executionTime.nextExecution(now));
        System.out.println(CronExpression.parse(exp));
        System.out.println("job   run");
    }
}
