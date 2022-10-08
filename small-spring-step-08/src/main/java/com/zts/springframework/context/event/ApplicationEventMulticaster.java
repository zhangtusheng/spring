package com.zts.springframework.context.event;

import com.zts.springframework.context.ApplicationEvent;
import com.zts.springframework.context.ApplicationListener;

/**
 * @Author zhangtusheng
 * @Date 2022 10 07 16 21
 * @describe：
 **/
public interface ApplicationEventMulticaster {

    /**
     * Add a listener to be notified of all events.
     * @param listener the listener to add
     */
    void addApplicationListener(ApplicationListener<?> listener);

    /**
     * Remove a listener from the notification list.
     * @param listener the listener to remove
     */
    void removeApplicationListener(ApplicationListener<?> listener);

    /**
     * Multicast the given application event to appropriate listeners.
     * @param event the event to multicast
     */
    void multicastEvent(ApplicationEvent event);
}
