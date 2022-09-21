package com.zts.springframework.beans.factory.config;

/**
 * @Author zhangtusheng
 * @Date 2022 06 28 09 55
 * @describe：
 **/
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
