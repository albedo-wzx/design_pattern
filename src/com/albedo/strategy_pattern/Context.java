package com.albedo.strategy_pattern;

/**
 * 策略的封装
 */
public class Context {
    //策略类
   private Strategy strategy;
    //策略类的引用
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doAnything(){
        this.strategy.doSomething();
    }
}
