package com.zts.springframework.beans.factory;

import com.zts.springframework.beans.BeansException;

import java.util.Map;

/**
 * @Author zhangtusheng
 * @Date 2022 10 06 21 46
 * @describe：
 **/
public interface ListableBeanFactory extends BeanFactory{

    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    String[] getBeanDefinitionNames();
}
