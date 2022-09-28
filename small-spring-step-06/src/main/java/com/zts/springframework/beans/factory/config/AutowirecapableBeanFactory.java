package com.zts.springframework.beans.factory.config;

import com.zts.springframework.beans.BeansException;
import com.zts.springframework.beans.factory.BeanFactory;

/**
 * @Author zhangtusheng
 * @Date 2022 09 20 23 47
 * @describe：
 **/
public interface AutowirecapableBeanFactory extends BeanFactory {

    /**
     * 执行BeanPostProcessors 接口实现类的postProcessBeforeInitialization
     * @param existringBean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object applyBeanPostProcessorsBeforeInitialization(Object existringBean, String beanName) throws BeansException;

    /**
     * 执行BeanPostProcessors接口实现类的PostProcessorsAfterInitialization方法
     * @param existingBean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName) throws BeansException;
}
