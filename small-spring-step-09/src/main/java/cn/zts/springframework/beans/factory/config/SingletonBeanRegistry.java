package cn.zts.springframework.beans.factory.config;

/**
 * @Author zhangtusheng
 * @Date 2023 02 19 22 51
 * @describe：单例注册表
 **/
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

    void registerSingleton(String beanName, Object singletonObject);
}
