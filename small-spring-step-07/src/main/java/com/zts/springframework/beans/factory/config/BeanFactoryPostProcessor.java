package com.zts.springframework.beans.factory.config;

import com.zts.springframework.beans.BeansException;
import com.zts.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @Author zhangtusheng
 * @Date 2022 10 04 02 26
 * @describe：
 **/
public interface BeanFactoryPostProcessor {

    /**
     * 在所有的 BeanDefinition 加载完成后，实例化 Bean 对象之前，提供修改 BeanDefinition 属性的机制
     *
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
