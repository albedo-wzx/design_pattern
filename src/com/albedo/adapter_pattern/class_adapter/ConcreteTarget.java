package com.albedo.adapter_pattern.class_adapter;

/**
 * 目标角色适用类
 */
public class ConcreteTarget implements Target{
    @Override
    public void request() {
        System.out.println("if you need any help,please call me!");
    }
}
