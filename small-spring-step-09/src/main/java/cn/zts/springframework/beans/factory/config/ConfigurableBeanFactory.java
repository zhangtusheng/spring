package cn.zts.springframework.beans.factory.config;

import cn.zts.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * @Author zhangtusheng
 * @Date 2023 02 19 22 50
 * @describe：
 **/
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";


    // 添加beanFactory的处理器
    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    /**
     * 销毁单例对象
     */
    void destroySingletons();

}
