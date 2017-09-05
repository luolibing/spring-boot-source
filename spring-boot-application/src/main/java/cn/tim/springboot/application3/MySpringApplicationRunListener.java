package cn.tim.springboot.application3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * User: luolibing
 * Date: 2017/9/5 15:52
 */
public class MySpringApplicationRunListener implements SpringApplicationRunListener {

    private final static Logger log = LoggerFactory.getLogger(MySpringApplicationRunListener.class);

    public MySpringApplicationRunListener(SpringApplication application, String[] args) {
    }

    @Override
    public void starting() {
        log.info("starting my application");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        log.info("env prepared env = " + environment);
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        log.info("context prepared context = " + context);
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        log.info("context finished load = " + context);
    }

    @Override
    public void finished(ConfigurableApplicationContext context, Throwable exception) {
        log.info("finished start context");
    }
}
