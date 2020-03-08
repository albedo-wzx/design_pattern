package com.albedo.proxy_pattern.staticproxy.commonproxy;


import java.util.Objects;

public class GamePlayer implements IGamePlayer {
    private String name;

    public GamePlayer(IGamePlayer iGamePlayer,String name) throws Exception{
        if (Objects.isNull(iGamePlayer)){
            throw new Exception("不能创建真实角色");
        }
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        System.out.println("登录名为" + user + "的用户" + this.name + "登录成功");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "在打怪！");

    }

    @Override
    public void upgrade() {
        System.out.println(this.name + "又升了一级！");
    }
}
