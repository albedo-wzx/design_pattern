package com.albedo.proxy_pattern.dynamicproxyabstract;

import java.lang.reflect.InvocationHandler;

/**
 * 具体业务的动态代理
 */
public class SubjectDynamicProxy extends DynamicProxy{
    public static <T> T newProxyInstance(Subject subject){
        //获取ClassLoader
        ClassLoader classLoader=subject.getClass().getClassLoader();
        //获取接口数组
        Class<?>[] classes=subject.getClass().getInterfaces();
        //获得handler
        InvocationHandler handler=new MyInvocationHandler(subject);
        return newProxyInstance(classLoader,classes,handler);
    }
}
