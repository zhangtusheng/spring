package com.zts.springframework.context.event;

import com.zts.springframework.beans.factory.BeanFactory;
import com.zts.springframework.context.ApplicationEvent;
import com.zts.springframework.context.ApplicationListener;

/**
 * @Author zhangtusheng
 * @Date 2022 10 07 16 21
 * @describe：
 **/
public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster {

    public SimpleApplicationEventMulticaster(BeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void multicastEvent(final ApplicationEvent event) {
        for (final ApplicationListener listener : getApplicationListeners(event)) {
            listener.onApplicationEvent(event);
        }
    }

}
