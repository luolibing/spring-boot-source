package cn.tim.springboot.application.condition;

import org.springframework.boot.autoconfigure.condition.ConditionOutcome;
import org.springframework.boot.autoconfigure.condition.SpringBootCondition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Objects;

/**
 * conditionEvaluator条件加载的辅助类，调用入口为ConfigurationClassBeanDefinitionReader
 * User: luolibing
 * Date: 2017/9/6 10:02
 */
public class OnDatabaseCondition extends SpringBootCondition {

    private final static String conditionAnnotationClass =
            "cn.tim.springboot.application.condition.ConditionalOnDataBase";

    /**
     * 判断条件是否符合条件
     * @param context
     * @param metadata
     * @return
     */
    @Override
    public ConditionOutcome getMatchOutcome(ConditionContext context,
                                            AnnotatedTypeMetadata metadata) {
//        try {
//            // 判断是否引入了mysql jdbc的包
//            Class.forName("com.jdbc.mysql.Driver");
//            return ConditionOutcome.match();
//        } catch (ClassNotFoundException e) {
//            return ConditionOutcome.noMatch("jdbcClass Driver not in classPath");
//        }

        String database = context.getEnvironment().getProperty("database.type");
        String expectDatabase = (String)
                metadata.getAnnotationAttributes(conditionAnnotationClass).get("value");
        return (Objects.equals(database, expectDatabase)) ?
                ConditionOutcome.match() : ConditionOutcome.noMatch("no database.enable = true");
    }
}
