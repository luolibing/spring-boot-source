package cn.tim.springboot.application3;

/**
 * spring boot jar包启动的原理
 *
 Manifest-Version: 1.0
 Archiver-Version: Plexus Archiver
 Built-By: luolibing
 Start-Class: cn.tim.springboot.backup.sample.BackupApplication
 Spring-Boot-Classes: BOOT-INF/classes/
 Spring-Boot-Lib: BOOT-INF/lib/
 Spring-Boot-Version: 1.5.6.RELEASE
 Created-By: Apache Maven 3.5.0
 Build-Jdk: 1.8.0_45
 Main-Class: org.springframework.boot.loader.JarLauncher

 * 使用spring boot maven打包，会将以上内容在MANIFEST.MF指定，这样使用java -jar启动的时候就能够知道main-class在哪了
 * 对应的main-class为 org.springframework.boot.loader.JarLauncher类。
 * 最终需要找到start-class，然后调用这个类的main方法，所以这就是为什么需要在maven里面配置一个mainClass配置的原因
 * User: luolibing
 * Date: 2017/9/7 14:49
 */
public class JarApplication {

    public static void main(String[] args) {
        System.out.println("jar appliaction");
    }
}
