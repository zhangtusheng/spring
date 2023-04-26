package cn.zts.springframework.context.event;

import cn.zts.springframework.context.ApplicationEvent;
import cn.zts.springframework.context.ApplicationListener;

/**
 * @Author zhangtusheng
 * @Date 2023 04 26 23 00
 * @describe：
 **/
public interface ApplicationEventMulticaster {

    /**
     * Add a listener to be notified of all events.
     *
     * @param listener the listener to add
     */
    void addApplicationListener(ApplicationListener<?> listener);

    /**
     * Remove a listener from the notification list.
     *
     * @param listener the listener to remove
     */
    void removeApplicationListener(ApplicationListener<?> listener);

    /**
     * Multicast the given application event to appropriate listeners.
     *
     * @param event the event to multicast
     */
    void multicastEvent(ApplicationEvent event);
}

