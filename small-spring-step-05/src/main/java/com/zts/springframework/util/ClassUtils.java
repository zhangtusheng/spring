package com.zts.springframework.util;

/**
 * @Author zhangtusheng
 * @Date 2022 07 02 09 28
 * @describe：
 **/
public class ClassUtils {

    public static ClassLoader getDefaultClassLoader() {
        ClassLoader cl = null;

        try{
            cl = Thread.currentThread().getContextClassLoader();
        } catch (Throwable e){

        }
        if (cl == null) {
            cl = ClassUtils.getDefaultClassLoader();
        }
        return cl;
    }

}
