package cn.zts.springframework.context;

/**
 * @Author zhangtusheng
 * @Date 2023 04 26 22 48
 * @describe：
 **/
public interface ApplicationEventPublisher {

    /**
     * Notify all listeners registered with this application of an application
     * event. Events may be framework events (such as RequestHandledEvent)
     * or application-specific events.
     * @param event the event to publish
     */
    void publishEvent(ApplicationEvent event);

}
