package com.zts.springframework.beans;

import java.util.LinkedList;

/**
 * @Author zhangtusheng
 * @Date 2022 09 20 23 52
 * @describe：
 **/
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(0);

    }
}
