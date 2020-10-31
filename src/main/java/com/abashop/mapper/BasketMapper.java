package com.abashop.mapper;

import com.abashop.pojo.Basket;

public interface BasketMapper {
    int deleteByPrimaryKey(Long basketId);

    int insert(Basket record);

    int insertSelective(Basket record);

    Basket selectByPrimaryKey(Long basketId);

    int updateByPrimaryKeySelective(Basket record);

    int updateByPrimaryKey(Basket record);
}