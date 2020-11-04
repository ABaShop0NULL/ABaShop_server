package com.abashop.controller;

import com.abashop.exception.ServiceException;
import com.abashop.pojo.User;
import com.abashop.service.UserService;
import com.abashop.utils.RespUtil;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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

    //    登录
    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public RespUtil login(@RequestBody User user, HttpSession session) {
        if (userService.login(user) != null) {
            session.setAttribute("userName", user.getUserName());
            session.setMaxInactiveInterval(60 * 60 * 2);
            return new RespUtil("success", "匹配成功");
        }
        return new RespUtil("error", "匹配失败");
    }

    //    注册/更新
    @RequestMapping(value = "/user/save", method = RequestMethod.POST)
    public RespUtil userSave(@RequestBody User user, HttpSession session) {
        int result = 0;
        if (user.getUserId() == null) {//添加
            result = userService.register(user);
        } else {
            result = userService.userUpdate(user);
        }
        if (result == 1) {
            session.setAttribute("userName", user.getUserName());
            return new RespUtil("success", "操作成功");
        } else {
            throw new ServiceException(500, "出错");
        }
    }

    //    登出
    @RequestMapping("/logout")
    public RespUtil logout(HttpServletRequest request) {

        request.getSession().removeAttribute("userName");
        return new RespUtil("success", "退出登录");
    }
    /*
     * 信息更改：用户名，性别，密码，头像（文件上传,）,手机号
     * TODO：头像更新有点问题！！
     * 用户名更改时，商铺表也要同时更改
     * */
}
