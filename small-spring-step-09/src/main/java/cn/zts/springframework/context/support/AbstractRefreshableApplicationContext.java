package cn.zts.springframework.context.support;

import cn.zts.springframework.beans.BeansException;
import cn.zts.springframework.beans.factory.ConfigurableListableBeanFactory;
import cn.zts.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @Author zhangtusheng
 * @Date 2023 04 26 23 07
 * @describe：
 **/
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {

    private DefaultListableBeanFactory beanFactory;

    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }

    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }

}
