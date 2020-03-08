package com.albedo.proxy_pattern.staticproxy;

import java.time.LocalDate;
import java.time.LocalTime;

public class Client {
    public static void main(String[] args) {
        IGamePlayer iGamePlayer=new GamePlayer("Albedo");
        IGamePlayer gamePlayerProxy=new GamePlayerProxy(iGamePlayer);

        System.out.println("开始时间是"+ LocalDate.now()+" "+ LocalTime.now());

        gamePlayerProxy.login("Albedo","albedo");

        gamePlayerProxy.killBoss();

        gamePlayerProxy.upgrade();

        System.out.println("完成时间是"+ LocalDate.now()+" "+ LocalTime.now());

    }
}
