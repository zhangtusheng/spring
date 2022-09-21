package com.zts.springframework.core.io;

/**
 * @Author zhangtusheng
 * @Date 2022 07 03 15 13
 * @describe：
 **/
public interface ResourceLoader {

    String CLASS_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
