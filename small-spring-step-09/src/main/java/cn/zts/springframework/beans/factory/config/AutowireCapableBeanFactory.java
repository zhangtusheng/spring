package cn.zts.springframework.beans.factory.config;

import cn.zts.springframework.beans.BeansException;
import cn.zts.springframework.beans.factory.BeanFactory;

/**
 * @Author zhangtusheng
 * @Date 2023 02 19 22 49
 * @describe：这个是用来挂Bean的前后处理器的。
 **/
public interface AutowireCapableBeanFactory extends BeanFactory {


    /**
     * 执行 BeanPostProcessors 接口实现类的 postProcessBeforeInitialization 方法
     *
     * @param existingBean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName) throws BeansException;

    /**
     * 执行 BeanPostProcessors 接口实现类的 postProcessorsAfterInitialization 方法
     *
     * @param existingBean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName) throws BeansException;

}
