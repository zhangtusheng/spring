package com.zts.springframework.beans.factory.config;

/**
 * @Author zhangtusheng
 * @Date 2022 06 29 22 14
 * @describe：
 **/
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
