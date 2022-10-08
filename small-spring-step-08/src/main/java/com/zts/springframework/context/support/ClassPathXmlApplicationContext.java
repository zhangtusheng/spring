package com.zts.springframework.context.support;

import com.zts.springframework.beans.BeansException;

/**
 * @Author zhangtusheng
 * @Date 2022 10 07 17 14
 * @describe：
 **/
public class ClassPathXmlApplicationContext extends AbstractXmlApplicationContext{

    private String[] configLocations;

    public ClassPathXmlApplicationContext() {
    }

    public ClassPathXmlApplicationContext(String configLocations) throws BeansException{
        this(new String[]{configLocations});
    }

    public ClassPathXmlApplicationContext(String[] configLocations) throws BeansException{
        this.configLocations = configLocations;
        refresh();
    }



    @Override
    protected String[] getConfigLocations() {
        return configLocations;
    }
}
