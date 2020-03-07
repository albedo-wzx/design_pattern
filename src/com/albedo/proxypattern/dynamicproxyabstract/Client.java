package com.albedo.proxypattern.dynamicproxyabstract;

import java.lang.reflect.InvocationHandler;

/**
 * 场景类
 */
public class Client {
    public static void main(String[] args) {
        //定义一个主题
        Subject subject = new RealSubject();
        //定义一个handler
        InvocationHandler handler = new MyInvocationHandler(subject);
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(), handler);
        //代理的行为
        proxy.doSomething("Finish");
    }
}
