package cn.zts.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author zhangtusheng
 * @Date 2023 04 26 00 09
 * @describe：
 **/
public interface Resource {

    InputStream getInputStream() throws IOException;

}
