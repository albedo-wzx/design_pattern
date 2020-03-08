package com.albedo.strategy_pattern;

/**
 * 具体的策略2
 */
public class ConcreteStrategy2 implements Strategy{
    @Override
    public void doSomething() {
        System.out.println("strategy 2 method");
    }
}
