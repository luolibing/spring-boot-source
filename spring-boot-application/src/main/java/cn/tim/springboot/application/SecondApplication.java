package cn.tim.springboot.application;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * User: luolibing
 * Date: 2017/9/4 20:07
 */
@SpringBootApplication
public class SecondApplication implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("SecondApplication");
    }
}
