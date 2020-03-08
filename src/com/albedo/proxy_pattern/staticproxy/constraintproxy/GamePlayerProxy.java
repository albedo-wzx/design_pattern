package com.albedo.proxy_pattern.staticproxy.constraintproxy;



/**
 * 游戏代理类
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer iGamePlayer;
    public GamePlayerProxy(IGamePlayer iGamePlayer) {
        this.iGamePlayer=iGamePlayer;
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
    }

    @Override
    public IGamePlayer getProxy() {
        return this;
    }
}
