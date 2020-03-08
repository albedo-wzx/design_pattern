package com.albedo.decorator_pattern.abstract_decorator;

/**
 * 抽象装饰者
 */
public abstract class Decorator extends Component {
    private Component component;

    //通过构造函数传递被修饰者
    public Decorator(Component component) {
        this.component = component;
    }

    //委托给被修饰着执行
    @Override
    public void operate() {
        this.component.operate();
    }
}
