package com.abashop.controller;

import com.abashop.enums.OrderStatus;
import com.abashop.exception.ServiceException;
import com.abashop.pojo.Order;
import com.abashop.pojo.UserAddr;
import com.abashop.service.OrderService;
import com.abashop.service.UserAddrService;
import com.abashop.utils.RespUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @ClassName OrderController
 * @Description 订单
 * @Author Zhang Qing
 * @Date 2020/11/5 10:44
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService service;
    @Resource
    private UserAddrService userAddrService;

    /*
     * 生成订单
     * 地址项
     * 店铺项
     * 商品项
     * return：订单信息*/
    /*@PostMapping("/confirm")
    public RespUtil confirm(@RequestBody Order order, HttpServletRequest servletRequest){
        Long userId = (Long) servletRequest.getSession().getAttribute("userId");
//        订单地址信息
        UserAddr userAddr = userAddrService.getAddress(order.getOrderId(),userId);

        return new RespUtil("success","生成订单");
    }*/

//    购物车结算

//    订单详情接口

//    取消订单


    @PutMapping("/receipt/{orderNumber}")
    public RespUtil receipt(@PathVariable("orderNumber") String orderNumber, HttpServletRequest servletRequest) {
        Long userId = (Long) servletRequest.getSession().getAttribute("userId");
        Order order = service.getOrderByOrderNumber(orderNumber);
        if (!Objects.equals(order.getUserId(), userId)) {
            throw new ServiceException(209321, "你没有权限获取该订单信息");
        }
        if (!Objects.equals(order.getStatus(), OrderStatus.CONSIGNMENT.value())) {
            throw new ServiceException(208813, "订单未发货，无法确认收货");
        }
        //    TODO 确认收货 有问题这里
        order.setStatus(OrderStatus.SUCCESS.value());
        return new RespUtil("success", "确认收货");
    }

    //    删除订单
    @DeleteMapping("/{orderNumber}")
    public RespUtil deleteOrder(@PathVariable("orderNumber") String orderNumber, HttpServletRequest servletRequest) {
        Long userId = (Long) servletRequest.getSession().getAttribute("userId");
        Order order = service.getOrderByOrderNumber(orderNumber);
        if (order == null) {
            throw new ServiceException(404, "订单不存在");
        }
        if (!Objects.equals(order.getUserId(), userId)) {
            throw new ServiceException(404, "无权访问");
        }
        if (!Objects.equals(order.getStatus(), OrderStatus.SUCCESS.value()) || !Objects.equals(order.getStatus(), OrderStatus.CLOSE.value())) {
            throw new ServiceException(404, "订单未完成或未关闭，无法删除订单");
        }
//        TODO 注意这里 删除订单
        service.deleteOrders(Arrays.asList(order.getOrderId()), userId);
        return new RespUtil("success", "删除订单");
    }

    //    获取订单数量
    @GetMapping("/orderCount")
    public int getOrderCount(HttpServletRequest servletRequest) {
        Long userId = (Long) servletRequest.getSession().getAttribute("userId");
        List<Order> orderList = service.showOrderList(userId);
        return orderList.size();

    }
}
