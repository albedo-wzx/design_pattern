package com.albedo.proxy_pattern.staticproxy.commonproxy;


/**
 * 游戏代理类
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer iGamePlayer;
    //通过构造函数传递要对谁进行代理
    public GamePlayerProxy(String name) {
        try {
            iGamePlayer=new GamePlayer(this,name);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
}
