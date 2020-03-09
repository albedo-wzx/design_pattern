package com.albedo.adapter_pattern.object_adapter;

import java.util.HashMap;
import java.util.Map;

public class OuterUserOfficeInfo implements IOuterUserOfficeInfo{
    @Override
    public Map getUserOfficeInfo() {
        HashMap officeMap=new HashMap();
        officeMap.put("jopPosition","22222222222");
        officeMap.put("officeTelNumber","12345678987654321");

        return officeMap;
    }
}
