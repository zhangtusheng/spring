package com.zts.springframework.context.event;

/**
 * @Author zhangtusheng
 * @Date 2022 10 07 16 21
 * @describe：
 **/
public class ContextRefreshedEvent extends ApplicationContextEvent{
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public ContextRefreshedEvent(Object source) {
        super(source);
    }
}
