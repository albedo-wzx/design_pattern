package com.albedo.adapter_pattern.class_adapter;

public class Client {
    public static void main(String[] args) {
        Target target=new ConcreteTarget();
        target.request();
        target=new Adapter();
        target.request();

    }
}
