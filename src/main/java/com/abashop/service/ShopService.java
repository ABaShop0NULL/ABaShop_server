package com.abashop.service;

import com.abashop.pojo.Shop;
import com.abashop.pojo.User;
import com.abashop.utils.RespUtil;

/**
 * @ClassName ShopService
 * @Description 商铺接口抽象
 * @Author Zhang Qing
 * @Date 2020/11/2 14:22
 */
public interface ShopService {
    //查询
    Shop shopDetails(String userName);

    //插入
    int shopAdd(Shop shop);

    //    更新
    int shopUpdate(Shop shop);
    //商铺状态为-1时就是删除商铺
}
