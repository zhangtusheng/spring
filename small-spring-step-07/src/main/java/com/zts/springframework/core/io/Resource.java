package com.zts.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author zhangtusheng
 * @Date 2022 10 03 00 34
 * @describe：
 **/
public interface Resource {

    InputStream getInputStream() throws IOException;
}
