package com.abashop.service.impl;

import com.abashop.mapper.UserAddrMapper;
import com.abashop.pojo.UserAddr;
import com.abashop.service.UserAddrService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName UserAddrServiceImpl
 * @Author Zhang Qing
 * @Date 2020/11/9 16:31
 */
@Service
public class UserAddrServiceImpl implements UserAddrService {

    @Resource
    private UserAddrMapper mapper;

    @Override
    public List<UserAddr> getAddress(Long userId) {
        return mapper.selectByUser(userId);
    }

    @Override
    public int addAddress(UserAddr userAddr) {
        return mapper.insertSelective(userAddr);
    }

    @Override
    public int modifyAddress(UserAddr userAddr) {
        return mapper.updateByPrimaryKeySelective(userAddr);
    }

    @Override
    public int deleteAddress(Long addId) {
        return mapper.deleteByPrimaryKey(addId);
    }


}
