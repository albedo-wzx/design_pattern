package com.albedo.adapter_pattern.object_adapter;

import java.util.Map;

/**
 * 适配类
 */
public class OuterUserInfo implements IUserInfo {
    private IOuterUserBaseInfo baseInfo;
    private IOuterUserHomeInfo homeInfo;
    private IOuterUserOfficeInfo officeInfo;

    private Map baseMap;

    private Map homeMap;
    private Map officeMap;
    //构造函数传递对象
    public OuterUserInfo(IOuterUserBaseInfo baseInfo, IOuterUserHomeInfo homeInfo, IOuterUserOfficeInfo officeInfo) {
        this.baseInfo = baseInfo;
        this.homeInfo = homeInfo;
        this.officeInfo = officeInfo;
        this.baseMap = this.baseInfo.getUserBaseInfo();
        this.homeMap = this.homeInfo.getUserHomeInfo();
        this.officeMap = this.officeInfo.getUserOfficeInfo();
    }

    @Override
    public String getUserName() {
        return (String) this.baseMap.get("username");
    }

    @Override
    public String getHomeAddress() {
        return (String) this.homeMap.get("homeAddress");

    }

    @Override
    public String getMobileNumber() {
        return (String) this.baseMap.get("mobileNumber");
    }

    @Override
    public String getOfficeTelNumber() {
        return (String) this.officeMap.get("officeTelNumber");
    }

    @Override
    public String getJobPosition() {
        return (String) this.officeMap.get("jobPosition");
    }

    @Override
    public String getHomeTelNumber() {
        return (String) this.homeMap.get("homeTelNumber");
    }
}
