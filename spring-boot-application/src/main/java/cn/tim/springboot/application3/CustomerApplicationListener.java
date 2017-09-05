package cn.tim.springboot.application3;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * User: luolibing
 * Date: 2017/9/5 15:32
 */
public class CustomerApplicationListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("customerApplicationListener event " + event);
    }
}
