package com.albedo.proxy_pattern.staticproxy;

/**
 * 游戏代理类
 */
public class GamePlayerProxy implements IGamePlayer ,IProxy{
    //代理的对象
    private IGamePlayer iGamePlayer;
    //初始化代理的对象
    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.iGamePlayer = gamePlayer;
    }

    @Override
    public void login(String user, String password) {
        this.iGamePlayer.login(user, password);

    }

    @Override
    public void killBoss() {
        this.iGamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.iGamePlayer.upgrade();
        this.count();
    }

    @Override
    public void count() {
        System.out.println("升级总费用是150元！");
    }
}
