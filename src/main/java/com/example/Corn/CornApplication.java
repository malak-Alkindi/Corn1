package com.example.Corn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.TriggerContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.support.CronTrigger;

import java.util.Date;

@EnableScheduling
@SpringBootApplication
public class CornApplication {

	public static void main(String[] args) {
		SpringApplication.run(CornApplication.class, args);
//Problem 50: Write a CRON expression that runs a job every 10 minutes between 9:00 AM and 5:00 PM
//on weekdays.
		//"s m h dom m dow"
		String cronn = "0 10 9-17 * * 0-5";
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
		System.out.println("next time is"+trigger.nextExecutionTime(context));
	}


}
