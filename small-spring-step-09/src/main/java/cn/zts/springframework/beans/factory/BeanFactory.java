package cn.zts.springframework.beans.factory;

import cn.zts.springframework.beans.BeansException;

/**
 * @Author zhangtusheng
 * @Date 2023 02 19 22 44
 * @describe：
 **/
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

    <T> T getBean(String name, Class<T> requiredType) throws BeansException;
}
