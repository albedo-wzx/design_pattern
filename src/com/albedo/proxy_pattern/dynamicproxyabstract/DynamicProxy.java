package com.albedo.proxy_pattern.dynamicproxyabstract;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理类
 * @param <T>
 */
public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler){
        if(true){
            new BeforeAdvice().exec();
        }
        return (T)Proxy.newProxyInstance(loader,interfaces,handler);
    }
}
