package com.zts.springframework.beans.factory.config;

import com.zts.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * @Author zhangtusheng
 * @Date 2022 09 20 23 48
 * @describe：
 **/
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);
}
