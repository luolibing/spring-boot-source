package cn.tim.springboot.application3;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * User: luolibing
 * Date: 2017/9/5 15:04
 */
public class CustomerApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        applicationContext.addApplicationListener(new MyApplicationListener());
    }
}
