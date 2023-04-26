package cn.zts.springframework.aop;

/**
 * @Author zhangtusheng
 * @Date 2023 04 26 23 24
 * @describe：
 **/
public interface Pointcut {

    /**
     * Return the ClassFilter for this pointcut.
     *
     * @return the ClassFilter (never <code>null</code>)
     */
    ClassFilter getClassFilter();

    /**
     * Return the MethodMatcher for this pointcut.
     *
     * @return the MethodMatcher (never <code>null</code>)
     */
    MethodMatcher getMethodMatcher();

}