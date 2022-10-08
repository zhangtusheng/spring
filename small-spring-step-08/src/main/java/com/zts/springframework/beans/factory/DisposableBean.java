package com.zts.springframework.beans.factory;

/**
 * @Author zhangtusheng
 * @Date 2022 10 06 21 45
 * @describe：
 **/
public interface DisposableBean {

    void destroy() throws Exception;
}
