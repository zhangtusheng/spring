package com.zts.springframework.core.io;

import com.zts.springframework.beans.BeansException;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author zhangtusheng
 * @Date 2022 09 20 23 55
 * @describe：
 **/
public interface Resource {

    InputStream getInputStream() throws IOException;
}
