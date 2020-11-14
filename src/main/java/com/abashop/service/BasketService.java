package com.abashop.service;

import com.abashop.pojo.Basket;

import java.util.List;

/**
 * @ClassName BasketService
 * @Description TODO
 * @Author ASUS
 * @Date 2020/11/13 14:19
 */
public interface BasketService {

    List<Basket> showUserCart(Long userId);

    int addCartInfo(Basket basket);

    int modifyCartInfo(Basket basket);

//    int deleteCartInfo();
}
