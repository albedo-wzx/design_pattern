package com.albedo.statepattern;

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

    }

    @Override
    public void stop() {

    }
}
