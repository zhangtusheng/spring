package cn.zts.springframework.context;

import cn.zts.springframework.beans.BeansException;

/**
 * @Author zhangtusheng
 * @Date 2023 04 26 22 52
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
