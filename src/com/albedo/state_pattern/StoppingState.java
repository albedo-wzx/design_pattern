package com.albedo.state_pattern;

public class StoppingState extends LifeState{
    @Override
    public void open() {
        super.context.setLifeState(Context.opening);
        super.context.getLifeState().open();
    }

    @Override
    public void close() {
        System.out.println("电梯关门了。。。");
    }

    @Override
    public void run() {
        super.context.setLifeState(Context.running);
        super.context.getLifeState().run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止了。。。");
    }
}
