package com.albedo.proxy_pattern.dynamicproxyabstract;

/**
 * 增强接口实现
 */
public class BeforeAdvice implements IAdvice{
    @Override
    public void exec() {
        System.out.println("前置处理逻辑被执行！");
    }
}
