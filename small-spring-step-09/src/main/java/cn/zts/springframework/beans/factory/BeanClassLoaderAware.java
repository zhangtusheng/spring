package cn.zts.springframework.beans.factory;

/**
 * @Author zhangtusheng
 * @Date 2023 02 19 22 46
 * @describe：
 **/
public interface BeanClassLoaderAware extends Aware{

    void setBeanClassLoader(ClassLoader classLoader);
}
