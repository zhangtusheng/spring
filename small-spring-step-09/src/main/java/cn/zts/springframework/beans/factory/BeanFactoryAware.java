package cn.zts.springframework.beans.factory;

import cn.zts.springframework.beans.BeansException;

/**
 * @Author zhangtusheng
 * @Date 2023 02 19 22 47
 * @describe：
 **/
public interface BeanFactoryAware extends Aware{

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
