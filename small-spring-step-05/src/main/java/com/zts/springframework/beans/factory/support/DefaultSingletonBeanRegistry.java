package com.zts.springframework.beans.factory.support;

import com.zts.springframework.beans.factory.config.BeanDefinition;
import com.zts.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author zhangtusheng
 * @Date 2022 07 02 16 44
 * @describe：
 **/
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> singletonObjects = new HashMap<>();
    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object beanDefinition){
        singletonObjects.put(beanName, beanDefinition);
    }
}
