package cn.zts.springframework.context.event;

import cn.zts.springframework.context.ApplicationContext;
import cn.zts.springframework.context.ApplicationEvent;

/**
 * @Author zhangtusheng
 * @Date 2023 04 26 23 02
 * @describe：
 **/
public class ApplicationContextEvent extends ApplicationEvent {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationContextEvent(Object source) {
        super(source);
    }

    /**
     * Get the <code>ApplicationContext</code> that the event was raised for.
     */
    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext) getSource();
    }

}
