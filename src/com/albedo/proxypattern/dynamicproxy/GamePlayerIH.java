package com.albedo.proxypattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理逻辑
 */
public class GamePlayerIH implements InvocationHandler {
    Object obj;

    public GamePlayerIH(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result=method.invoke(this.obj,args);
        if(method.getName().equalsIgnoreCase("login")){
            System.out.println("有人在用我的账号登录！");
        }
        return result;
    }
}
