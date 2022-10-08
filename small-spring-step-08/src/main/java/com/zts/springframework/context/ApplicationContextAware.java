package com.zts.springframework.context;

import com.zts.springframework.beans.BeansException;
import com.zts.springframework.beans.factory.Aware;

/**
 * @Author zhangtusheng
 * @Date 2022 10 07 16 12
 * @describe：
 **/
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
