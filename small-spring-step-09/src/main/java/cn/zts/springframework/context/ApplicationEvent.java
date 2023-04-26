package cn.zts.springframework.context;

import java.util.EventObject;

/**
 * @Author zhangtusheng
 * @Date 2023 04 26 22 52
 * @describe：
 **/
public abstract class ApplicationEvent extends EventObject {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationEvent(Object source) {
        super(source);
    }

}
