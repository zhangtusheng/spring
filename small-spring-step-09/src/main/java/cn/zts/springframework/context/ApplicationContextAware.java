package cn.zts.springframework.context;

import cn.zts.springframework.beans.BeansException;
import cn.zts.springframework.beans.factory.Aware;

/**
 * @Author zhangtusheng
 * @Date 2023 04 26 22 50
 * @describe：
 **/
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;

}
