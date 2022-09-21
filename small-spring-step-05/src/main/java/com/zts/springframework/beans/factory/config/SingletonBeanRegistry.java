package com.zts.springframework.beans.factory.config;

/**
 * @Author zhangtusheng
 * @Date 2022 07 02 16 15
 * @describe：单例注册表
 **/
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
