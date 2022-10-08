package com.zts.springframework.core.io;

/**
 * @Author zhangtusheng
 * @Date 2022 10 06 18 48
 * @describe：
 **/
public interface ResourceLoader {

    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
