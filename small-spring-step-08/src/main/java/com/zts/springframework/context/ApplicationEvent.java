package com.zts.springframework.context;

import java.util.EventObject;

/**
 * @Author zhangtusheng
 * @Date 2022 10 07 16 12
 * @describe：
 **/
public abstract class ApplicationEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public ApplicationEvent(Object source) {
        super(source);
    }
}
