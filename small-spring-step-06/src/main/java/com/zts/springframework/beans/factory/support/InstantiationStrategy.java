package com.zts.springframework.beans.factory.support;

import com.zts.springframework.beans.BeansException;
import com.zts.springframework.beans.factory.config.BeanDefinition;
import com.zts.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Constructor;

/**
 * @Author zhangtusheng
 * @Date 2022 09 20 23 49
 * @describe：
 **/
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
