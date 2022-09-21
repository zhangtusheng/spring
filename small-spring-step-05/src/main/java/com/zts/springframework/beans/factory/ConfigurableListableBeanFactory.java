package com.zts.springframework.beans.factory;

import com.zts.springframework.beans.factory.config.SingletonBeanRegistry;

/**
 * @Author zhangtusheng
 * @Date 2022 07 02 09 53
 * @describe：
 **/
public interface ConfigurableListableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";
}
