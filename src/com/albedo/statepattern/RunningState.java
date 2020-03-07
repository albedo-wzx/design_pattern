package com.albedo.statepattern;

public class RunningState extends LifeState{
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("电梯运行。。。");
    }

    @Override
    public void stop() {
        super.context.setLifeState(Context.stopping);
        super.context.getLifeState().stop();
    }
}
