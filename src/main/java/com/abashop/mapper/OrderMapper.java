package com.abashop.mapper;

import com.abashop.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    List<Order> selectOrder(Long userId);

    Order selectByOrderNumber(String OrderNumber);

    int deleteOrders(@Param("orderIds") List<Long> orderIds, @Param("userId") Long userId);
}