package com.zts.springframework.beans.factory;

import com.zts.springframework.beans.BeansException;

import java.util.Map;

/**
 * @Author zhangtusheng
 * @Date 2022 09 20 23 52
 * @describe：
 **/
public interface ListableBeanFactory extends BeanFactory{

    /**
     * 按照类型返回Bean 实例
     * @param type
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> Map<String, T> getBeanOfType(Class<T> type) throws BeansException;

    /**
     * 返回注册表中所有的Bean实例
     * @return
     */
    String[] getBeanDefinitionNames();
}
