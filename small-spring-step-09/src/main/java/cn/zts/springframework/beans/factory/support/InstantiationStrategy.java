package cn.zts.springframework.beans.factory.support;

import cn.zts.springframework.beans.BeansException;
import cn.zts.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @Author zhangtusheng
 * @Date 2023 04 26 00 07
 * @describe：
 **/
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}