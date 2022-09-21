package com.zts.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author zhangtusheng
 * @Date 2022 06 28 01 10
 * @describe：use beanFactory to product bean
 **/
public class BeanFactory {


    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }
}
