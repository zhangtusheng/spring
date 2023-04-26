package cn.zts.springframework.context.support;

import cn.zts.springframework.beans.BeansException;
import cn.zts.springframework.beans.factory.config.BeanPostProcessor;
import cn.zts.springframework.context.ApplicationContext;
import cn.zts.springframework.context.ApplicationContextAware;

/**
 * @Author zhangtusheng
 * @Date 2023 04 26 23 09
 * @describe：
 **/
public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware){
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

}