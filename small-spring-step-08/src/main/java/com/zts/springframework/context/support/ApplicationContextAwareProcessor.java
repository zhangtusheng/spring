package com.zts.springframework.context.support;

import com.zts.springframework.beans.BeansException;
import com.zts.springframework.beans.factory.config.BeanPostProcessor;
import com.zts.springframework.context.ApplicationContext;
import com.zts.springframework.context.ApplicationContextAware;

/**
 * @Author zhangtusheng
 * @Date 2022 10 07 17 04
 * @describe：
 **/
public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware) {
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
