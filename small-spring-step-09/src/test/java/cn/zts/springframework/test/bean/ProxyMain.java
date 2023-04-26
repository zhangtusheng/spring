package cn.zts.springframework.test.bean;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author zhangtusheng
 * @Date 2023 02 20 13 04
 * @describe：
 **/
public class ProxyMain {
    public static void main(String[] args) {
        cgliProxy();
    }

    private static void cgliProxy() {
        Target1 target1 = new Target1();
        Advice advice = new Advice();
        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(target1.getClass());

        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                advice.before();

                Object invoke = method.invoke(target1, objects);
                advice.after();

                return invoke;
            }
        });
        Target1 targetProxy = (Target1) enhancer.create();
        targetProxy.coreWork();
    }

    private static void jdkProxy() {
        Target target = new Target();

        Advice advice = new Advice();

        TargetInterface proxy = (TargetInterface)Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        advice.before();
                        Object invoke = method.invoke(target, args);
                        advice.after();

                        return invoke;
                    }
                }
        );
        proxy.coreWork();
    }
}
