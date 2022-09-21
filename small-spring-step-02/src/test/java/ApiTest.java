import bean.UserService;
import com.zts.springframework.beans.factory.config.BeanDefinition;
import com.zts.springframework.beans.factory.support.BeanDefinitionRegistry;
import com.zts.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

/**
 * @Author zhangtusheng
 * @Date 2022 06 29 00 12
 * @describe：
 **/
public class ApiTest {


    @Test
    public void test_BeanFactory() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        UserService userService1 = (UserService) beanFactory.getSingleton("userService");
        userService1.queryUserInfo();
    }
}
