package cn.tim.springboot.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * CommandLineRunner和ApplicationRunner的区别在于后者对参数进行了封装
 * User: luolibing
 * Date: 2017/9/5 16:44
 */
@Component
public class MyCommandLineRunner implements CommandLineRunner {
    private final static Logger log = LoggerFactory.getLogger(MyCommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception {
        log.info("MyApplicationRunner args = " + Arrays.toString(args));
    }
}
