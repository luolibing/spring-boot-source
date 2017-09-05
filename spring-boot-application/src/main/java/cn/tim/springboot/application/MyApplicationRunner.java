package cn.tim.springboot.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * User: luolibing
 * Date: 2017/9/5 16:38
 */
@Component
public class MyApplicationRunner implements ApplicationRunner {

    private final static Logger log = LoggerFactory.getLogger(MyApplicationRunner.class);

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("MyApplicationRunner args = " + args );
    }
}
