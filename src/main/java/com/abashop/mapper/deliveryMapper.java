package com.abashop.mapper;

import com.abashop.pojo.delivery;

public interface deliveryMapper {
    int deleteByPrimaryKey(Long dvyId);

    int insert(delivery record);

    int insertSelective(delivery record);

    delivery selectByPrimaryKey(Long dvyId);

    int updateByPrimaryKeySelective(delivery record);

    int updateByPrimaryKey(delivery record);
}