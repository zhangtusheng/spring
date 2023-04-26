package cn.zts.springframework.beans.factory;

/**
 * @Author zhangtusheng
 * @Date 2023 04 25 23 52
 * @describe：
 **/
public interface InitializingBean {

    /**
     * Bean 处理了属性填充后调用
     *
     * @throws Exception
     */
    void afterPropertiesSet() throws Exception;

}