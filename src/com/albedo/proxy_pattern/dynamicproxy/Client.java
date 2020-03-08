package com.albedo.proxy_pattern.dynamicproxy;

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
        //登录
        proxy.login("albedo","albedo");
        //杀怪
        proxy.killBoss();
        //升级
        proxy.upgrade();
        System.out.println("完成时间是"+ LocalDate.now()+" "+ LocalTime.now());


    }
}
