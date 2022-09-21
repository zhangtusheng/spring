package com.zts.springframework.beans.factory.support;

import com.zts.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author zhangtusheng
 * @Date 2022 06 28 09 58
 * @describe：
 **/
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private final Map<String , Object> singletonObjects = new HashMap<>();


    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }
}
