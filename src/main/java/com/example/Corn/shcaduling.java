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

    @Scheduled(cron = "0 0 9-17 * 11 0-5")
    public void schedule1() throws IOException {


       System.out.println("Problem 49: Write a CRON expression that runs a job at 3:00 AM on weekdays in the month of\n" +
               "//\t\tNovember.");



    }
}
