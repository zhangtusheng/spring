package com.zts.springframework.beans.factory.config;

/**
 * @Author zhangtusheng
 * @Date 2022 10 06 22 10
 * @describe：
 **/
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
