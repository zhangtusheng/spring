import com.zts.springframework.context.support.ClassPathXmlApplicationContext;
import event.CustomEvent;
import org.junit.Test;

/**
 * @Author zhangtusheng
 * @Date 2022 10 07 17 20
 * @describe：
 **/
public class ApiTest {

    @Test
    public void test_event() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.publishEvent(new CustomEvent(applicationContext, 18826736141L,"成功了"));
        applicationContext.registerShutdownHook();
    }
}
