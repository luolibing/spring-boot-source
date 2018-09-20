package cn.tim.springboot.autoconfiguration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * User: luolibing
 * Date: 2017/9/4 14:32
 */
@Configuration
public class WelcomeConfiguration {

    private final static Logger log = LoggerFactory.getLogger(WelcomeConfiguration.class);

    @Bean
    public String welcome() {
        String welcome = "  .   ____          _            __ _ _\n" +
                " /\\\\ / ___'_ __ _ _(_)_ __  __ _ \\ \\ \\ \\\n" +
                "( ( )\\___ | '_ | '_| | '_ \\/ _` | \\ \\ \\ \\\n" +
                " \\\\/  ___)| |_)| | | | | || (_| |  ) ) ) )\n" +
                "  '  |____| .__|_| |_|_| |_\\__, | / / / /\n" +
                " =========|_|==============|___/=/_/_/_/";
        log.info(welcome);
        return welcome;
    }
}
