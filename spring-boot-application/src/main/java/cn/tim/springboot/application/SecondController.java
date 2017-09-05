package cn.tim.springboot.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: luolibing
 * Date: 2017/9/5 9:14
 */
@RestController
public class SecondController {

    @GetMapping("/second")
    public Object second() {
        return "";
    }
}
