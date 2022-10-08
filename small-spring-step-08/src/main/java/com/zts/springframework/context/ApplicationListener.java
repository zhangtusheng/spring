package com.zts.springframework.context;

import java.util.EventListener;

/**
 * @Author zhangtusheng
 * @Date 2022 10 07 16 12
 * @describe：
 **/
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

    void onApplicationEvent(E event);
}
