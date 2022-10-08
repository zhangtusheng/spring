package com.zts.springframework.beans.factory;

import com.zts.springframework.beans.BeansException;

/**
 * @Author zhangtusheng
 * @Date 2022 10 06 21 42
 * @describe：
 **/
public interface BeanFactoryAware extends Aware{

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
