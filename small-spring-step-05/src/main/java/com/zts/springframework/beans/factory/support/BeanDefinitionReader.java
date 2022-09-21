package com.zts.springframework.beans.factory.support;

import com.zts.springframework.beans.BeansException;
import com.zts.springframework.core.io.Resource;
import com.zts.springframework.core.io.ResourceLoader;

/**
 * @Author zhangtusheng
 * @Date 2022 07 03 14 52
 * @describe：
 **/
public interface BeanDefinitionReader {


    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

}
