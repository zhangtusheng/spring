package com.zts.springframework.beans.factory;

import com.zts.springframework.beans.BeansException;

/**
 * @Author zhangtusheng
 * @Date 2022 10 06 21 42
 * @describe：
 **/
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

    <T> T getBean(String name, Class<T> requiredType) throws BeansException;
}
