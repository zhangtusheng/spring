package cn.zts.springframework.beans.factory.config;

import cn.zts.springframework.beans.BeansException;

/**
 * @Author zhangtusheng
 * @Date 2023 02 19 22 50
 * @describe：bean的前后置处理器，实现了这个才能给AutowireCapableBeanFactory扫描到
 **/
public interface BeanPostProcessor {

    /**
     * 在 Bean 对象执行初始化方法之前，执行此方法
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    /**
     * 在 Bean 对象执行初始化方法之后，执行此方法
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;
}
