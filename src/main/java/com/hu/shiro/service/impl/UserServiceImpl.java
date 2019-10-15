package com.hu.shiro.service.impl;

import com.hu.shiro.mapper.UserMapper;
import com.hu.shiro.model.User;
import com.hu.shiro.service.UserService;

import javax.annotation.Resource;

/**
 * @author hzq
 * @description UserService实现类
 * @date 2019/10/14
 */
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
}
