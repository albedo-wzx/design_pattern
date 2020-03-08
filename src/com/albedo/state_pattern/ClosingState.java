package com.albedo.state_pattern;

public class ClosingState extends LifeState {
    @Override
    public void open() {
        super.context.setLifeState(Context.opening);
        super.context.getLifeState().open();
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭。。。");

    }

    @Override
    public void run() {
        super.context.setLifeState(Context.running);
        super.context.getLifeState().run();
    }

    @Override
    public void stop() {
        super.context.setLifeState(Context.stopping);
        super.context.getLifeState().stop();
    }
}
