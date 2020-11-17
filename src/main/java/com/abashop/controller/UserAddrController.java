package com.abashop.controller;

import com.abashop.mapper.UserAddrMapper;
import com.abashop.pojo.Goods;
import com.abashop.pojo.UserAddr;
import com.abashop.service.UserAddrService;
import com.abashop.utils.RespUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @ClassName UserAddrController
 * @Description 用户收货地址
 * @Author Zhang Qing
 * @Date 2020/11/9 16:30
 */
@RestController
@RequestMapping("/user/addr")
public class UserAddrController {

    @Resource
    private UserAddrService service;

    //    显示用户收获信息
    @GetMapping("/show")
    public RespUtil showAddr(HttpServletRequest servletRequest) {
        Long userId = (Long) servletRequest.getSession().getAttribute("userId");
        List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>();
        List<UserAddr> addrList = service.getAddressList(userId);
//        TODO 尝试序列化优化
        for (UserAddr addr : addrList) {
            Map<String, Object> map = new HashMap<>();
            map.put("addId", addr.getAddId());
            map.put("receiver", addr.getReceiver());
            map.put("province", addr.getProvince());
            map.put("city", addr.getCity());
            map.put("area", addr.getArea());
            map.put("post", addr.getPostCode());
            map.put("addr", addr.getAddr());//详细地址
            map.put("mobile", addr.getMobile());
            map.put("common_addr", addr.getCommonAddr());
            listMap.add(map);
        }
        return new RespUtil("success", "收获地址", addrList.size(), listMap);
    }

    //    用户添加收货地址
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public RespUtil saveAddr(UserAddr userAddr, HttpServletRequest servletRequest) {
        Long userId = (Long) servletRequest.getSession().getAttribute("userId");
        int result = 0;
        Date time = new Date();
        if (userAddr.getAddId() == null) {//添加
            userAddr.setUserId(userId);
            userAddr.setCreateTime(time);
            result = service.addAddress(userAddr);
        } else {
            userAddr.setUpdateTime(time);
            result = service.modifyAddress(userAddr);
        }
        if (result != 0) {
            return new RespUtil("success", "成功");
        }
        return new RespUtil("error", "发生错误");
    }

    //    删除收货地址 TODO 可能有问题
    @DeleteMapping("/{addId}")
    public RespUtil deleteAddress(@PathVariable("addId") Long addId) {

        if (service.deleteAddress(addId) != 0) {
            return new RespUtil("success", "成功");
        }
        return new RespUtil("error", "发生错误");
    }
}
