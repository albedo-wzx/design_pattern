package com.albedo.state_pattern;

public class OpeningState extends LifeState{
    @Override
    public void open() {
        System.out.println("电梯门开启。。。");
    }

    @Override
    public void close() {
        super.context.setLifeState(Context.closing);
        super.context.getLifeState().close();
    }

    @Override
    public void run() {
        System.out.println("开门状态下不能运行");
    }

    @Override
    public void stop() {
        System.out.println("开门状态已经是停止状态了");
    }
}
