package com.abashop.mapper;

import com.abashop.pojo.UserAddr;

public interface UserAddrMapper {
    int deleteByPrimaryKey(Long addId);

    int insert(UserAddr record);

    int insertSelective(UserAddr record);

    UserAddr selectByPrimaryKey(Long addId);

    int updateByPrimaryKeySelective(UserAddr record);

    int updateByPrimaryKey(UserAddr record);
}