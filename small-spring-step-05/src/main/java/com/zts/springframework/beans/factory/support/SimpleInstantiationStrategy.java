package com.zts.springframework.beans.factory.support;

import com.zts.springframework.beans.BeansException;
import com.zts.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author zhangtusheng
 * @Date 2022 07 02 16 33
 * @describe：
 **/
public class SimpleInstantiationStrategy implements InstantiationStrategy{
    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException {
        Class clazz = beanDefinition.getBeanClass();
        try{
            if(null != ctor){
                return clazz.getDeclaredConstructor(ctor.getParameterTypes()).newInstance();
            }else{
                return clazz.getDeclaredConstructor().newInstance();
            }
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e){
            throw new BeansException("Failed to instantiate [" + clazz.getName() + "]", e);
        }
    }
}
