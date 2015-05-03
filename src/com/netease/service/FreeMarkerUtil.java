package com.netease.service;


import com.netease.gen.DocGenerate;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

/**
 * @author hzchenjianfeng
 * @since 2015/3/24
 * Copyright 2015 NetEase. All rights reserved.
 */
public class FreeMarkerUtil {

    public static void run(ServiceBuilder serviceBuilder) {
        DocGenerate generate;
        Configuration cfg = new Configuration();
        try {
            System.out.println("write begin");
            cfg.setClassForTemplateLoading(FreeMarkerUtil.class, "/");
            cfg.setObjectWrapper(new DefaultObjectWrapper());
            Template service = cfg.getTemplate("services.ftl");
//            Template index = cfg.getTemplate("index.ftl");

            // File output
            Writer file = new FileWriter(toJSFileName(new File("./src-generate"), "services"));
            service.process(serviceBuilder.getData(), file);

//            Writer indexFile = new FileWriter(toJSFileName(new File("./src-generate"), "index"));
//            index.process(serviceBuilder.getData(), indexFile);

            file.flush();
            file.close();
//            indexFile.flush();
//            indexFile.close();
            System.out.println("write end");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    protected static File toJavaFileName(File outDirFile, String javaPackage, String javaClassName) {
        String packageSubPath = javaPackage.replace('.', '/');
        File packagePath = new File(outDirFile, packageSubPath);
        File file = new File(packagePath, javaClassName + ".java");
        file.getParentFile().mkdirs();
        return file;
    }

    protected static File toJSFileName(File outDirFile, String fileName) {
        File file = new File(outDirFile, fileName + ".js");
        file.getParentFile().mkdirs();
        return file;
    }

}
