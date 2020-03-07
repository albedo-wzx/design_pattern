package com.albedo.proxypattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理逻辑
 */
public class GamePlayerIH implements InvocationHandler {
    Class clazz;
    Object obj;

    public GamePlayerIH(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result=method.invoke(this.obj,args);
        return result;
    }
}
