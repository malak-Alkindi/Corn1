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
//		Problem 49: Write a CRON expression that runs a job at 3:00 AM on weekdays in the month of
//		November.
				//"s m h dom m dow"
		String cronn = "0 0 3 * 11 0-5";
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
		System.out.println("next time is "+trigger.nextExecutionTime(context));
	}


}
