package com.abashop.service;

import com.abashop.pojo.Order;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Date;
import java.util.List;


public interface OrderService {

    List<Order> showOrderList(Long userId);

    Order getOrderByOrderNumber(String orderNumber);

    //    int cancelOrders(List<Order> orders);
//    int confirmOrder(List<Order> orders);
//    updateByToPaySuccess(List<String> orderNumbers,Integer payType);
//    listOrdersDetailByOrder(Order order, Date startTime, Date endTime);
//    listOrdersDetailByOrderParam
    int deleteOrders(List<Long> orderIds, Long userId);

}
