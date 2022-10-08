package com.zts.springframework.beans.factory;

/**
 * @Author zhangtusheng
 * @Date 2022 10 06 21 45
 * @describe：
 **/
public interface FactoryBean<T> {

    T getObject() throws Exception;

    Class<?> getObjectType();

    boolean isSingleton();
}
