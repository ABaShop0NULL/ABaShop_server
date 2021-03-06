package com.abashop.mapper;

import com.abashop.pojo.UserAddr;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserAddrMapper {
    int deleteByPrimaryKey(Long addId);

    int insert(UserAddr record);

    int insertSelective(UserAddr record);

    UserAddr selectByPrimaryKey(Long addId);

    int updateByPrimaryKeySelective(UserAddr record);

    int updateByPrimaryKey(UserAddr record);

    List<UserAddr> selectByUser(Long userId);

    UserAddr selectAddrByUser(Long addId, Long userId);
}