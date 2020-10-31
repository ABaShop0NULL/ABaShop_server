package com.abashop.controller;

import com.abashop.Exception.ServiceException;
import com.abashop.pojo.User;
import com.abashop.service.UserService;
import com.abashop.utils.RespUtil;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName UserController
 * @Description 用户登录注册
 * @Author Zhang Qing
 * @Date 2020/10/31 18:10
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public RespUtil login(@RequestBody User user) {
        if (userService.login(user) != null) {
            return new RespUtil("success", "匹配成功");
        }
        return new RespUtil("error", "匹配失败");
    }

    @RequestMapping(value = "/user/register", method = RequestMethod.POST)
    public RespUtil register(@RequestBody User user) {
        if (userService.register(user) == 1) {
            return new RespUtil("success", "添加成功");
        } else {
            throw new ServiceException(500, "匹配出错");
        }
    }
}
