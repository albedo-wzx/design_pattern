package com.albedo.proxypattern.staticproxy.constraintproxy;

/**
 * 游戏玩游戏相关接口IGamePlayer
 */
public interface IGamePlayer {
    //游戏登录
    void login(String user, String password);
    //游戏杀怪
    void killBoss();
    //游戏升级
    void upgrade();
    //强制到代理的对象
    IGamePlayer getProxy();
}
