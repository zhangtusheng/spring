package com.zts.springframework.beans.factory;

/**
 * @Author zhangtusheng
 * @Date 2022 10 04 01 26
 * @describe：
 **/
public interface InitializingBean {

    /**
     * Bean 处理了属性填充后调用
     *
     * @throws Exception
     */
    void afterPropertiesSet() throws Exception;

}
