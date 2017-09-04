package cn.tim.springboot.backup.sample;

import cn.tim.springboot.autoconfiguration.EnableWelcome;
import cn.tim.tools.backup.FileBackUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.file.Paths;

/**
 * User: luolibing
 * Date: 2017/9/4 13:36
 */
@EnableWelcome(criteria = EnableWelcome.BEAR)
@SpringBootApplication
public class BackupApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BackupApplication.class, args);
    }

    @Autowired
    private FileBackUp fileBackUp;

    @Override
    public void run(String... strings) throws Exception {
        fileBackUp.backUpTo(Paths.get("E:\\export"));
    }
}
