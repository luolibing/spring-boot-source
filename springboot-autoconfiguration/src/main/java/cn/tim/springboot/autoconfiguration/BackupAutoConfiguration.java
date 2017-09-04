package cn.tim.springboot.autoconfiguration;

import cn.tim.tools.backup.FileBackUp;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

import java.nio.file.Paths;

/**
 * 由配置来进行触发，同时导入BackupProperties配置
 * User: luolibing
 * Date: 2017/9/4 11:34
 */
@Configuration
@ConditionalOnProperty(prefix = "backup", name = "enable", matchIfMissing = false)
@EnableConfigurationProperties({BackupProperties.class})
public class BackupAutoConfiguration {

    @Bean
    public FileBackUp fileBackUp(BackupProperties backupProperties) {
        if(StringUtils.isEmpty(backupProperties.getSourcePath())) {
            return new FileBackUp(Paths.get(System.getProperty("user.dir")));
        }
        return new FileBackUp(Paths.get(backupProperties.getSourcePath()));
    }
}
