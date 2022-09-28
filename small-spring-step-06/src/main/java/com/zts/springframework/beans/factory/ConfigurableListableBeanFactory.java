package com.zts.springframework.beans.factory;

import com.zts.springframework.beans.BeansException;
import com.zts.springframework.beans.factory.config.AutowirecapableBeanFactory;
import com.zts.springframework.beans.factory.config.BeanDefinition;
import com.zts.springframework.beans.factory.config.BeanPostProcessor;
import com.zts.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @Author zhangtusheng
 * @Date 2022 09 20 23 52
 * @describe：
 **/
public interface ConfigurableListableBeanFactory extends
        ListableBeanFactory, AutowirecapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);
}
