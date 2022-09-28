package common;

import com.zts.springframework.beans.BeansException;
import com.zts.springframework.beans.PropertyValue;
import com.zts.springframework.beans.PropertyValues;
import com.zts.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.zts.springframework.beans.factory.config.BeanDefinition;
import com.zts.springframework.beans.factory.config.BeanFactoryPostProcessor;
import com.zts.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @Author zhangtusheng
 * @Date 2022 09 28 22 20
 * @describe：
 **/
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "改为：字节跳动"));
    }
}
