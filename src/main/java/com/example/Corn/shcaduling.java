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

    @Scheduled(cron = "0 30 19,22 * * SUN")
    public void schedule1() throws IOException {


       System.out.println("Problem 6: CRON expression for running a job every Sunday at 7:30 PM and 10:30 PM:");



    }
}
