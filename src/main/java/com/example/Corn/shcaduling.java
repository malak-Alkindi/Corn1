package com.example.Corn;



import it.sauronsoftware.cron4j.CronParser;
import org.joda.time.DateTime;
import org.springframework.scheduling.TriggerContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.support.CronExpression;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.Date;




@Component
public class shcaduling {

    @Scheduled(cron = "0 30 13 ? * fri#4")
    public void schedule1() throws IOException {


       System.out.println("Problem 47: Write a CRON expression that runs a job at 1:30 PM on the second to last Friday of every \n" +
               "month.");



    }
}
