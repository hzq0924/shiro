package com.hu.shiro.service;

import com.hu.shiro.model.User;

public interface UserService {

    User findByUsername(String username);
}
