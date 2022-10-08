package event;

import com.zts.springframework.context.ApplicationListener;
import com.zts.springframework.context.event.ContextClosedEvent;

/**
 * @Author zhangtusheng
 * @Date 2022 10 07 17 41
 * @describe：
 **/
public class ContextClosedEventListener implements ApplicationListener<ContextClosedEvent> {
    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("关闭事件： " + this.getClass().getName());
    }
}
