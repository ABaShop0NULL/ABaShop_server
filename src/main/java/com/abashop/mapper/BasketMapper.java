package com.abashop.mapper;

import com.abashop.pojo.Basket;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BasketMapper {
    int deleteByPrimaryKey(Long basketId);

    int insert(Basket record);

    int insertSelective(Basket record);

    Basket selectByPrimaryKey(Long basketId);

    int updateByPrimaryKeySelective(Basket record);

    int updateByPrimaryKey(Basket record);

    List<Basket> selectCartByUser(Long userId);

}