package com.zts.springframework.beans.factory.config;

/**
 * @Author zhangtusheng
 * @Date 2022 09 20 23 48
 * @describe：
 **/
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
