package cn.zts.springframework.beans.factory.support;

import cn.zts.springframework.beans.BeansException;
import cn.zts.springframework.core.io.Resource;
import cn.zts.springframework.core.io.ResourceLoader;

/**
 * @Author zhangtusheng
 * @Date 2023 04 26 00 00
 * @describe：
 **/
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String... locations) throws BeansException;

}