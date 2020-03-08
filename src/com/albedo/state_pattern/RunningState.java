package com.albedo.state_pattern;

public class RunningState extends LifeState{
    @Override
    public void open() {
        System.out.println("运行状态不能开门。。。");
    }

    @Override
    public void close() {

        System.out.println("运行状态已经是关门状态。。。");
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
