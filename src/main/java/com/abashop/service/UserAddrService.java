package com.abashop.service;

import com.abashop.pojo.UserAddr;

import java.util.List;

/**
 * @ClassName UserAddrService
 * @Author ASUS
 * @Date 2020/11/9 16:31
 */
public interface UserAddrService {

    //    查询用户的收获地址
    List<UserAddr> getAddress(Long userId);

    //    增加收货地址
    int addAddress(UserAddr userAddr);

    //    更改收货地址
    int modifyAddress(UserAddr userAddr);

    //    删除收货地址
    int deleteAddress(Long addId);
}
