package com.albedo.proxy_pattern.staticproxy.constraintproxy;


public class GamePlayer implements IGamePlayer {
    private String name;
    private IGamePlayer proxy;

    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return proxy;
    }

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {

        if (isProxy())
            System.out.println("登录名为" + user + "的用户" + this.name + "登录成功");
        else
            System.out.println("请使用指定的代理访问！");
    }

    @Override
    public void killBoss() {
        if (isProxy())
            System.out.println(this.name + "在打怪！");
        else
            System.out.println("请使用指定的代理访问！");
    }

    @Override
    public void upgrade() {
        if (isProxy())
            System.out.println(this.name + "又升了一级！");
        else
            System.out.println("请使用指定的代理访问！");
    }

    private boolean isProxy() {
        if (this.proxy == null) {
            return false;
        }
        return true;
    }
}
