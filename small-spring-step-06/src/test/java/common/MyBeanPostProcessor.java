package common;

import bean.UserService;
import com.zts.springframework.beans.BeansException;
import com.zts.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author zhangtusheng
 * @Date 2022 09 28 22 19
 * @describe：
 **/
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("userService".equals(beanName)) {
            UserService userService = (UserService) bean;
            userService.setLocation("改为：北京");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

}
