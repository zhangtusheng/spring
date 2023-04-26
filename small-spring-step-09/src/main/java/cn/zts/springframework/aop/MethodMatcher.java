package cn.zts.springframework.aop;

import java.lang.reflect.Method;

/**
 * @Author zhangtusheng
 * @Date 2023 04 26 23 22
 * @describe：
 **/
public interface MethodMatcher {

    /**
     * Perform static checking whether the given method matches. If this
     * @return whether or not this method matches statically
     */
    boolean matches(Method method, Class<?> targetClass);

}
