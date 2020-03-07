package com.albedo.statepattern;

public class Client {
    static Context context = new Context();

    public static void main(String[] args) {
        context.setLifeState(new ClosingState());
        context.close();
        context.open();
        context.run();
        context.stop();
        System.out.println(context.getLifeState().getClass().getName());
    }
}
