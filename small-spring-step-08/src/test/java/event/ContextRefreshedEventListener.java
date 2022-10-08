package event;

import com.zts.springframework.context.ApplicationListener;
import com.zts.springframework.context.event.ContextRefreshedEvent;

/**
 * @Author zhangtusheng
 * @Date 2022 10 07 17 43
 * @describe：
 **/
public class ContextRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("刷新事件： " + this.getClass().getName());
    }
}
