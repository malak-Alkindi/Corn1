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
    String cronn = "0 * * * * *";
    @Scheduled(cron = "0 * * * * *")
    public void schedule1() throws IOException {

        CronTrigger trigger = new CronTrigger(cronn);
        TriggerContext context = new TriggerContext() {

            public Date lastScheduledExecutionTime() {
                return null;
            }

            public Date lastActualExecutionTime() {
                return null;
            }

            public Date lastCompletionTime() {
                return null;
            }
        };
      //  System.out.println("am here "+trigger.nextExecutionTime(context));



    }
}
