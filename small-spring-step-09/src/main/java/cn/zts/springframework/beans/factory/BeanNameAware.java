package cn.zts.springframework.beans.factory;

/**
 * @Author zhangtusheng
 * @Date 2023 02 19 22 48
 * @describe：
 **/
public interface BeanNameAware extends Aware {

    void setBeanName(String name);

}
