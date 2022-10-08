package com.zts.springframework.context.event;

import com.zts.springframework.context.ApplicationContext;
import com.zts.springframework.context.ApplicationEvent;

/**
 * @Author zhangtusheng
 * @Date 2022 10 07 16 21
 * @describe：
 **/
public class ApplicationContextEvent extends ApplicationEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public ApplicationContextEvent(Object source) {
        super(source);
    }

    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext) getSource();
    }
}
