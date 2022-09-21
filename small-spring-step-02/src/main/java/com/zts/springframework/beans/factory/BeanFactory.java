package com.zts.springframework.beans.factory;

import com.zts.springframework.beans.BeansException;

/**
 * @Author zhangtusheng
 * @Date 2022 06 28 09 55
 * @describe：
 **/
public interface BeanFactory {

    Object getBean(String name) throws BeansException;
}
