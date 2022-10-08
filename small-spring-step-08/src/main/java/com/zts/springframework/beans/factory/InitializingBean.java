package com.zts.springframework.beans.factory;

import com.zts.springframework.beans.BeansException;

/**
 * @Author zhangtusheng
 * @Date 2022 10 06 21 46
 * @describe：
 **/
public interface InitializingBean {

    void afterPropertiesSet() throws BeansException;
}
