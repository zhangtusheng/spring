package com.zts.springframework.beans;

/**
 * @Author zhangtusheng
 * @Date 2022 09 20 23 52
 * @describe：
 **/
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause){
        super(msg, cause);
    }
}
