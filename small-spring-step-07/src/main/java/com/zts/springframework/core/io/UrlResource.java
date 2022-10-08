package com.zts.springframework.core.io;

import cn.hutool.core.lang.Assert;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * @Author zhangtusheng
 * @Date 2022 10 03 00 34
 * @describe：
 **/
public class UrlResource implements Resource{

    private final URL url;

    public UrlResource(URL url) {
        Assert.notNull(url, "URL must not be null");
        this.url = url;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        URLConnection urlConnection = this.url.openConnection();
        try {
            return urlConnection.getInputStream();
        }catch (IOException e) {
            if (urlConnection instanceof HttpURLConnection) {
                ((HttpURLConnection) urlConnection).disconnect();
            }
            throw e;
        }
    }
}
