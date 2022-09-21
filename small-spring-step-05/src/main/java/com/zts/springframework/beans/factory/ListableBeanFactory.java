package com.zts.springframework.beans.factory;

import com.zts.springframework.beans.BeansException;

import java.util.Map;

/**
 * @Author zhangtusheng
 * @Date 2022 07 02 09 58
 * @describe：
 **/
public interface ListableBeanFactory extends BeanFactory{

    /**
     * 按照类型返回bean的实例
     * @param type
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * 返回注册表中所有bean名称。
     * @return
     */
    String[] getBeanDefinitionNames();
}
