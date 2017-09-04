package cn.tim.springboot.autoconfiguration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * User: luolibing
 * Date: 2017/9/4 14:52
 */
@Configuration
public class BearWelcomeConfiguration {

    private final static Logger log = LoggerFactory.getLogger(WelcomeConfiguration.class);

    @Bean
    public String welcome() {
        String welcome = "     _______.___________.    ___      .______         \n" +
                "    /       |           |   /   \\     |   _  \\        \n" +
                "   |   (----`---|  |----`  /  ^  \\    |  |_)  |       \n" +
                "    \\   \\       |  |      /  /_\\  \\   |      /        \n" +
                ".----)   |      |  |     /  _____  \\  |  |\\  \\----.   \n" +
                "|_______/       |__|    /__/     \\__\\ | _| `._____|   \n" +
                "                                                      \n" +
                "____    __    ____  ___      .______          _______.\n" +
                "\\   \\  /  \\  /   / /   \\     |   _  \\        /       |\n" +
                " \\   \\/    \\/   / /  ^  \\    |  |_)  |      |   (----`\n" +
                "  \\            / /  /_\\  \\   |      /        \\   \\    \n" +
                "   \\    /\\    / /  _____  \\  |  |\\  \\----.----)   |   \n" +
                "    \\__/  \\__/ /__/     \\__\\ | _| `._____|_______/    ";
        log.info(welcome);
        return welcome;
    }
}
