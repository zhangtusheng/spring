package com.zts.springframework.beans.factory.support;

import com.zts.springframework.beans.factory.config.BeanDefinition;

/**
 * @Author zhangtusheng
 * @Date 2022 06 30 22 28
 * @describe：
 **/
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册BeanDefinition
     * @param beanName
     * @param beanDefinition
     */
    void registryBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
