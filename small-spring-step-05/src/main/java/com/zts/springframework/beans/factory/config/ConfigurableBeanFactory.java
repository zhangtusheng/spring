package com.zts.springframework.beans.factory.config;

import com.zts.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * @Author zhangtusheng
 * @Date 2022 07 02 16 15
 * @describe：
 **/
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";
}
