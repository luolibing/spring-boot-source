package cn.tim.springboot.application;

import cn.tim.springboot.application2.FirstApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

/**
 * User: luolibing
 * Date: 2017/9/4 18:43
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        if(args == null || args.length == 0) {
            SpringApplication.run(SecondApplication.class, args);
        } else {
            SpringApplication.run(FirstApplication.class, args);
        }
    }
}
