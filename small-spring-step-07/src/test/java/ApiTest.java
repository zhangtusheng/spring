import bean.UserService;
import com.zts.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

/**
 * @Author zhangtusheng
 * @Date 2022 10 04 16 19
 * @describe：
 **/
public class ApiTest {

    @Test
    public void test_xml(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.registerShutdownHook();
        UserService userService = applicationContext.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果：" + result);
    }


    @Test
    public void test_hook() {
        Runtime.getRuntime().addShutdownHook(new Thread(()->{
            System.out.println("close!");
        }));
    }
}
