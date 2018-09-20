package cn.tim.springboot.application.condition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * User: luolibing
 * Date: 2017/9/6 10:28
 */
@Configuration
@ConditionalOnProperty(name = "database.enable", havingValue = "true", matchIfMissing = false)
@EnableConfigurationProperties(DataBaseProperties.class)
public class DatabaseAutoConfiguration {

    private final static Logger log = LoggerFactory.getLogger(DatabaseAutoConfiguration.class);

    @Bean
    public Database database(DataBaseProperties properties) {
        Database database = new Database();
        database.setHost(properties.getHost());
        database.setPort(properties.getPort());
        database.setUser(properties.getUser());
        database.setPass(properties.getPass());
        log.info("enable mysql with properties = [{}]", properties);
        return database;
    }

    @Bean
    @ConditionalOnDataBase("mysql")
    public DataDao mysqlDao(Database database) {
        return new MySQLDao(database);
    }

    @Bean
    @ConditionalOnDataBase("mongo")
    public DataDao mongoDao(Database database) {
        return new MongoDao(database);
    }
}
