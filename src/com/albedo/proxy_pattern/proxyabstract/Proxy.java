package com.albedo.proxy_pattern.proxyabstract;

/**
 * 代理类，代理主业务对象
 */
public class Proxy implements Subject{
    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        try {
            this.before();
            this.subject.request();
            this.after();
        } catch (Exception e) {
            this.execption();
        }

    }
    //预处理
    public void before(){

    }
    //完成主体逻辑后处理
    public void after(){

    }
    //异常处理
    public void execption(){

    }
}
