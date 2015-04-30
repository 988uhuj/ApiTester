package com.netease.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by chenupt@gmail.com on 14-3-22.
 */
public class Generate {

    public static void main(String[] args) {

        ServiceBuilder serviceBuilder = new ServiceBuilder();

        List<Map> serviceList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Map serviceMap = new HashMap();
            serviceMap.put("name", "serviceName" + i);
            serviceMap.put("comment", "comment" + i);

            List<Map> params = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                Map map = new HashMap();
                map.put("intro", "intro" + j);
                map.put("comment", "comment" + j);
                map.put("type", "type" + j);
                map.put("defaultValue", "default" + j);
                params.add(map);
            }

            serviceList.add(serviceMap);
            serviceMap.put("params", params);
        }
        serviceBuilder.setServiceList(serviceList);

        List<Map> entityList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Map serviceMap = new HashMap();
            serviceMap.put("name", "serviceName" + i);
            serviceMap.put("comment", "comment" + i);

            List<Map> params = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                Map map = new HashMap();
                map.put("intro", "intro" + j);
                map.put("comment", "comment" + j);
                map.put("type", "type" + j);
                map.put("defaultValue", "default" + j);
                params.add(map);
            }

            entityList.add(serviceMap);
            serviceMap.put("params", params);
        }
        serviceBuilder.setEntityList(entityList);

        FreeMarkerUtil.run(serviceBuilder);
    }
}
