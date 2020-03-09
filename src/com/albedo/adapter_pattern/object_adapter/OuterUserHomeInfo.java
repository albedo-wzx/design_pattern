package com.albedo.adapter_pattern.object_adapter;

import java.util.HashMap;
import java.util.Map;

public class OuterUserHomeInfo implements IOuterUserHomeInfo{
    @Override
    public Map getUserHomeInfo() {
        HashMap homeMap=new HashMap();
        homeMap.put("homeTelNumber","22222222222");
        homeMap.put("homeAddress","12345678987654321");

        return homeMap;
    }
}
