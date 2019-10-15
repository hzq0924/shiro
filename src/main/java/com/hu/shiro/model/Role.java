package com.hu.shiro.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @author hzq
 * @description 角色
 * @date 2019/10/14
 */
public class Role {

    private Integer rid;

    private String name;

    private Set<Permission> permissions = new HashSet<>();

    private Set<User> user = new HashSet<>();

    public Set<User> getUser() {
        return user;
    }

    public void setUser(Set<User> user) {
        this.user = user;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }
}
