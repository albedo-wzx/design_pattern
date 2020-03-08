package com.albedo.proxy_pattern.staticproxy.constraintproxy;


import java.time.LocalDate;
import java.time.LocalTime;

/**
 * 强制代理场景类
 */
public class Client {
    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayer("albedo");

        IGamePlayer proxy = gamePlayer.getProxy();
        proxy.login("Albedo", "albedo");

        proxy.killBoss();

        proxy.upgrade();

        System.out.println("完成时间是" + LocalDate.now() + " " + LocalTime.now());

    }
}
