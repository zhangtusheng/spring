package com.zts.springframework.context.support;

import com.zts.springframework.beans.BeansException;
import com.zts.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.zts.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @Author zhangtusheng
 * @Date 2022 09 20 23 55
 * @describe：
 **/
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext{

    private DefaultListableBeanFactory beanFactory;

    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }

    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }
}
