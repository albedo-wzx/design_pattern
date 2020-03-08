package com.albedo.decorator_pattern.abstract_decorator;

/**
 * 抽象构建的实际构建
 */
public class ConcreteComponent extends Component{
    @Override
    public void operate() {
        System.out.println("do something...");
    }
}
