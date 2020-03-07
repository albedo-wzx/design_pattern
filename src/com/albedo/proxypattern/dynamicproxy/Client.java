package com.albedo.proxypattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.time.LocalDate;
import java.time.LocalTime;

public class Client {
    public static void main(String[] args) {
        IGamePlayer player=new GamePlayer("albedo");
        InvocationHandler handler=new GamePlayerIH(player);
        System.out.println("开始时间是"+ LocalDate.now()+" "+ LocalTime.now());
        ClassLoader classLoader=player.getClass().getClassLoader();
        IGamePlayer proxy= (IGamePlayer) Proxy.newProxyInstance(classLoader,new Class[]{IGamePlayer.class},handler);

        proxy.login("albedo","albedo");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("完成时间是"+ LocalDate.now()+" "+ LocalTime.now());


    }
}
