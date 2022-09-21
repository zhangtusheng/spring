package com.zts.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author zhangtusheng
 * @Date 2022 07 03 15 07
 * @describe：
 **/
public interface Resource {

    InputStream getInputStream() throws IOException;
}
