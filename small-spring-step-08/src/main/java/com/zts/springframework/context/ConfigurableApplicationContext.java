package com.zts.springframework.context;

import com.zts.springframework.beans.BeansException;

/**
 * @Author zhangtusheng
 * @Date 2022 10 07 16 13
 * @describe：
 **/
public interface ConfigurableApplicationContext extends ApplicationContext{

    void refresh() throws BeansException;

    void registerShutdownHook();

    void close();
}
