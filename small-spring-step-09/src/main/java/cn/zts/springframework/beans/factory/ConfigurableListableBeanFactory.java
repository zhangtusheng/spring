package cn.zts.springframework.beans.factory;

import cn.zts.springframework.beans.BeansException;
import cn.zts.springframework.beans.factory.config.AutowireCapableBeanFactory;
import cn.zts.springframework.beans.factory.config.BeanDefinition;
import cn.zts.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @Author zhangtusheng
 * @Date 2023 04 25 23 50
 * @describe：
 **/
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

}
