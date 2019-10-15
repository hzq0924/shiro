package com.hu.shiro.model;

/**
 * @author hzq
 * @description 权限
 * @date 2019/10/14
 */
public class Permission {

    private Integer pid;

    private String name;

    private String url;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
