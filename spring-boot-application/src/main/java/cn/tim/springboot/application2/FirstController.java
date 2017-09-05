package cn.tim.springboot.application2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: luolibing
 * Date: 2017/9/5 9:13
 */
@RestController
public class FirstController {

    @GetMapping("/first")
    public Object first() {
        return "";
    }
}
