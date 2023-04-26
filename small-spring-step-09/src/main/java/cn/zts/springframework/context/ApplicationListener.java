package cn.zts.springframework.context;

import java.util.EventListener;

/**
 * @Author zhangtusheng
 * @Date 2023 04 26 22 48
 * @describe：
 **/
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

    /**
     * Handle an application event.
     * @param event the event to respond to
     */
    void onApplicationEvent(E event);

}
