package com.zts.springframework.context.support;

import com.zts.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.zts.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @Author zhangtusheng
 * @Date 2022 10 07 17 08
 * @describe：
 **/
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations) {
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();
}
