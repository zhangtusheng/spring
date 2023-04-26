package cn.zts.springframework.beans.factory.config;

/**
 * @Author zhangtusheng
 * @Date 2023 02 19 22 50
 * @describe：bean的引用
 **/
public class BeanReference {


    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
