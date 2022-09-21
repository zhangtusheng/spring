package com.zts.springframework.beans.factory.support;

import com.zts.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author zhangtusheng
 * @Date 2022 06 29 23 56
 * @describe：
 **/
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String , Object> singetonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singetonObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object singletonObject){
        singetonObjects.put(beanName, singletonObject);
    }
}
