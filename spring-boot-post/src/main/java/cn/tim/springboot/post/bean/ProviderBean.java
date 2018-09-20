package cn.tim.springboot.post.bean;

import cn.tim.springboot.post.config.ProviderConfig;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import java.lang.reflect.Method;

/**
 * Created by luolibing on 2018/9/20.
 */
public class ProviderBean extends ProviderConfig implements InitializingBean, DisposableBean, ApplicationContextAware, ApplicationListener {
    @Override
    public void destroy() throws Exception {
        System.out.println("解除注册");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("发布服务到server");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        try {
            // 这个操作有点诡异，不合适吧，applicationContext本身并没有这个方法，但是因为知道最终实现的类会定义这么个方法，所以这样来操作， TODO 应该还有其他的方式
            Method method = applicationContext.getClass().getMethod("addApplicationListener", ApplicationListener.class);
            method.invoke(applicationContext, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        if(applicationEvent instanceof ContextRefreshedEvent) {
            // 如果是延迟发布，并且现在还没有发布的情况下，进行发布
            System.out.println("延迟发布");
        }
    }
}
