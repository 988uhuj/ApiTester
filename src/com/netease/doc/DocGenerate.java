package com.netease.doc;

import com.netease.service.FreeMarkerUtil;
import com.netease.service.ServiceBuilder;
import com.sun.javadoc.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by chenupt@gmail.com on 14-3-22.
 */
public class DocGenerate {
    public static boolean start(RootDoc rootDoc) {
        ClassDoc[] classes=rootDoc.specifiedClasses();
        for (ClassDoc aClass : classes) {
            System.out.println(aClass.name());
            System.out.println(aClass.commentText());
            System.out.println("method...");
            MethodDoc[] methods = aClass.methods();

            ServiceBuilder serviceBuilder = new ServiceBuilder();

            List<Map> serviceList = new ArrayList<>();
            for (MethodDoc method : methods) {
                System.out.println(method.commentText());
                System.out.println(method.returnType().typeName());
                for (Parameter parameter : method.parameters()) {
                    System.out.println(parameter.typeName());
                }
                for (Tag tag : method.tags()) {
                    System.out.println(tag.name());
                    System.out.println(tag.text());
                    System.out.println(tag.position());
                }

                Map serviceMap = new HashMap<>();
                serviceMap.put("name", method.name());
                serviceMap.put("comment", method.commentText());

                List<Map> params = new ArrayList<>();
                for (Parameter parameter : method.parameters()) {
                    Map map = new HashMap();
                    map.put("intro", "intro");
                    map.put("comment", "comment");
                    map.put("type", parameter.name());
                    map.put("defaultValue", "default");
                    params.add(map);
                }

                serviceList.add(serviceMap);
                serviceMap.put("params", params);
            }


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

            serviceBuilder.setServiceList(serviceList);
            FreeMarkerUtil.run(serviceBuilder);
        }
        System.out.println("ddd");
        return true;
    }
}
