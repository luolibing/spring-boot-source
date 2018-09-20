package cn.tim.springboot.autoconfiguration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * User: luolibing
 * Date: 2017/9/4 11:28
 */
@ConfigurationProperties(prefix = "backup")
public class BackupProperties {

    private String sourcePath;

    private boolean enable;

    public String getSourcePath() {
        return sourcePath;
    }

    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

}
