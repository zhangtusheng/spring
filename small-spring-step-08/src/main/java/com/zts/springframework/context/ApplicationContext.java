package com.zts.springframework.context;

import com.zts.springframework.beans.factory.HierarchicalBeanFactory;
import com.zts.springframework.beans.factory.ListableBeanFactory;
import com.zts.springframework.core.io.ResourceLoader;

/**
 * @Author zhangtusheng
 * @Date 2022 10 07 13 52
 * @describe：
 **/
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}
