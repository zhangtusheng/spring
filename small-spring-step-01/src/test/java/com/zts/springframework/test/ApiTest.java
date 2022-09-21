package com.zts.springframework.test;

import com.zts.springframework.BeanDefinition;
import com.zts.springframework.BeanFactory;
import com.zts.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @Author zhangtusheng
 * @Date 2022 06 28 01 14
 * @describe：
 **/
public class ApiTest {

    @Test
    public void test_BeanFactory() {
        // 1.初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2.注入bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
