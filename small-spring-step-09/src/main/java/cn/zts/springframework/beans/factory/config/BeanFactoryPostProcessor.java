package cn.zts.springframework.beans.factory.config;

import cn.zts.springframework.beans.BeansException;
import cn.zts.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @Author zhangtusheng
 * @Date 2023 02 19 22 50
 * @describe：BeanFactory的前后处理
 **/
public interface BeanFactoryPostProcessor {


    /**
     * 在所有的 BeanDefinition 加载完成后，实例化 Bean 对象之前，提供修改 BeanDefinition 属性的机制
     *
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
