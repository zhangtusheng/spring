package com.zts.springframework.beans.factory.support;

import com.zts.springframework.beans.factory.config.BeanDefinition;

/**
 * @Author zhangtusheng
 * @Date 2022 06 28 09 57
 * @describe：
 **/
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册BeanDefinition
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
