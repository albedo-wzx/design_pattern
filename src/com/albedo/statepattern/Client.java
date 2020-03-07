package com.albedo.statepattern;

public class Client {
    static Context context=new Context();

    public static void main(String[] args) {
       context.setLifeState(new OpeningState());
       context.open();
       context.close();
       context.run();
       context.stop();
        System.out.println(context.getLifeState().getClass().getName());
    }
}
