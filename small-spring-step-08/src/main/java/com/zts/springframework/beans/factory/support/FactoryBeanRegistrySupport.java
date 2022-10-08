package com.zts.springframework.beans.factory.support;

import com.zts.springframework.beans.BeansException;
import com.zts.springframework.beans.factory.FactoryBean;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author zhangtusheng
 * @Date 2022 10 06 22 58
 * @describe：
 **/
public abstract class FactoryBeanRegistrySupport extends DefaultSingletonBeanRegistry{

    private final Map<String, Object> factoryBeanObjectCache = new ConcurrentHashMap<>();

    protected Object getCachedObjectForFactoryBean(String beanName) {
        Object object = this.factoryBeanObjectCache.get(beanName);
        return (object != NULL_OBJECT ? object : null);
    }

    protected Object getObjectFromFactoryBean(FactoryBean factory, String beanName){
        if (factory.isSingleton()) {
            Object object = this.factoryBeanObjectCache.get(beanName);
            if (null == object){
                object = doGetObjectFromFactoryBean(factory, beanName);
                this.factoryBeanObjectCache.put(beanName, (object!=null) ? object : NULL_OBJECT);
            }
            return (object != NULL_OBJECT ? object : null);
        }else{
            return doGetObjectFromFactoryBean(factory, beanName);
        }
    }

    private Object doGetObjectFromFactoryBean(final FactoryBean factory, final String beanName) {
        try{
            return factory.getObject();
        } catch (Exception e) {
            throw new BeansException("FactoryBean threw exception on Object [" + beanName + "] creation", e);
        }
    }
}
