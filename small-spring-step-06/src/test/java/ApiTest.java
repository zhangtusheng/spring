import bean.UserService;
import com.zts.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.zts.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.zts.springframework.context.support.ClassPathXmlApplicationContext;
import common.MyBeanFactoryPostProcessor;
import common.MyBeanPostProcessor;
import org.junit.Test;

/**
 * @Author zhangtusheng
 * @Date 2022 09 28 22 22
 * @describe：
 **/
public class ApiTest {

    @Test
    public void test_BeanFactoryPostProcessorAndBeanPostProcessor() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("classpath:spring.xml");
        MyBeanFactoryPostProcessor myBeanFactoryPostProcessor = new MyBeanFactoryPostProcessor();
        myBeanFactoryPostProcessor.postProcessBeanFactory(beanFactory);
        MyBeanPostProcessor myBeanPostProcessor = new MyBeanPostProcessor();
        beanFactory.addBeanPostProcessor(myBeanPostProcessor);
        UserService userService = beanFactory.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果：" + result);
    }



    @Test
    public void test_xml() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:springPostProcessor.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果： " + result);
    }
}
