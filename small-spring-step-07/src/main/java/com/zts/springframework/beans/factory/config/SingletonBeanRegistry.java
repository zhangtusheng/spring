package com.zts.springframework.beans.factory.config;

/**
 * @Author zhangtusheng
 * @Date 2022 10 04 02 42
 * @describe：
 **/
public interface SingletonBeanRegistry {


    Object getSingleton(String beanName);

}
