package cn.zts.springframework.context;

import cn.zts.springframework.beans.factory.HierarchicalBeanFactory;
import cn.zts.springframework.beans.factory.ListableBeanFactory;
import cn.zts.springframework.core.io.ResourceLoader;

/**
 * @Author zhangtusheng
 * @Date 2023 04 26 22 46
 * @describe：
 **/
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}

