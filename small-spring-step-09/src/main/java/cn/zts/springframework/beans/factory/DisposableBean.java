package cn.zts.springframework.beans.factory;

/**
 * @Author zhangtusheng
 * @Date 2023 04 25 23 51
 * @describe：
 **/
public interface DisposableBean {

    void destroy() throws Exception;

}
