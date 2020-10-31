package com.abashop.mapper;

import com.abashop.pojo.Delivery;

public interface DeliveryMapper {
    int deleteByPrimaryKey(Long dvyId);

    int insert(Delivery record);

    int insertSelective(Delivery record);

    Delivery selectByPrimaryKey(Long dvyId);

    int updateByPrimaryKeySelective(Delivery record);

    int updateByPrimaryKey(Delivery record);
}