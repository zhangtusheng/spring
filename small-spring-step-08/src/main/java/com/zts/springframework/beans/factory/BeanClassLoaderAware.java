package com.zts.springframework.beans.factory;

/**
 * @Author zhangtusheng
 * @Date 2022 10 06 21 42
 * @describe：
 **/
public interface BeanClassLoaderAware extends Aware{

    void setBeanClassLoader(ClassLoader classLoader);
}
