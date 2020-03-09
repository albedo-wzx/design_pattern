package com.albedo.adapter_pattern.class_adapter;

public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        super.doSomething();
    }
}
