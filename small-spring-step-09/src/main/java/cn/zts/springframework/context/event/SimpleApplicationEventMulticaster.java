package cn.zts.springframework.context.event;

import cn.zts.springframework.beans.factory.BeanFactory;
import cn.zts.springframework.context.ApplicationEvent;
import cn.zts.springframework.context.ApplicationListener;

/**
 * @Author zhangtusheng
 * @Date 2023 04 26 23 04
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
