package cn.zts.springframework.core.io;

/**
 * @Author zhangtusheng
 * @Date 2023 04 26 00 10
 * @describe：
 **/
public interface ResourceLoader {

    /**
     * Pseudo URL prefix for loading from the class path: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);

}
