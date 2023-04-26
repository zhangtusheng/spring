package cn.zts.springframework.context.support;

import cn.zts.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.zts.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @Author zhangtusheng
 * @Date 2023 04 26 23 08
 * @describe：
 **/
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations){
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();

}
