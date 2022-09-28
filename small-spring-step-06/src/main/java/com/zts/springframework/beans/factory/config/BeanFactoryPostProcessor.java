package com.zts.springframework.beans.factory.config;

import com.zts.springframework.beans.BeansException;
import com.zts.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @Author zhangtusheng
 * @Date 2022 09 20 23 47
 * @describe：
 **/
public interface BeanFactoryPostProcessor {

    /**
     * 在所有的BeanDefinition加载完成后，实例化Bean对象之前，提供修改BeanDefinition属性机制。
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
