package com.zts.springframework.beans;

/**
 * @Author zhangtusheng
 * @Date 2022 10 03 14 44
 * @describe：
 **/
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}
