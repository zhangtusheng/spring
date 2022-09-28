package com.zts.springframework.utils;

/**
 * @Author zhangtusheng
 * @Date 2022 09 20 23 54
 * @describe：
 **/
public class ClassUtils {

    public static ClassLoader getDefaultClassLoader(){
        ClassLoader cl = null;
        try{
            cl = Thread.currentThread().getContextClassLoader();
        } catch (Throwable ex) {

        }
        if (cl == null) {
            cl = ClassUtils.class.getClassLoader();
        }
        return cl;
    }
}
