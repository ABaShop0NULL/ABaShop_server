package com.abashop.service.impl;

import com.abashop.mapper.UserMapper;
import com.abashop.pojo.User;
import com.abashop.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName UserServiceImpl
 * @Description service实现层
 * @Author Zhang Qing
 * @Date 2020/10/31 18:13
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        return userMapper.selectByUser(user);
    }

    @Override
    public int register(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public int userUpdate(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public User findUserById(Long userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public User findUserInfo(User user) {
        return userMapper.selectForLogin(user);
    }

}
