package com.zts.springframework.context;

import com.zts.springframework.beans.BeansException;

/**
 * @Author zhangtusheng
 * @Date 2022 10 04 03 23
 * @describe：
 **/
public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;

    void registerShutdownHook();

    void close();

}
