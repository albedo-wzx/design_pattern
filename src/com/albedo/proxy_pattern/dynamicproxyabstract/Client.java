package com.albedo.proxy_pattern.dynamicproxyabstract;

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
        //定义主题的代理
//        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),
//                subject.getClass().getInterfaces(), handler);
        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
        //代理的行为
        proxy.doSomething("Finish");
    }
}
