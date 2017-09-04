package cn.tim.springboot.autoconfiguration;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * User: luolibing
 * Date: 2017/9/4 14:19
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
// 这样做的目的，可以将WelcomeConfiguration纳入到spring管理
// 如果不加这个就必须得在springApplication中添加包扫描。这样做至少可以省略掉对应的包扫描
@Import({WelcomeConfigurationSelector.class})
public @interface EnableWelcome {

    String DEFAULT = "default";

    String BEAR = "bear";

    /**
     * 默认使用哪种方式
     * @return
     */
    String criteria() default "";
}
