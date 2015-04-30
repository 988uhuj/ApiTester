package com.netease.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hzchenjianfeng on 2015/4/30.
 */
public class ServiceBuilder {

    private List<Map> entityList;
    private List<Map> serviceList;
    private HashMap<String, Object> data;


    public void setEntityList(List<Map> entityList) {
        this.entityList = entityList;
    }

    public void setServiceList(List<Map> serviceList) {
        this.serviceList = serviceList;
    }

    public ServiceBuilder build(){
        data = new HashMap<>();
        data.put("entities", entityList);
        data.put("services", serviceList);
        return this;
    }

    public HashMap<String, Object> getData(){
        build();
        return data;
    }
}
