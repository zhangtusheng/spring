package com.zts.springframework.core.io;

import cn.hutool.core.lang.Assert;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Author zhangtusheng
 * @Date 2022 07 03 15 30
 * @describe：
 **/
public class DefaultResourceLoader implements ResourceLoader{
    @Override
    public Resource getResource(String location) {
        Assert.notNull(location, "Location must not be null");
        if(location.startsWith(CLASS_URL_PREFIX)) {
            return new ClassPathResource(location.substring(CLASS_URL_PREFIX.length()));
        } else {
            try{
                URL url = new URL(location);
                return new UrlResource(url);
            } catch (MalformedURLException e){
                return new FileSystemResource(location);
            }
        }
    }
}
