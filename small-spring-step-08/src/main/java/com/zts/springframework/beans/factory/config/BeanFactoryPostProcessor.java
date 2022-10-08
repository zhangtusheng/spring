package com.zts.springframework.beans.factory.config;

import com.zts.springframework.beans.BeansException;
import com.zts.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @Author zhangtusheng
 * @Date 2022 10 06 22 10
 * @describe：
 **/
public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;

}
