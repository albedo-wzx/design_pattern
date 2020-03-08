package com.albedo.strategy_pattern;

/**
 * 具体的策略1
 */
public class ConcreteStrategy1 implements Strategy{
    @Override
    public void doSomething() {
        System.out.println("strategy 1 method");
    }
}
