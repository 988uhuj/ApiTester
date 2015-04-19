package com.netease.service;

import com.sun.javadoc.*;

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
            }
        }
        if (classes.length>0) {
        }
        System.out.println("ddd");
        return true;
    }
}
