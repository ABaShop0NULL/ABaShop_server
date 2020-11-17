package com.abashop.service.impl;

import com.abashop.mapper.OrderMapper;
import com.abashop.pojo.Order;
import com.abashop.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName OrderServiceImpl
 * @Description TODO
 * @Author Zhang Qing
 * @Date 2020/11/16 10:11
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper mapper;


    @Override
    public List<Order> showOrderList(Long userId) {
        return mapper.selectOrder(userId);
    }

    @Override
    public Order getOrderByOrderNumber(String orderNumber) {
        return mapper.selectByOrderNumber(orderNumber);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteOrders(List<Long> orderIds, Long userId) {
        return mapper.deleteOrders(orderIds, userId);
    }

}
