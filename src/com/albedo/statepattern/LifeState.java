package com.albedo.statepattern;

public abstract class LifeState {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    //电梯门开启
    public abstract void open();
    //电梯门关闭
    public abstract void close();
    //电梯运行
    public abstract void run();
    //电梯停止
    public abstract void stop();
}
