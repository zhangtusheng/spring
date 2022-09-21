package com.zts.springframework.beans.factory.config;


/**
 * @Author zhangtusheng
 * @Date 2022 06 30 22 21
 * @describe：单例注册表
 **/
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
