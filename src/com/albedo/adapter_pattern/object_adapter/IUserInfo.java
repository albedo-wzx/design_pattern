package com.albedo.adapter_pattern.object_adapter;

/**
 * 内部封装类
 */
public interface IUserInfo {
    //获取用户姓名
    String getUserName();

    //获取家庭住址
    String getHomeAddress();

    //获取电话号码
    String getMobileNumber();

    //获取办公号码
    String getOfficeTelNumber();

    //获取办公地址
    String getJobPosition();

    //获取家庭号码
    String getHomeTelNumber();

}
