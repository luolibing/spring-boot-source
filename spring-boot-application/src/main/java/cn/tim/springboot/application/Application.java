package cn.tim.springboot.application;

import cn.tim.springboot.application2.FirstApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Arrays;

/**
 * User: luolibing
 * Date: 2017/9/4 18:43
 */
@SpringBootApplication
@EnableScheduling
public class Application {

    public static void main(String[] args) {
        // 用一项目，2个上下文
        System.out.println(Arrays.toString(args));
        if(args.length == 0) {
            SpringApplication.run(SecondApplication.class, args);
        } else if(args.length == 2) {
            SpringApplication.run(new Object[] {FirstApplication.class, SecondApplication.class}, args);
        } else {
            SpringApplication.run(FirstApplication.class, args);
        }
    }
}
