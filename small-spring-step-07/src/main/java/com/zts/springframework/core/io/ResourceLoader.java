package com.zts.springframework.core.io;

/**
 * @Author zhangtusheng
 * @Date 2022 10 03 00 34
 * @describe：
 **/
public interface ResourceLoader {

    String CLASS_PATH_PREFIX = "classpath:";

    Resource getResource(String location);
}
