package com.zts.springframework.core.io;

/**
 * @Author zhangtusheng
 * @Date 2022 09 20 23 55
 * @describe：
 **/
public interface ResourceLoader {

    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
