package com.zts.springframework.beans.factory;

import com.zts.springframework.beans.BeansException;
import com.zts.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.zts.springframework.beans.factory.config.BeanDefinition;
import com.zts.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @Author zhangtusheng
 * @Date 2022 10 06 21 44
 * @describe：
 **/
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

    void addBeanPostProcessor();
}
