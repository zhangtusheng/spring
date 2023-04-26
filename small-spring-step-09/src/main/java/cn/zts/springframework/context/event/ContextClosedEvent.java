package cn.zts.springframework.context.event;

/**
 * @Author zhangtusheng
 * @Date 2023 04 26 23 04
 * @describe：
 **/
public class ContextClosedEvent extends ApplicationContextEvent{

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ContextClosedEvent(Object source) {
        super(source);
    }

}
