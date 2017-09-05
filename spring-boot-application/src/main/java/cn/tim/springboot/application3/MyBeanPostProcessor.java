package cn.tim.springboot.application3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * User: luolibing
 * Date: 2017/9/5 15:06
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    private final static Logger log = LoggerFactory.getLogger(MyBeanPostProcessor.class);

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("before initialization {} bean", beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("after initialization {} bean", beanName);
        return bean;
    }
}
