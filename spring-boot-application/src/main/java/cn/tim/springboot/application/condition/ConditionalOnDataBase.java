package cn.tim.springboot.application.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * User: luolibing
 * Date: 2017/9/6 10:21
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
// 自定义Condition注解，关键在于这个@Condition注解以及其中的OnDatabaseCondition类
@Conditional(OnDatabaseCondition.class)
public @interface ConditionalOnDataBase {

    /**
     * 数据库类型配置为mysql/mongodb/oracle
     * @return
     */
    String value();
}
