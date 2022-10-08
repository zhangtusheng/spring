package com.zts.springframework.util;

/**
 * @Author zhangtusheng
 * @Date 2022 10 03 00 16
 * @describe：
 **/
public class ClassUtils {

    public static ClassLoader getDefaultClassLoader() {
        ClassLoader cl = null;
        try {
            cl = Thread.currentThread().getContextClassLoader();
        } catch (Throwable e) {

        }
        if (cl == null) {
            cl = ClassUtils.class.getClassLoader();
        }
        return cl;
    }
}
