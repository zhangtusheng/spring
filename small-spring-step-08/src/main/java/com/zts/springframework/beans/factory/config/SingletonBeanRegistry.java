package com.zts.springframework.beans.factory.config;

/**
 * @Author zhangtusheng
 * @Date 2022 10 06 22 11
 * @describe：
 **/
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

    void registerSingleton(String beanName, Object singletonObject);
}
