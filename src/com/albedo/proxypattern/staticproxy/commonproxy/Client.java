package com.albedo.proxypattern.staticproxy.commonproxy;


import java.time.LocalDate;
import java.time.LocalTime;

public class Client {
    public static void main(String[] args) {
        IGamePlayer gamePlayerProxy = new GamePlayerProxy("albedo");

        System.out.println("开始时间是" + LocalDate.now() + " " + LocalTime.now());

        gamePlayerProxy.login("Albedo", "albedo");

        gamePlayerProxy.killBoss();

        gamePlayerProxy.upgrade();

        System.out.println("完成时间是" + LocalDate.now() + " " + LocalTime.now());

    }
}
