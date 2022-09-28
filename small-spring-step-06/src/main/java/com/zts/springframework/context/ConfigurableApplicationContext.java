package com.zts.springframework.context;

import com.zts.springframework.beans.BeansException;

/**
 * @Author zhangtusheng
 * @Date 2022 09 20 23 53
 * @describe：
 **/
public interface ConfigurableApplicationContext extends ApplicationContext{

    /**
     * 刷新启动容器
     * @throws BeansException
     */
    void refresh() throws BeansException;
}
