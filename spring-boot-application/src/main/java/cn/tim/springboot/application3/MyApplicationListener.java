package cn.tim.springboot.application3;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * User: luolibing
 * Date: 2017/9/5 15:18
 */
public class MyApplicationListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("receive applicationEvent " + event);
    }
}
