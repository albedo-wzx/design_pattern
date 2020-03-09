package com.albedo.adapter_pattern.object_adapter;

public class Client {
    public static void main(String[] args) {
        IOuterUserBaseInfo baseInfo=new OuterUserBaseInfo();
        IOuterUserHomeInfo homeInfo=new OuterUserHomeInfo();
        IOuterUserOfficeInfo officeInfo=new OuterUserOfficeInfo();

        IUserInfo userInfo=new OuterUserInfo(baseInfo,homeInfo,officeInfo);

        System.out.println(userInfo.getHomeAddress());
    }
}
