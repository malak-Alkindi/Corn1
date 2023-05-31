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
//		Problem 45: Write a CRON expression that runs a job at 8:00 AM every day, except for the last day of the
//month.
		String cronn = "0 0 08 L-1 * ?";

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
