package com.abashop.service;

import com.abashop.pojo.User;

/**
 * @ClassName UserService
 * @Description 接口
 * @Author Zhang Qing
 * @Date 2020/10/31 18:12
 */
public interface UserService {
    User login(User user);

    int register(User user);

    int userUpdate(User user);
}
