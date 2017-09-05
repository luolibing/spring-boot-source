package cn.tim.springboot.application;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * User: luolibing
 * Date: 2017/9/5 17:27
 */
@Component
public class MySchedule {

    @Scheduled(cron = "0 5/30 18-19 * * ?")
    public void say() {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
}
