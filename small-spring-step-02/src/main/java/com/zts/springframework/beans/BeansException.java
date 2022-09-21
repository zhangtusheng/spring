package com.zts.springframework.beans;

/**
 * @Author zhangtusheng
 * @Date 2022 06 28 09 55
 * @describe：
 **/
public class BeansException extends RuntimeException{

    public BeansException(String msg){
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
