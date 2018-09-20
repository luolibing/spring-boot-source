package cn.tim.springboot.autoconfiguration;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Objects;

/**
 * User: luolibing
 * Date: 2017/9/4 14:42
 */
public class WelcomeConfigurationSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        AnnotationAttributes annotationAttributes = AnnotationAttributes.fromMap(
                importingClassMetadata.getAnnotationAttributes(EnableWelcome.class.getName(), false));
        String criteria = annotationAttributes.getString("criteria");
        if(Objects.equals(criteria, EnableWelcome.BEAR)) {
            return new String[] {"cn.tim.springboot.autoconfiguration.BearWelcomeConfiguration"};
        } else {
            return new String[] {"cn.tim.springboot.autoconfiguration.WelcomeConfiguration"};
        }
    }
}
