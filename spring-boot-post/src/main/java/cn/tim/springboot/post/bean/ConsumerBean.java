package cn.tim.springboot.post.bean;

import cn.tim.springboot.post.config.ConsumerConfig;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by luolibing on 2018/9/20.
 */
public class ConsumerBean extends ConsumerConfig implements InitializingBean, DisposableBean, FactoryBean, ApplicationContextAware, BeanNameAware {
    @Override
    public void setBeanName(String s) {

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("销毁consumer");
    }

    @Override
    public Object getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
