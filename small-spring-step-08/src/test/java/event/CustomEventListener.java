package event;

import com.zts.springframework.context.ApplicationListener;

import java.util.Date;

/**
 * @Author zhangtusheng
 * @Date 2022 10 07 17 40
 * @describe：
 **/
public class CustomEventListener implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println("收到： " + event.getSource() +"消息；时间： " + new Date());
        System.out.println("消息： " + event.getId() + ";" + event.getMessage());
    }
}
