package com.zts.springframework;

import com.zts.springframework.beans.PropertyValue;
import com.zts.springframework.beans.PropertyValues;
import com.zts.springframework.beans.UserDao;
import com.zts.springframework.beans.UserService;
import com.zts.springframework.beans.factory.config.BeanDefinition;
import com.zts.springframework.beans.factory.config.BeanReference;
import com.zts.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

import java.time.LocalDateTime;

/**
 * @Author zhangtusheng
 * @Date 2022 06 30 23 36
 * @describe：
 **/
public class ApiTest {

    @Test
    public void test_BeanFactory() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        beanFactory.registryBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        UserDao userDao = (UserDao) beanFactory.getBean("userDao");


        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId", "10001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registryBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService");

        userService.queryUserInfo();
    }

}
