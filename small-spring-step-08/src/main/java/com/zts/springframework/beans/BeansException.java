package com.zts.springframework.beans;

/**
 * @Author zhangtusheng
 * @Date 2022 10 06 18 52
 * @describe：
 **/
public class BeansException extends RuntimeException{

    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}
