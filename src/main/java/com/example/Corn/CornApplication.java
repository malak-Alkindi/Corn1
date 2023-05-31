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

		String cronn = "0 5 14 * * *";
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
		System.out.println("am here "+trigger.nextExecutionTime(context));
	}


}
