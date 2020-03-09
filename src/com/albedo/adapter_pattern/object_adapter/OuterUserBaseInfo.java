package com.albedo.adapter_pattern.object_adapter;

import java.util.HashMap;
import java.util.Map;

public class OuterUserBaseInfo implements IOuterUserBaseInfo{
    @Override
    public Map getUserBaseInfo() {
        HashMap baseMap=new HashMap();
        baseMap.put("username","员工名称");
        baseMap.put("mobileNumber","111111111111");

        return baseMap;
    }
}
