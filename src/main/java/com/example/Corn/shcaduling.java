package com.example.Corn;


import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class shcaduling {
    @Scheduled(cron = "0 * * * * *")
    public void schedule1(){
        System.out.println("hello world" + new Date().getTime());
    }
}
