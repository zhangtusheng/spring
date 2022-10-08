package com.zts.springframework.beans.factory.support;

import com.zts.springframework.beans.BeansException;
import com.zts.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @Author zhangtusheng
 * @Date 2022 10 04 03 03
 * @describe：
 **/
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
