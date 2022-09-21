package com.zts.springframework;

/**
 * @Author zhangtusheng
 * @Date 2022 06 28 01 09
 * @describe：bean's infomation
 **/
public class BeanDefinition {


    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

}
