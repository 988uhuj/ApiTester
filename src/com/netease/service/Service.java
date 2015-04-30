package com.netease.service;

import java.util.List;

/**
 * Created by hzchenjianfeng on 2015/4/30.
 */
public class Service {

    private String name;
    private String comment;

    private List<Param> params;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<Param> getParams() {
        return params;
    }

    public void setParams(List<Param> params) {
        this.params = params;
    }
}
