package com.zts.springframework.context;

/**
 * @Author zhangtusheng
 * @Date 2022 10 07 16 12
 * @describe：
 **/
public interface ApplicationEventPublisher {

    void publishEvent(ApplicationEvent event);
}
